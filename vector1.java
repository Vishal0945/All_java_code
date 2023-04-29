package collection;

import java.util.Iterator;
import java.util.Vector;

public class vector1 {
	
	public static void main(String[] args) {	
		
	Vector<String> v=new Vector<String>();
	
	v.add("vishal");
	v.add("amit");
	v.add("harsh");
	v.add("himanshu");
	
	Iterator<String> itr=v.iterator();
	while (itr.hasNext()) {
		System.out.println(itr.next());	
	}
} 
}
