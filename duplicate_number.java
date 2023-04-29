package collection;

import java.util.*;

public class duplicate_number {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		String a = "10,20,30,40,10,20,20";
		String arr[] = a.split(",");
		
		Set s = new HashSet();

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					s.add(arr[i]);
				}
			}
		}
//		Iterator it = s.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//	}
			for (Object object : s) {
				System.out.println(object);
				
		}
	}
}
