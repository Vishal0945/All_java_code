package practices;

import java.util.Arrays;
import java.util.Scanner;

public class hello {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < 10; i++) {
			a[i] = sc.nextInt();
		}
//		System.out.println("Array elements are: ");
		for (int i = 0; i < 10; i++) {
			System.out.println("array is :"+a[i]);
		}
		
		
	
	}

}
