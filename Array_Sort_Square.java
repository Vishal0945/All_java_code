package collection;

import java.util.Arrays;

public class Array_Sort_Square {
	public static void main(String[] args) {
		int a[]= {1,4,6,7,3};
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			int square= a[i]*a[i];
			System.out.println(square);
		}
		
	}

}
