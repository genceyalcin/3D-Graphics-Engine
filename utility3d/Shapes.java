package utility3d;

import java.util.ArrayList;

import com.genceyalcin.misc.Vector3D;

public class Shapes {

	public Shapes() {

	}

	public Mesh createCastle() {

		ArrayList<Triangle> castleList = new ArrayList<Triangle>();
		
		// Wall
		//Front Face
		Triangle t1 = new Triangle(new Vector3D(0.0, 0.0, 0.0), new Vector3D(0.0, 5.0, 0.0),
				new Vector3D(7.0, 0.0 , 0.0));
		Triangle t2 = new Triangle(new Vector3D(7.0, 5.0, 0.0), new Vector3D(0.0, 5.0, 0.0),
				new Vector3D(7.0, 0.0, 0.0));
		Triangle t3 = new Triangle(new Vector3D(1.0, 0.0, 0.0), new Vector3D(1.0, -1.0, 0.0),
				new Vector3D(2.0, -1.0, 0.0));
		Triangle t4 = new Triangle(new Vector3D(1.0, 0.0, 0.0), new Vector3D(2.0, 0.0, 0.0),
				new Vector3D(2.0, -1.0, 0.0));
		Triangle t5 = new Triangle(new Vector3D(3.0, 0.0, 0.0), new Vector3D(3.0, -1.0, 0.0),
				new Vector3D(4.0, -1.0, 0.0));
		Triangle t6 = new Triangle(new Vector3D(3.0, 0.0, 0.0), new Vector3D(4.0, 0.0, 0.0),
				new Vector3D(4.0, -1.0, 0.0));
		Triangle t7 = new Triangle(new Vector3D(5.0, 0.0, 0.0), new Vector3D(5.0, -1.0, 0.0),
				new Vector3D(6.0, -1.0, 0.0));
		Triangle t8 = new Triangle(new Vector3D(5.0, 0.0, 0.0), new Vector3D(6.0, 0.0, 0.0),
				new Vector3D(6.0, -1.0, 0.0));
		
		//Back Face
		Triangle t9 = new Triangle(new Vector3D(0.0, 0.0, 0.2), new Vector3D(0.0, 5.0, 0.2),
				new Vector3D(7.0, 0.0, 0.2));
		Triangle t10 = new Triangle(new Vector3D(7.0, 5.0, 0.2), new Vector3D(0.0, 5.0, 0.2),
				new Vector3D(7.0, 0.0, 0.2));
		Triangle t11 = new Triangle(new Vector3D(1.0, 0.0, 0.2), new Vector3D(1.0, -1.0, 0.2),
				new Vector3D(2.0, -1.0, 0.2));
		Triangle t12 = new Triangle(new Vector3D(1.0, 0.0, 0.2), new Vector3D(2.0, 0.0, 0.2),
				new Vector3D(2.0, -1.0, 0.2));
		Triangle t13 = new Triangle(new Vector3D(3.0, 0.0, 0.2), new Vector3D(3.0, -1.0, 0.2),
				new Vector3D(4.0, -1.0, 0.2));
		Triangle t14 = new Triangle(new Vector3D(3.0, 0.0, 0.2), new Vector3D(4.0, 0.0, 0.2),
				new Vector3D(4.0, -1.0, 0.2));
		Triangle t15 = new Triangle(new Vector3D(5.0, 0.0, 0.2), new Vector3D(5.0, -1.0, 0.2),
				new Vector3D(6.0, -1.0, 0.2));
		Triangle t16 = new Triangle(new Vector3D(5.0, 0.0, 0.2), new Vector3D(6.0, 0.0, 0.2),
				new Vector3D(6.0, -1.0, 0.2));
		
		// Side Faces
		Triangle t17 = new Triangle(new Vector3D(0.0, 0.0, 0.0), new Vector3D(0.0, 5.0, 0.0),
				new Vector3D(0.0, 5.0 , 0.2));
		Triangle t18 = new Triangle(new Vector3D(0.0, 5.0, 0.2), new Vector3D(0.0, 0.0, 0.0),
				new Vector3D(0.0, 0.0, 0.2));
		Triangle t19 = new Triangle(new Vector3D(7.0, 0.0, 0.0), new Vector3D(7.0, 5.0, 0.0),
				new Vector3D(7.0, 0.0 , 0.2));
		Triangle t20 = new Triangle(new Vector3D(7.0, 0.0, 0.2), new Vector3D(7.0, 5.0, 0.0),
				new Vector3D(7.0, 5.0, 0.2));
		
		Triangle t21 = new Triangle(new Vector3D(1.0, 0.0, 0.0), new Vector3D(1.0, 0.0, 0.2),
				new Vector3D(1.0, -1.0 , 0.0));
		Triangle t22 = new Triangle(new Vector3D(1.0, -1.0, 0.0), new Vector3D(1.0, 0.0, 0.2),
				new Vector3D(1.0, -1.0, 0.2));
		Triangle t23 = new Triangle(new Vector3D(2.0, 0.0, 0.0), new Vector3D(2.0, 0.0, 0.2),
				new Vector3D(2.0, -1.0 , 0.0));
		Triangle t24 = new Triangle(new Vector3D(2.0, -1.0, 0.0), new Vector3D(2.0, 0.0, 0.2),
				new Vector3D(2.0, -1.0, 0.2));
		Triangle t25 = new Triangle(new Vector3D(3.0, 0.0, 0.0), new Vector3D(3.0, 0.0, 0.2),
				new Vector3D(3.0, -1.0 , 0.0));
		Triangle t26 = new Triangle(new Vector3D(3.0, -1.0, 0.0), new Vector3D(3.0, 0.0, 0.2),
				new Vector3D(3.0, -1.0, 0.2));
		Triangle t27 = new Triangle(new Vector3D(4.0, 0.0, 0.0), new Vector3D(4.0, 0.0, 0.2),
				new Vector3D(4.0, -1.0 , 0.0));
		Triangle t28 = new Triangle(new Vector3D(4.0, -1.0, 0.0), new Vector3D(4.0, 0.0, 0.2),
				new Vector3D(4.0, -1.0, 0.2));
		Triangle t29 = new Triangle(new Vector3D(5.0, 0.0, 0.0), new Vector3D(5.0, 0.0, 0.2),
				new Vector3D(5.0, -1.0 , 0.0));
		Triangle t30 = new Triangle(new Vector3D(5.0, -1.0, 0.0), new Vector3D(5.0, 0.0, 0.2),
				new Vector3D(5.0, -1.0, 0.2));
		Triangle t31 = new Triangle(new Vector3D(6.0, 0.0, 0.0), new Vector3D(6.0, 0.0, 0.2),
				new Vector3D(6.0, -1.0 , 0.0));
		Triangle t32 = new Triangle(new Vector3D(6.0, -1.0, 0.0), new Vector3D(6.0, 0.0, 0.2),
				new Vector3D(6.0, -1.0, 0.2));
		
		// Right Tower
		// Front face
		Triangle t33 = new Triangle(new Vector3D(7.0, 5.0, -0.2), new Vector3D(9, -2.0, -0.2),
				new Vector3D(7.0, -2.0 , -0.2));
		Triangle t34 = new Triangle(new Vector3D(7.0, 5.0, -0.2), new Vector3D(9, 5.0, -0.2),
				new Vector3D(9, -2.0, -0.2));
		
		// Back Face
		Triangle t35 = new Triangle(new Vector3D(7.0, 5.0, 1.2), new Vector3D(9, -2.0, 1.2),
				new Vector3D(7.0, -2.0 , 1.2));
		Triangle t36 = new Triangle(new Vector3D(7.0, 5.0, 1.2), new Vector3D(9, 5.0, 1.2),
				new Vector3D(9, -2.0, 1.2));
		
		// Side Faces
		Triangle t37 = new Triangle(new Vector3D(7.0, 5.0, 1.2), new Vector3D(7.0, -2.0, -0.2),
				new Vector3D(7.0, -2.0 , 1.2));
		Triangle t38 = new Triangle(new Vector3D(7.0, 5.0, -0.2), new Vector3D(7.0, 5.0, 1.2),
				new Vector3D(7.0, -2, -0.2));
		Triangle t39 = new Triangle(new Vector3D(9.0, 5.0, 1.2), new Vector3D(9.0, -2.0, -0.2),
				new Vector3D(9.0, -2.0 , 1.2));
		Triangle t40 = new Triangle(new Vector3D(9.0, 5.0, -0.2), new Vector3D(9.0, 5.0, 1.2),
				new Vector3D(9.0, -2, -0.2));
		
		// Left Tower
		// Front face
		Triangle t41 = new Triangle(new Vector3D(0.0, 5.0, -0.2), new Vector3D(-2, -2.0, -0.2),
				new Vector3D(0.0, -2.0 , -0.2));
		Triangle t42 = new Triangle(new Vector3D(0.0, 5.0, -0.2), new Vector3D(-2, 5.0, -0.2),
				new Vector3D(-2, -2.0, -0.2));
		
		// Back Face
		Triangle t43 = new Triangle(new Vector3D(0.0, 5.0, 1.2), new Vector3D(-2.0, -2.0, 1.2),
				new Vector3D(0.0, -2.0 , 1.2));
		Triangle t44 = new Triangle(new Vector3D(0.0, 5.0, 1.2), new Vector3D(-2.0, 5.0, 1.2),
				new Vector3D(-2.0, -2.0, 1.2));
		
		// Side Faces
		Triangle t45 = new Triangle(new Vector3D(0.0, 5.0, 1.2), new Vector3D(0.0, -2.0, -0.2),
				new Vector3D(0.0, -2.0 , 1.2));
		Triangle t46 = new Triangle(new Vector3D(0.0, 5.0, -0.2), new Vector3D(0.0, 5.0, 1.2),
				new Vector3D(0.0, -2, -0.2));
		Triangle t47 = new Triangle(new Vector3D(-2.0, 5.0, 1.2), new Vector3D(-2.0, -2.0, -0.2),
				new Vector3D(-2.0, -2.0 , 1.2));
		Triangle t48 = new Triangle(new Vector3D(-2.0, 5.0, -0.2), new Vector3D(-2.0, 5.0, 1.2),
				new Vector3D(-2.0, -2, -0.2));
		
		castleList.add(t1);
		castleList.add(t2);
		castleList.add(t3);
		castleList.add(t4);
		castleList.add(t5);
		castleList.add(t6);
		castleList.add(t7);
		castleList.add(t8);
		castleList.add(t9);
		castleList.add(t10);
		castleList.add(t11);
		castleList.add(t12);
		castleList.add(t13);
		castleList.add(t14);
		castleList.add(t15);
		castleList.add(t16);
		castleList.add(t17);
		castleList.add(t18);
		castleList.add(t19);
		castleList.add(t20);
		castleList.add(t21);
		castleList.add(t22);
		castleList.add(t23);
		castleList.add(t24);
		castleList.add(t25);
		castleList.add(t26);
		castleList.add(t27);
		castleList.add(t28);
		castleList.add(t29);
		castleList.add(t30);
		castleList.add(t31);
		castleList.add(t32);
		castleList.add(t33);
		castleList.add(t34);
		castleList.add(t35);
		castleList.add(t36);
		castleList.add(t37);
		castleList.add(t38);
		castleList.add(t39);
		castleList.add(t40);
		castleList.add(t41);
		castleList.add(t42);
		castleList.add(t43);
		castleList.add(t44);
		castleList.add(t45);
		castleList.add(t46);
		castleList.add(t47);
		castleList.add(t48);
		
		
		
		return new Mesh(castleList);

	}

	public Mesh createCube() {

		// Cube Verticies and Triangles

		// Front Face
		Triangle t1 = new Triangle(new Vector3D(0.0, 0.0, 1.0), new Vector3D(0.0, 1.0, 1.0),
				new Vector3D(1.0, 1.0, 1.0));
		Triangle t2 = new Triangle(new Vector3D(1.0, 1.0, 1.0), new Vector3D(1.0, 0.0, 1.0),
				new Vector3D(0.0, 0.0, 1.0));

		// Back
		Triangle t3 = new Triangle(new Vector3D(1.0, 0.0, 2.0), new Vector3D(1.0, 1.0, 2.0),
				new Vector3D(0.0, 1.0, 2.0));
		Triangle t4 = new Triangle(new Vector3D(0.0, 1.0, 2.0), new Vector3D(0.0, 0.0, 2.0),
				new Vector3D(1.0, 0.0, 2.0));

		// Left
		Triangle t5 = new Triangle(new Vector3D(0.0, 1.0, 1.0), new Vector3D(0.0, 0.0, 1.0),
				new Vector3D(0.0, 0.0, 2.0));
		Triangle t6 = new Triangle(new Vector3D(0.0, 0.0, 2.0), new Vector3D(0.0, 1.0, 2.0),
				new Vector3D(0.0, 1.0, 1.0));

		// Right
		Triangle t7 = new Triangle(new Vector3D(1.0, 0.0, 1.0), new Vector3D(1.0, 1.0, 1.0),
				new Vector3D(1.0, 1.0, 2.0));
		Triangle t8 = new Triangle(new Vector3D(1.0, 1.0, 2.0), new Vector3D(1.0, 0.0, 2.0),
				new Vector3D(1.0, 0.0, 1.0));

		// Bottom
		Triangle t9 = new Triangle(new Vector3D(0.0, 0.0, 2.0), new Vector3D(0.0, 0.0, 1.0),
				new Vector3D(1.0, 0.0, 1.0));
		Triangle t10 = new Triangle(new Vector3D(1.0, 0.0, 1.0), new Vector3D(1.0, 0.0, 2.0),
				new Vector3D(0.0, 0.0, 2.0));

		// Top
		Triangle t11 = new Triangle(new Vector3D(0.0, 1.0, 1.0), new Vector3D(0.0, 1.0, 2.0),
				new Vector3D(1.0, 1.0, 2.0));
		Triangle t12 = new Triangle(new Vector3D(1.0, 1.0, 2.0), new Vector3D(1.0, 1.0, 1.0),
				new Vector3D(0.0, 1.0, 1.0));

		// Create Triangle list to make mesh
		ArrayList<Triangle> cubeList = new ArrayList<Triangle>();

		cubeList.add(t1);
		cubeList.add(t2);
		cubeList.add(t3);
		cubeList.add(t4);
		cubeList.add(t5);
		cubeList.add(t6);
		cubeList.add(t7);
		cubeList.add(t8);
		cubeList.add(t9);
		cubeList.add(t10);
		cubeList.add(t11);
		cubeList.add(t12);

		return new Mesh(cubeList);

	}

}