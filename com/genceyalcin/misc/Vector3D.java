package com.genceyalcin.misc;

public class Vector3D {

	public double x;
	public double y;
	public double z;

	public Vector3D(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public Vector3D(Vector3D v) {
		this.x = v.x;
		this.y = v.y;
		this.z = v.z;
	}

	public Vector3D add(Vector3D v) {
		x += v.x;
		y += v.y;
		z += v.z;

		return new Vector3D(x, y, z);
	}

	public Vector3D subtract(Vector3D v) {
		x -= v.x;
		y -= v.y;
		z -= v.z;

		return new Vector3D(x, y, z);
	}

	public Vector3D subtractToNew(Vector3D v) {
		double x1 = x - v.x;
		double y1 = y - v.y;
		double z1 = z - v.z;

		return new Vector3D(x1, y1, z1);
	}

	public double dot(Vector3D v) {
		return (x * v.x) + (y * v.y) + (z * v.z);
	}

	public Vector3D cross(Vector3D v) {
		double xTemp = (y * v.z) - (z * v.y);
		double yTemp = (z * v.x) - (x * v.z);
		double zTemp = (x * v.y) - (y * v.x);

		x = xTemp;
		y = yTemp;
		z = zTemp;

		return new Vector3D(x, y, z);
	}
	
	public Vector3D crossToNew(Vector3D v) {
		double xTemp = (y * v.z) - (z * v.y);
		double yTemp = (z * v.x) - (x * v.z);
		double zTemp = (x * v.y) - (y * v.x);

		return new Vector3D(xTemp, yTemp, zTemp);
	}

}
