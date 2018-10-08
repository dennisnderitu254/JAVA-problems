public class ContinueExample{

	public static void main(String [] args){
		// Continue statement is used t skip a particular iteration of the loop


		int intArray[] = new int[]{1,2,3,4,5};

		System.out.println("All numbers except for 3 are:");

		for(int i=0; i < intArray.length; i++)
		{
			if (intArray[i] == 3)
				continue;
			else
				System.out.println(intArray[i]);
		}
	}


}