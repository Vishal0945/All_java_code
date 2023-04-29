package practices;

import java.util.Arrays;

public class String_Sorting {
	public static void main(String[] args) {
		String array[]= {"vishal","aman","aam","himanshu"};
		Arrays.sort(array);
		
		for (String string : array) {
			System.out.println(string);
		}
	}

}
