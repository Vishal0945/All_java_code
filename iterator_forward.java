package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class iterator_forward {
	
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		for (int i = 0; i <=10; i++) {
			a.add(i);
			
			
		}
		
//		System.out.println(a);
//		Iterator itr=a.iterator();
//		while (itr.hasNext()) {
//			Integer i = (Integer) itr.next();
//			if (i%2==0) 
//				System.out.println(i);
//			
//			else 
//				itr.remove();
//			
//			System.out.println(a);
//		}

	
	
	
//	arraylist bana kr us m hashset ko add kr dia matlab ki arraylist ka sare method hashset m add kr diye
		
		
		
		
	   ArrayList<String> list=new ArrayList<String>();  
       list.add("Ravi");  
       list.add("Vijay");  
       list.add("Ajay");  
//         
       HashSet<String> set=new HashSet(list);  
       set.add("Gaurav"); 
       System.out.println(list);
       System.out.println(set);
       
     
	
       for (String string : set) {
    	   
    	   if(string=="Ajay") {
    		   
    	   set.remove("Ajay");
    	   }
	}
       System.out.println(set);
       
	
	
	
//	  public static void main (String args[])   
//	    {  
//	        for(int i=0; i<1; i++)   
//	        {  
//	            System.out.println("Hello Javatpoint");  
//	        }  
	    }  
//		
		
	}

