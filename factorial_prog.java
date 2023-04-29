package practices;

public class factorial_prog {
	
	public static void main(String[] args) {
		 
		
				int a=153,rem = 0,arm=0;
			int c=a;
			while (a>0) {
				
				rem=a%10;
		     	arm=(rem*rem*rem)+arm;
		      	System.out.println(rem);
		      	a=a/10;
				
			}
			System.out.println("after cube to all digit :"+arm);
			
			if (c==arm) {
				System.out.println(c+"  :"+"this is armstrong number");
				
			} 
			
			else {
				System.out.println(c+" :"+"this is not armstrong number");

			}
				
				
			}

		}
	 
	 


