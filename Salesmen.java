/*

Question 5

A company distributes 5 different items around Nairobi through its 10 salesmen. Using arrays write a
Java application program to input a salesman name and the corresponding sales made by each of the
salesman for each of the item. The program should then output each of the salesman’s name, sales, total
sales as well as grand total using the format shown below.

Name
		Item1 Item2 Item3 Item3 Item4 Item5 TotalSales
___________________________________________________
Brian 	20    50     25    10    0    15     120
Joan    45    55     10    25    5    30     170
....
....
GrandTotal xx

*/

//A program which uses arrays to Compute sales totals
//By Salesmen distributing 5 items for an Atlantan Company


import java.util.Scanner;


public class Salesmen {
    public static void main(String[] args) {
        int[][] sales = new int[10][5];
        int GrandSales =0;
        int ItemNumber=5,NoOfSalesmen=10;
        String[] name= new String[10];
        Scanner input = new Scanner(System.in);
        
        //Input of sales details
        System.out.println("***This program computes sales totals for the Salesmen in the Database");
        for(int i=0;i<NoOfSalesmen;i++){
            System.out.printf("\nEnter the name of salesman " + (i+1) + ":	");
            name[i] = input.next();
            for(int j=0;j<ItemNumber;j++){
                System.out.print("Enter the sales of item " + (j+1) + ": ");
                sales[i][j] = input.nextInt();
            }
        }
        
        //Salesmen Total
        int TotalSales=0;
        
        //Output the sales details
        System.out.println("\nName\tItem1\tItem2\tItem3\tItem4\tItem5\tTotalSales");
        for(int i=0;i<NoOfSalesmen;i++){
            System.out.print(name[i]+"\t");
            for(int j=0;j<ItemNumber;j++){
                System.out.print(sales[i][j]+"\t");
                TotalSales += sales[i][j];
            }
            GrandSales += TotalSales;
            System.out.print(TotalSales + "\t");
            System.out.println("\n");
            TotalSales =0;
        }

          int GrandTotal = 0;
        //Calculation of Grand Total
        System.out.print("Total \t");
   		 for(int j=0;j<ItemNumber;j++){
        	for(int i=0;i<NoOfSalesmen;i++){
            GrandTotal += sales[i][j];
        	}
        	System.out.print(GrandTotal + "\t");
        	GrandTotal = 0;
       }
   		 System.out.println(GrandSales + "\t");
   		 System.out.println("\n");
    }
}