package practices;
public class reverse_string {
	public static void main(String[] args) {
		int l;
		
		String s="vishal";
		String s2="";
	    l=s.length();
		
//	    for (int i =l-1 ; i>=0 ; i--) {
//			s2=s2+s.charAt(i);
//		}
	    for (int i = 0; i < s.length(); i++) {
			s2=s.charAt(i)+s2;
		}
	    System.out.println(s2);
	    
//	    System.out.println("this is your input     :"+s);
//	    System.out.println("this is reverse string :"+s2);
	}

}