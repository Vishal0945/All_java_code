package collection;

import java.util.ArrayList;
import java.util.Iterator;
//import java.util.List;

public class limit_object{
	public static void main(String[] args) {
		ArrayList<String> e=new ArrayList<String>();
		
	e.add("harsh");
	e.add("vishal");
	e.add("himanshu");
	
	Iterator<String> itr= e.iterator();
		
		  while(itr.hasNext()){  
			   System.out.println(itr.next());  
	
		  }
	System.out.println(e.get(1));
	
	
for (String string : e) {
//	System.out.println(string);	
	if (string=="vishal")
	{
		System.out.println(string);
	}
}
		
	}
}