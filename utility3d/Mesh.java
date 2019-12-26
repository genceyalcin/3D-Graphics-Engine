package utility3d;

import java.util.ArrayList;

import com.genceyalcin.engine.GameContainer;
import com.genceyalcin.misc.Vector3D;

public class Mesh {
	// Fields
	private ArrayList<Triangle> triangles;
	private Vector3D pivot;

	// Constructor
	public Mesh(ArrayList<Triangle> triangles) {
		this.triangles = triangles;
		this.pivot = triangles.get(0).v1;
	}

	public void drawMesh(GameContainer gc) {
		for (Triangle tri : triangles) {
			
			Vector3D normal = (tri.v1.subtractToNew(tri.v2)).crossToNew((tri.v1.subtractToNew(tri.v3)));
			
			if(tri.v1.z > 0 && tri.v2.z > 0 && tri.v3.z > 0 && normal.z <= 0 && tri.v1.dot(normal) < 0)
				tri.draw(gc);
		}
	}

	public void translateMesh(double dx, double dy, double dz) {
		for (Triangle tri : triangles) {
			tri.v1.add(new Vector3D(dx, dy, dz));
			tri.v2.add(new Vector3D(dx, dy, dz));
			tri.v3.add(new Vector3D(dx, dy, dz));
		}
	}

	public void rotateMeshYLocal(double dt) {
		for (Triangle tri : triangles) {
			// Move back to origin
			tri.v1.subtract(pivot);
			tri.v2.subtract(pivot);
			tri.v3.subtract(pivot);
			// Rotate X
			double x1 = Math.cos(dt) * tri.v1.x + Math.sin(dt) * tri.v1.z;
			double x2 = Math.cos(dt) * tri.v2.x + Math.sin(dt) * tri.v2.z;
			double x3 = Math.cos(dt) * tri.v3.x + Math.sin(dt) * tri.v3.z;
			// Rotate Z
			double z1 = Math.cos(dt) * tri.v1.z - Math.sin(dt) * tri.v1.x;
			double z2 = Math.cos(dt) * tri.v2.z - Math.sin(dt) * tri.v2.x;
			double z3 = Math.cos(dt) * tri.v3.z - Math.sin(dt) * tri.v3.x;

			tri.v1.x = x1;
			tri.v2.x = x2;
			tri.v3.x = x3;

			tri.v1.z = z1;
			tri.v2.z = z2;
			tri.v3.z = z3;

			// Move back to pivot
			tri.v1.add(pivot);
			tri.v2.add(pivot);
			tri.v3.add(pivot);
		}
	}
	
	public void rotateMeshYGlobal(double dt) {
		for (Triangle tri : triangles) {
			// Rotate X
			double x1 = Math.cos(dt) * tri.v1.x + Math.sin(dt) * tri.v1.z;
			double x2 = Math.cos(dt) * tri.v2.x + Math.sin(dt) * tri.v2.z;
			double x3 = Math.cos(dt) * tri.v3.x + Math.sin(dt) * tri.v3.z;
			double p1 = Math.cos(dt) * pivot.x + Math.sin(dt) * pivot.z;
			// Rotate Z
			double z1 = Math.cos(dt) * tri.v1.z - Math.sin(dt) * tri.v1.x;
			double z2 = Math.cos(dt) * tri.v2.z - Math.sin(dt) * tri.v2.x;
			double z3 = Math.cos(dt) * tri.v3.z - Math.sin(dt) * tri.v3.x;
			double p2 = Math.cos(dt) * pivot.z - Math.sin(dt) * pivot.x;

			tri.v1.x = x1;
			tri.v2.x = x2;
			tri.v3.x = x3;

			tri.v1.z = z1;
			tri.v2.z = z2;
			tri.v3.z = z3;
			
			pivot.x = p1;
			pivot.z = p2;
		}
		
	}

	public void setPosition(double x, double y, double z) {
		Vector3D distToPivot = new Vector3D(x, y, z);
		distToPivot.subtract(pivot);
		for (Triangle tri : triangles) {
			tri.v1.add(distToPivot);
			tri.v2.add(distToPivot);
			tri.v3.add(distToPivot);
		}
		pivot = new Vector3D(x, y, z);
	}
	
	public void setPivot(double x, double y, double z) {
		pivot.x += x;
		pivot.y += y;
		pivot.z += z;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("");

		int counter = 1;

		for (Triangle tri : triangles) {
			sb.append("Triangle #" + counter);
			sb.append("\n" + tri.v1.x + " - " + tri.v1.y + " - " + tri.v1.z);
			sb.append("\n" + tri.v2.x + " - " + tri.v2.y + " - " + tri.v2.z);
			sb.append("\n" + tri.v3.x + " - " + tri.v3.y + " - " + tri.v3.z + "\n");
			counter++;
		}

		return sb.toString();
	}
}
