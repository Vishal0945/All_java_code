package practices;

import java.util.Scanner;

public class Revrse_String {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name want to reverse :");
		String a=sc.nextLine();
//		String a="vishal chauhan";
		String b="";
		int c=a.length();
		 for (int i =c-1 ; i>=0 ; i--) {
				b=b+a.charAt(i);
		}
		 System.out.println("your Reverse :"+b);
		
	}

}
