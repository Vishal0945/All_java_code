package practices;


//import java.util.Arrays;
import java.util.Scanner;

public class ArrayLargeNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 
		System.out.print("Enter the number of elements you want to store: ");  
		int	n=sc.nextInt();  	
		int[] array = new int[10];  
		
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{  
		array[i]=sc.nextInt();  
		}  
		int max=array[0];
		for (int i = 0; i < array.length-1; i++) {
			if(array[i]>max) {
				
//				System.out.println(array[i]);
			
	
				max=array[i];
			}	
		}
		System.out.println("your maximun no. :"+max);
		
		}

}
