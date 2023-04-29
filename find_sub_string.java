package collection;

public class find_sub_string {
public static void main(String[] args) {
	String s="abcd";
	//System.out.println(s.substring(0,3));
	for (int i = 0; i < s.length(); i++) {
		
		for (int j = i+1; j <= s.length(); j++) {
			String s2 = s.substring(i, j);
			System.out.println(s2);
		}
	}
}

}
