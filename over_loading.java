package practices;

public class over_loading {
	
     public void Show() {
    	 System.out.println("this is show1 func...");
     }
     
     public void Show(int a) {
    	 
    	 
     System.out.println("this is show2 fumc..  "+a);
     
     }
      public static void main(String[] args) {
		
    	  over_loading o1=new over_loading();
    	  o1.Show(5);
	}

}
