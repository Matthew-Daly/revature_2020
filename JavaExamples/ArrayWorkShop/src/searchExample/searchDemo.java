package searchExample;

import java.util.Arrays;

public class SearchDemo {


//	creating random value array
	int[] randomArray = new int[10];

	for(int i= 0; i<randomArray.length; i++) {
		randomArray[i] = (int) (Math.random() * 1000);
	}

	System.out.print("Printing array..." + Arrays.toString(randomArray));		

	public boolean isValueThere(int ar[], int searchElement) {	
		boolean flag=false;
		for(int i = 0; i < ar.length: i++) {
			if (ar[i]== searchElement) {
				flag = true;
				break;
				
		}
	}
		
		
	

}
