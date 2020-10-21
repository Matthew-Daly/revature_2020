package example1;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {
		
		int ar[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//		using toString to print full array as sting
		System.out.print(Arrays.toString(ar));


		System.out.println(ar[2]);
		// for loop to print each element
		for (int i = 0; i < ar.length; i++){
			System.out.println("ar[" + i + "] = " + ar[i]);

		}

		// for each loop to print individual elements
		for (int x : ar) {
			System.out.println(x);
		}
		
		
	}

}