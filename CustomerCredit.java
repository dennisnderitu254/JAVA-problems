/*

Question 3

Write Java application program to be used to evaluate the credit worthy of a client. 
The program reads the credit limit and the price and quantity of the item to be purchased by the client.
If the value of the goods is more than the credit limit, the program displays “Sorry you cannot purchase goods worthy such
a value on credit” and allows the customer to re-enter the quantity, otherwise, displays “Thank You for
purchasing from us” and the value of the purchase. This should be repeated for n customers.

*/

// Evaluation of customer credit

import java.io.*;
import java.util.Scanner;

public class CustomerCredit{
	public static void main(String[] args)throws Exception{
	// Variable Declaration
	
	int credit_limit, quantity, price;
	char next_customer='y';
       
       Scanner inpt = new Scanner(System.in);//Accept inputs from the keyboard
       System.out.println("\n\t\tEVALUATION OF CUSTOMER CREDIT");
		do
        {
           System.out.printf("\n\tInput customer limit:	");
           credit_limit = inpt.nextInt();
           System.out.printf("\n\tInput quantity:		");
           quantity = inpt.nextInt();
           System.out.printf("\n\tInput price:		");
           price = inpt.nextInt();
           if ((price * quantity)>credit_limit) //Outside the credit limit
           {
			System.out.println("\nThe value of goods selected worth " + Integer.toString((price * quantity)) + " exceeds "+Integer.toString(credit_limit)+". Please retry");
			System.out.println("Sorry you cannot purchase goods worthy such a value on credit" );
            System.out.println("\n");
           }
           else
           {
             System.out.println("Input valid. Thank You for purchasing from us");
	    }

          System.out.printf("\nNext customer (Y/N)?	");
	    next_customer=(char)System.in.read();
		if ((next_customer =='Y')|| (next_customer =='y')) //continue operation
           
           {
           	next_customer='y';//Start next customer evaluation
           }
           else
           {
           	next_customer='n';
				System.out.println("\n\t\n\t* * * * -------* * * * THE END * * * * * ----- * * * *");
           }

          }while(next_customer =='y');
    }
}