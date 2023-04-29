package collection;

public class FindFirstLetter {
public static void main(String[] args) {
	String s="Apple Is here";
	String arr[]=s.split(" ");
		for (int j = 0; j < arr.length; j++) {
			
			char ch =arr[j].charAt(0) ;

			System.out.println(ch);
		}
}
}
