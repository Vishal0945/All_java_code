package practices;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		int b,sum=0,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No.");
		int a = sc.nextInt();
		c=a;
		while (a>0) {
			b=a%10;
			sum =(sum*10)+b;
			a=a/10;
			
		}
		
		if (c==sum) {
			System.out.println("this is palindrome");
			
		} else {
			System.out.println("this is not a palindrome no.");

		}
	}

}
