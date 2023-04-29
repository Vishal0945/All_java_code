package practices;
import java.util.*;
public class LinkList {
	public static void main(String[] args) {
		LinkedList<String> a = new LinkedList<String>();
		a.add("A");
		a.add("B");
		a.add("C");
		a.add("D");
		a.add("E");
		a.add("D");
		a.add("F");
		
		System.out.println(a);
		a.addFirst("Vishal");
		a.addLast("Chahuhan");
		System.out.println(a);
		a.removeFirst();
		a.removeLast();
		a.removeFirstOccurrence("C"); // start se Jo "C" milega use remove krega
		System.out.println(a);
		a.removeLastOccurrence("D");
		System.out.println(a);
		
		Iterator<String> i = a.iterator();
		
		while(i.hasNext()) {
			System.out.println("gdfsf :"+i.next());
		
		}
		System.out.println(i.hasNext());

	}

}
