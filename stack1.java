package collection;
import java.util.*;
public class stack1 {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push("A");
		s.push("B");
		s.push("C");
		System.out.println(s);
		
		System.out.println(s.pop());//C  is ka matlab last wale  ko out kr deta hai
		System.out.println(s);//[A, B]
		System.out.println(s.peek());//B   is ka matlab ki current value return karta hai
		System.out.println(s.search("A"));//2  search krayga aur 1 indexing se start hota hai
		System.out.println(s.search("Z"));//-1
		System.out.println(s.empty());//false 
		System.out.println(s.contains("B"));//contains method eguals method call karta hai
		System.out.println(s);
		
		
		
		
	}

}
