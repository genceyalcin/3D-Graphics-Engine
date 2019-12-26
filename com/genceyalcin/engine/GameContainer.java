package com.genceyalcin.engine;

import utility3d.Shapes;
import utility3d.World;

/**
 * Contains the Main Thread and loop for the Engine
 * 
 * @author genceyalcin
 * @version 5.19.2019
 */
public class GameContainer implements Runnable {

	// FIELDS ----------------------------------

	private Thread mainThread;
	private boolean running = false;

	private double frameTime = 0;
	private int frames = 0;
	private int fps = 0;

	private final double UPDATE_MAX = 1.0 / 60.0;

	private int width;
	private int height;
	private float scale;
	private String title;

	private Window window;
	private Renderer renderer;
	private Input input;
	
	private World world;

	// CONSTRUCTOR ------------------------------

	/**
	 * Constructs a GameContainer with a width, height, scale and title
	 * 
	 * @param w
	 *            Desired width for Window
	 * @param h
	 *            Desired height for Window
	 * @param s
	 *            Desired scale for Window
	 * @param t
	 *            Desired title for Window
	 */
	public GameContainer(int w, int h, float s, String t) {
		width = w;
		height = h;
		scale = s;
		title = t;
	}

	// METHODS ----------------------------------

	/**
	 * Starts main thread.
	 */
	public void start() {
		window = new Window(this);
		renderer = new Renderer(this);
		input = new Input(this);
		world = new World(this);

		mainThread = new Thread(this);
		mainThread.run();
	}

	public void stop() {

	}

	/**
	 * Contains the main loop of the engine
	 */
	public void run() {
		running = true;

		// Time variables
		double first = 0;
		double last = System.nanoTime() / Math.pow(10, 9);
		double dt = 0;
		double unprocessed = 0;

		// Render variable
		boolean render = false;

		// If the game is running, loop
		while (running) {

			render = false; // Reset rendering status

			// Calculate passed time
			first = System.nanoTime() / Math.pow(10, 9);
			dt = first - last;
			last = first;

			unprocessed += dt;
			frameTime += dt;

			// Check how much unprocessed time has passed
			// Update if necessary
			if (unprocessed >= UPDATE_MAX) {
				unprocessed -= UPDATE_MAX;
				render = true;
				update();
			}

			// If rendering is necessary, then render
			// Else, attempt to sleep
			if (render) {
				render();
			} else {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

		dispose();
	}

	// UPDATE AND RENDER FUNCTIONS ---------------

	private void update() {
		if (frameTime >= 1.0) {
			frameTime = 0;
			fps = frames;
			frames = 0;
			System.out.println("FPS: " + fps);
		}
		
		world.update();
		input.update();
	}

	private void render() {
		frames++;
		renderer.clear();
		world.render();
		window.update();
	}

	private void dispose() {

	}

	// GETTERS AND SETTERS -----------------------

	/**
	 * Get's the window width
	 * 
	 * @return width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * Get's the window height
	 * 
	 * @return height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * Get's the window scale
	 * 
	 * @return scale
	 */
	public float getScale() {
		return scale;
	}

	/**
	 * Get's the window title
	 * 
	 * @return title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Get's the window
	 * 
	 * @return window
	 */
	public Window getWindow() {
		return window;
	}

	/**
	 * Get's the renderer
	 * 
	 * @return renderer
	 */
	public Renderer getRenderer() {
		return renderer;
	}
	
	/**
	 * Get's the input
	 * 
	 * @return input
	 */
	public Input getInput() {
		return input;
	}
	
	/**
	 * Get's the world
	 * 
	 * @return world
	 */
	public World getWorld() {
		return world;
	}

	// MAIN --------------------------------------

	public static void main(String[] args) {
		GameContainer game = new GameContainer(390, 240, 2f, "3D Engine v1.0");
		game.start();

	}

}
