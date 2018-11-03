// Get Sphere Radius
// Compute Volume and Surface area.

import java.util.Scanner;

public class Sphere{
	public static void main(String[] args){
		double radius, area, volume;

		Scanner reader = new Scanner(System.in);

		System.out.println("Enter Radius: ");

		radius = reader.nextDouble();

		volume = Volume(radius);
		area = SurfaceArea(radius);

		System.out.println("The Volume is : " + volume);

		System.out.println("The Area is : " + area);

	}


	public static double Volume(double radius){
		double volume;
		// Compute the Volume
		volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
		return volume;
	}



	public static double SurfaceArea(double radius){
		double  area;
		// Compute the Area
		area = 4.0 * Math.PI * Math.pow(radius, 2);
		return area;
	}

	
}