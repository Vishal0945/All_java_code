package collection;

import java.util.HashSet;
import java.util.Set;

public class Remove_duplicate_element {
	
	public static void main(String[] args) {
		String q="vishal chauhan";
		String str="";
//		String arr[]=q.split("");
		
		for (int i = 0; i <q.length(); i++) {
			char ch=q.charAt(i);
			if (str.indexOf(ch)<0) {
				str+=ch;
				
			}
			
			}
		System.out.println(str);
			
		}

		

	}
 