package collection;

public class FindVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aeioubnmnbnm";
		int vowels=0;
		int cons=0;
		 for (int i = 0; i < s.length(); i++) {
			 if ((s.charAt(i)=='a')||(s.charAt(i)=='e')||(s.charAt(i)=='i')||(s.charAt(i)=='o')||(s.charAt(i)=='u')) {
				vowels++;
			}
			 else {
				cons++;
			}
			 
			 
			
		}
		 System.out.println("vowels :"+vowels);
		 System.out.println("consonents :"+cons);


 }
}