package example_CRUD;

import java.util.Arrays;

public class CRUDmain {
	
	public static void main(String[] args) {
		
		
		int n = 9;
		
//		creating random value array
		int[] randomArray = new int[10];


		for(int i=0; i<randomArray.length; i++) {
			randomArray[i] = (int) (Math.random() * 1000);
		}
		System.out.print("Printing array..." + Arrays.toString(randomArray));		
		
		
//		inserting 0 into randomArray[4]
		int pos = 4;
		int value = 0;
		for (int i = n; i >= pos; i-- ) {
			randomArray[i] = randomArray[i-1];
		}
		randomArray[pos - 1] = value;
		n++;
		
		System.out.print("\nPrinting after insertion..." + Arrays.toString(randomArray));
		
		
//		deleting element
		int delpos = 2;
		for (int i = delpos - 1; i <= n; i++) {
			randomArray[i]=randomArray[i+1];
		}
		n--;
		System.out.print("\nPrinting after deletion..." + Arrays.toString(randomArray));		
		
	}

}