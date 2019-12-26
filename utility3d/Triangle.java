package utility3d;

import com.genceyalcin.engine.GameContainer;
import com.genceyalcin.misc.Vector3D;

public class Triangle {
	
	public Vector3D v1;
	public Vector3D v2;
	public Vector3D v3;
	
	public Triangle (Vector3D v1, Vector3D v2, Vector3D v3) {
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}
	
	public void draw(GameContainer gc) {
		double x1 = gc.getWidth() * 0.5 + gc.getHeight() * 0.25 * v1.x / v1.z;
		double x2 = gc.getWidth() * 0.5 + gc.getHeight() * 0.25 * v2.x / v2.z;
		double x3 = gc.getWidth() * 0.5 + gc.getHeight() * 0.25 * v3.x / v3.z;
		
		double y1 = gc.getHeight() * 0.5 + gc.getHeight() * 0.25 * v1.y / v1.z;
		double y2 = gc.getHeight() * 0.5 + gc.getHeight() * 0.25 * v2.y / v2.z;
		double y3 = gc.getHeight() * 0.5 + gc.getHeight() * 0.25 * v3.y / v3.z;
		
		gc.getRenderer().drawTriangle((int)x1, (int)y1, (int)x2, (int)y2, (int)x3, (int)y3);
	}
	
}
