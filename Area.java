import java.util.Scanner;

public class Area{

	public static void main(String[] args){

		double radius, length, width, base, height,area1, area2, area3;

		// Circle Calculation
		System.out.println("Circle Area Calculation:");

		System.out.println("Enter Radius:");

		Scanner reader = new Scanner(System.in);	

		radius = reader.nextDouble();

		area1 = Area(radius);

		// Rectangle Calculation
		System.out.println("Rectangle Area Calculation: ");

		System.out.println("Enter Length and Width:");
		
		Scanner reader = new Scanner(System.in);	

		length = reader.nextDouble();
		width = reader.nextDouble();

		area2 = Area(length,width);

		// Triangle Calculation
		System.out.println("Triangle Area Calculation: ");

		System.out.println("Enter Base and Height:");

		Scanner reader = new Scanner(System.in);	

		base = reader.nextDouble();
		height = reader.nextDouble();

		area3 = Area(base,height);
		

	}

	public static double Area(double radius){
		double radius , area;

		area = Math.PI * Math.pow(radius, 2);

		return area;

	}

	public static double Area(double length double width)
	{
		double length, width, area;

		area = length * width;

		return area;

	}

	public static double Area(double base double height){

		double base,height, area;

		area = (1.0/2.0) * base * height;

		return area;

	}
}
