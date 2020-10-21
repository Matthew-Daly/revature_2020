package example_CRUD;

import java.util.Arrays;

public class CRUDmain {
	
	public static void main(String[] args) {
		
		int[] randomArray = new int[10];


		for(int i=0; i<randomArray.length; i++)
			randomArray[i] = (int) (Math.random() * 1000);

		System.out.print(Arrays.toString(randomArray));		
		
				
		
	}

}