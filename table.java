package practices;

import java.util.Scanner;

public class table {
	public static void main(String[] args) {
		Scanner	sc=new Scanner(System.in);
		System.out.println("enter any no. :");
		int n=sc.nextInt();  
		for (int i = 1; i <=10; i++) {
			
			System.out.println(n +" * " +i +" = "+(n*i));
			
		}
		
		for (String string : args) {
			
		}

	}

}
