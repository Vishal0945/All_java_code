package practices;

public class fibonacci_series {

		 public static void main(String[] args) {
			 
			 
			 int a=0,b=1,c;
			 int i=10;
			 
			 System.out.print(a+ " "+b);
			 
			 
			 for (int j = 2; j < i; j++) {
				 
				 c=a+b;
				 System.out.print(" "+c);
				 a=b;
				 b=c;
				 
			 }
			 
		 }  
		 
}
			 
			
			 