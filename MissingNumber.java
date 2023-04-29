package collection;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int v=0;
		int a[]= {2,3,1,5,8};
		
		int sum=Arrays.stream(a).sum();
		System.out.println(sum);
		Arrays.sort(a);
		int size=0;
		for (int i : a) 
		{
		size++;	
		if (size!=i) {
			System.out.println(size);
			break;
			
		}
		}
		

		 	
		
		
		
		
			
		}
		
			
		}
		
	


