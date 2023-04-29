package collection;



public class String_rotation {
	public static void main(String[] args) {
		String s = "abcd";
		String s1 ="bcd";
		
		String s2 = s+s;
		//System.out.println(s1);
		if(s2.contains(s1)) {
			System.out.println("yes ! this String contain ");
		}
		else if(s1 == null || s == null) {
			System.out.println("Your String is Null");
		}
		else {
			System.out.println("Not Match ");
		}
	}

}
