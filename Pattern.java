/*

Question 2

Using nested loops, write a Java application program that produces the following output.


								& & & & & &
								* & * * * *
								* * & * * *
								* * * & * *
								* * * * & *
								& & & & & &

*/


public class Pattern {
	public static void main(String[] args){

	char Pattern [][]= new char [6][7] ;   // declare an array
	   for (int i = 0; i <1 ; i++) 
	   {
		   System.out.print( "\n\t");
		
		for(int a = 0; a < 7; a++){

			if(a<6){
			Pattern [i][a] = '&';
			System.out.print(" "+ Pattern [i][a] );
			}
			if(a==6)
			System.out.print( "\n\t ");
		}
		
		for(int b = 0; b < 7; b++){

			if((b<6)&& (b!=1)){
			Pattern [i][b] = '*';
			System.out.print(Pattern [i][b] + " ");
			}
			if(b==1){
			Pattern [i][b] = '&';
			System.out.print( Pattern [i][b]+ " " );
			}
			if(b==6)
			System.out.print( "\n\t ");
		}
		

		for(int c = 0; c < 7; c++){

			if((c<6)&& (c!=2)){
			Pattern [i][c] = '*';
			System.out.print(Pattern [i][c] + " ");
			}
			if(c==2){
			Pattern [i][c] = '&';
			System.out.print( Pattern [i][c]+ " " );
			}
			if(c==6)
			System.out.print( "\n\t ");
		}
		

		for(int d = 0; d < 7; d++){

			if((d<6)&& (d!=3)){
			Pattern [i][d] = '*';
			System.out.print(Pattern [i][d] + " ");
			}
			if(d==3){
			Pattern [i][d] = '&';
		 	System.out.print( Pattern [i][d]+ " " );
			}
			if(d==6)
			System.out.print( "\n\t ");
		}
		

		for(int e = 0; e< 7; e++){

			if((e<6)&& (e!=4)){
			Pattern [i][e] = '*';
			System.out.print(Pattern [i][e] + " ");
			}
			if(e==4){
			Pattern [i][e] = '&';
			System.out.print( Pattern [i][e]+ " " );
			}
			if(e==6)
			System.out.print( "\n\t ");
		}
		

		for(int f = 0; f < 7; f++){

			if(f<6){
			Pattern [i][f] = '&';
			System.out.print(Pattern [i][f] + " ");
			}
			if(f==6)
			System.out.print( "\n\t ");
		}
	   }	

	}
}
