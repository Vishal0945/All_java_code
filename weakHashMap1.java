package collection;

import java.util.WeakHashMap;

public class weakHashMap1 {
	
	public static void main(String[] args) throws Exception{
		WeakHashMap m=new WeakHashMap();
		Temp t=new Temp();
		m.put(t,"vishal");
		System.out.println(m);
		t=null;
		System.gc();
		System.out.println(m);
	}

}

class Temp{
	public String toString() {
		return "Temp";
		
	}
	
	public void finalize()
	{System.out.println("fialize method");}
}