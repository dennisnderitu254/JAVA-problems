/*

Question 4

Write a complete Java application program to calculate the area of a triangle, rectangle or circle. The
program should have a decision making statement(s) to decide:
-> If the figure is a triangle then ask for base and height values to input.
->If the figure is a rectangle the ask for length and breath values to input
->If the figure is a circle then ask for the radius values to input
The program should display the output on the screen and should enable the user to re-enter choice for at
most three times incase a wrong selection is entered

*/

import java.io.*;
import java.util.Scanner;  // To allow for user input
public class Areas{

	public static void main (String[] args)throws Exception{
	Scanner reader=new Scanner(System.in);
	final double  PI=3.142;
	int  choice_of_area=0, error_count=0, rounds_remaining=0;
	double  radius=0.00, base=0.00, height=0.00, breadth=0.00, length = 0.0;
	double  area_of_circle=0.00, area_of_triangle=0.00, area_of_rectangle=0.00;
	char  start_over_option;
	char  start_over;

System.out.println("______________________________________________________________________________");
	System.out.println("\n	NOTE: ALL MEASUREMENTS ARE IN METERS.");
	System.out.println("\n	Press return after entering a value.");
System.out.println("\nThis program can calculate the areas of triangles, rectangles and circles.");
	
    do{
System.out.println("______________________________________________________________________________");
	System.out.println("\nEnter either one of the following choices:");
	System.out.println("	a) For the area of a circle type '1'.");	
	System.out.println("	b) For the area of a rectangle type '2'.");
	System.out.println("	c) For the area of a triangle type '3'.");
	System.out.printf("\nYour choice:	");
	choice_of_area=reader.nextInt();

// calculation of areas

		switch(choice_of_area){
		case 1:
			System.out.printf("\nEnter the radius of the circle:	");
			radius=reader.nextDouble();
			area_of_circle=radius*radius*PI;
			System.out.println("\nThe area of the circle in square meters is: "+area_of_circle);break;
		case 2:
			System.out.printf("\nEnter the length of the rectangle:	");
			length=reader.nextDouble();
			System.out.printf("\nEnter the breadth of the rectangle:	");
			breadth=reader.nextDouble();
			area_of_rectangle=length*breadth;
			System.out.println("\nThe area of the rectangle in square meters is "+area_of_rectangle);break;
		
		  case 3:
			System.out.printf("\nEnter the height of the triangle:	");
			height=reader.nextDouble();
			System.out.printf("\nEnter the base of the triangle:	");
			base=reader.nextDouble();
			area_of_triangle=0.5*base*height;
			System.out.println("\nThe area of the triangle in square meters is "+area_of_triangle);break;
		default:
			System.out.println("\n\tERROR!!!! You can only enter the digits 1,2 or 3!!!");
			error_count=error_count+1;
			rounds_remaining=3-error_count;
			System.out.println("\nNOTE: Due to the error made you have "+rounds_remaining+" rounds remaining.");
		}

		System.out.println();
	
		System.out.printf("Would you like to start over? y/n:	");
	
		start_over_option=(char)System.in.read();
		
	if(((start_over_option =='y')||(start_over_option =='Y'))&&error_count<3)
		start_over = 'y';
	else 
	{
		start_over = 'n';
		System.out.println("\n\t\n\t* * * * * * * * * * * * THE END * * * * * * * * * * * *");
	}

   }while (start_over=='y'); 
}

}