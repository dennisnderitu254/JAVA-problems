import java.util.Scanner;


public class GetMax{
	public static void main(String[] args){
		int[] num = {126, 1670, 95, 170, 270};

		int max = getMaxValue(num);

		System.out.println("Max = " + max);
	}

	public static int getMaxValue(int[] array){
		int max = array[0];

		for(int i=1; i < array.length; i++){
			if(array[i] > max){
				max = array[i];
			}
		}

		return max;
	}
}