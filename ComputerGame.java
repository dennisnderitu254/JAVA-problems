/*

Question 1

A program is required for a computer game. 

The user keys in the number of rounds he wishes to play.

For each round the user enters his lucky number. 

The program takes the number and divides it with a
secret number.

If the remainder of the division is zero, it is considered a draw for the round and the total
score is incriminated by 1. 

Otherwise if it is any other even number, it is considered a win for the round
and the total score is incremented by 3. 

However if it is an odd number, it is considered a loss for the
round and the total score is decremented by 3. 

This is done until he completes his rounds.
He wins if the total score at the end is a positive number. Write a Java program to accomplish this.


*/

import java.util.Random;
import java.io.*;
import java.util.Scanner;


class ComputerGame{	
	
	public static void main (String[] args)throws Exception{
	Scanner reader=new Scanner(System.in);

	//DECLARATION OF VARIABLES
	char  start_over_option;
	char  start_over;
	int  Number_Of_Rounds,Lucky_Number=0, Secret_Number=0, Score=0, Result=0; 
	int Total_Score=0;

	//CODE THAT RUNS THE GAME

System.out.println("________________________________________________________________________________");
System.out.println("\t\t THESE ARE THE RULES OF THE GAME:\n");
System.out.printf("You will key in the number of rounds you wish to play    and for each round you will enter your lucky number.");
System.out.println(" The program takes the number and divides it with a secret number. The scoring is as follows:");
System.out.println(" \n\nFor each round, if the remainder is:");
System.out.println("   a) ZERO, it is a draw and the totalscore is incremenated by 1.");
System.out.println("   b) EVEN, it is a win and the totalscore is incremenated by 3.");
System.out.println("   c) ODD, it is a loss  and the totalscore is decremented by 3.\n");
System.out.println(" If the total score at the end is a positive number, you win the entire game.");


do{
System.out.println("____________________________________________________________________________");

Random rand = new Random();
Secret_Number = rand.nextInt(10);

if(Secret_Number==0){
		Secret_Number=1;
	}

	else{
		Secret_Number=Secret_Number;
	}

	System.out.println("\nHow many times would you like to play?	");
	Number_Of_Rounds=reader.nextInt();
	Total_Score=0;

    do{
		System.out.println("\nWhat is your lucky number?	");
		Lucky_Number=reader.nextInt();
		Result = Lucky_Number/Secret_Number;

		    if(Result==0)
		    {

			Score=1;
			Total_Score = Total_Score + Score;
			System.out.println("\n\tYour score for this round is "+ Score +" and your total score is "+Total_Score);
			Number_Of_Rounds= --Number_Of_Rounds;
			System.out.println("\tYou have  "+ Number_Of_Rounds +" more rounds left ");


		    }


		    else if(Result%2==0)	//Result is even
		     {

			Score=3;
			Total_Score = Total_Score + Score;
			System.out.println("\n\tYour score for this round is "+ Score +" and your total score is "+Total_Score);
			Number_Of_Rounds= --Number_Of_Rounds;
			System.out.println("\tYou have  "+ Number_Of_Rounds +" more rounds left ");

		     }
		     

		     else if(Result%2!=0)	//Result is odd
		     {

			Score=3;
			Total_Score = Total_Score - Score;
			System.out.println("\n\tYour score for this round is -"+ Score +" and your total score is "+Total_Score);

			Number_Of_Rounds= --Number_Of_Rounds;
			System.out.println("\tYou have  "+ Number_Of_Rounds +" more rounds left ");

		     }

		}while((Number_Of_Rounds>0) );		
	if(Total_Score>0)
	{
	    if(Total_Score%2==0)
     	{
		System.out.println("\n\t\tYour total score is: "+Total_Score ); System.out.println("* * * * * CONGRATULATIONS!!!YOU HAVE WON   THE ENTIRE GAME. * * * * *");	
	     }

	     else if(Total_Score%2!=0)
	     {
		System.out.println("\n\t\tYour total score is: "+Total_Score );
		System.out.println("* * * * * SORRY, YOUR SCORE IS AN ODD NUMBER. YOU HAVE LOST. * * * * *");
	     }
	}
	else if(Total_Score<=0)
	{
		System.out.println("\n\t\tYour total score is: "+Total_Score );
		System.out.println("* * * * * SORRY, YOU HAVE LOST. * * * * *");
	}


 //TO START THE GAME AGAIN
System.out.println();

System.out.printf("\nWould you like to start over? y/n:	");
start_over_option=(char)System.in.read();	
if((start_over_option =='y')||(start_over_option =='Y'))
	start_over = 'y';
else 
{
	start_over = 'n';
	System.out.println("\n\t * * * THE END * * * ");

}


}while(start_over=='y');


}



}// END OF PROGRAM

