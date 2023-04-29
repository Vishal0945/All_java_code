package collection;

import java.util.*;

public class sort {
	
	public static void main(String[] args) {
		ArrayList<Integer> t=new ArrayList<Integer>();
		
		t.add(1);
		t.add(4);
		t.add(5);
		t.add(2);
		t.add(7);
		
		Collections.synchronizedList(t);
		Collections.sort(t); 
		
		System.out.println("after the sort :"+t);
		
	}

}
