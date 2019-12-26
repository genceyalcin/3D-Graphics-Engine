package utility3d;

import java.awt.event.KeyEvent;
import java.util.ArrayList;

import com.genceyalcin.engine.GameContainer;

public class World {

	private ArrayList<Mesh> meshList;

	private final double SPEED = 0.1;
	private final double TURN_SPEED = 0.025;

	private GameContainer gc;

	public World(GameContainer gc) {
		this.gc = gc;
		Mesh cube = new Shapes().createCube();
		cube.setPosition(0, 0, 1);

		meshList = new ArrayList<Mesh>();
		meshList.add(cube);

	}

	public void update() {
		if (gc.getInput().isKey(KeyEvent.VK_W)) {
			moveForward();
		}
		if (gc.getInput().isKey(KeyEvent.VK_S)) {
			moveBackward();
		}
		if (gc.getInput().isKey(KeyEvent.VK_A)) {
			moveLeft();
		}
		if (gc.getInput().isKey(KeyEvent.VK_D)) {
			moveRight();
		}
		if (gc.getInput().isKey(KeyEvent.VK_RIGHT)) {
			turnRight();
		}
		if (gc.getInput().isKey(KeyEvent.VK_LEFT)) {
			turnLeft();
		}
		if (gc.getInput().isKey(KeyEvent.VK_SPACE)) {
			jump();
		}
		if (gc.getInput().isKey(KeyEvent.VK_SHIFT)) {
			duck();
		}
		// meshList.get(0).rotateMeshYLocal(0.01);
	}

	private void jump() {
		for (Mesh m : meshList) {
			m.translateMesh(0, SPEED, 0);
		}
	}

	private void duck() {
		for (Mesh m : meshList) {
			m.translateMesh(0, -SPEED, 0);
		}
	}

	public void render() {
		for (Mesh m : meshList) {
			m.drawMesh(gc);
		}
	}

	private void turnRight() {
		for (Mesh m : meshList) {
			m.rotateMeshYGlobal(-TURN_SPEED);
		}
	}

	private void turnLeft() {
		for (Mesh m : meshList) {
			m.rotateMeshYGlobal(TURN_SPEED);
		}
	}

	private void moveForward() {
		for (Mesh m : meshList) {
			m.translateMesh(0, 0, -SPEED);
		}
	}

	private void moveBackward() {
		for (Mesh m : meshList) {
			m.translateMesh(0, 0, SPEED);
		}
	}

	private void moveRight() {
		for (Mesh m : meshList) {
			m.translateMesh(-SPEED, 0, 0);
		}
	}

	private void moveLeft() {
		for (Mesh m : meshList) {
			m.translateMesh(SPEED, 0, 0);
		}
	}
}
