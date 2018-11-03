/*
Java Program that inputs three subject marks of a student 

then grades the student according to the following classification

70 - 100- A
60 - 69 - B
50 - 59 - C
40 - 49 - D

< 40 FAIL

*/

import java.util.Scanner;

public class Grade{
	public static void main(String args[]){
		int mark1, mark2, mark3, sum;
		double average;

		System.out.println("Enter Marks:");

		Scanner reader = new Scanner(System.in);

		mark1 = reader.nextInt(); 
		mark2 = reader.nextInt();
		mark3 = reader.nextInt();

		sum = mark1+mark2+mark3;
		average = sum / 3;

		if(average >= 70 && average <= 100){
			System.out.println("Grade A");
		}
		else if(average >= 60 && average<= 69){
			System.out.println("Grade B");
		}

		else if(average >= 50 && average <= 59){
			System.out.println("Grade C");
		}

		else if(average >= 40 && average  <= 49){
			System.out.println("Grade D");
		}

		else{
			System.out.println("FAIL");
		}
	}
}