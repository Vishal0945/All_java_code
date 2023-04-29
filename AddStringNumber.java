package collection;

public class AddStringNumber {
public static void main(String[] args) {
	String s="1234";
//	int sum=0;
//	String arr[]=s.split("");
//	for (String string : arr) {
//		int a=Integer.parseInt(string);    //string ko integer m change krn ka tarika 
//		
//		sum+=a;
//	}
//	System.out.println(sum);
	
	
	int sum=0;
	for (int i = 0; i < s.length(); i++) {
		String s1=Character.toString(s.charAt(i));  //Character ko string m change krne ka tarika
//		String n=Integer.toString(1);  
		int no=Integer.parseInt(s1); //string ko integer m change krne ka tarika
		sum+=no;
	}
	System.out.println(sum);
	
}

}
