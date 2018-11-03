import java.util.Scanner;


public class GetMin{
	public static void main(String[] args){
		int[] num = {126, 1670, 95, 170, 270};

		int min = getMinValue(num);

		System.out.println("Min = " + min);
	}

	public static int getMinValue(int[] array){
		int min = array[0];

		for(int i=1; i < array.length; i++){
			if(array[i] < min){
				min = array[i];
			}
		}

		return min;
	
}

}