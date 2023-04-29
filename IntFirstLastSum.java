package practices;

public class IntFirstLastSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=157;
		int first=0;
//  	String a=Integer.toString(n);
//int l=a.length()-1;
//char ch=a.charAt(0);
//char b=a.charAt(l);
//System.out.println(ch);
//System.out.println(b);
		System.out.println("Last Number="+n%10);
int sum=0;
while(n!=0) {
	first=n%10;
	sum+=first;
	n=n/10;
}

System.out.println("sum="+sum);
System.out.println("First Number="+first);
//  	String s[]=a.split("");




	}

}
