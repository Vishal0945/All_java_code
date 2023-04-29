package collection;

import java.util.HashMap;

public class duplicate {
	public static void main(String[] args) {
		String a = "aabbccad";
	
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < a.length(); i++) {
			char ch = a.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}

		}
		for (char n : map.keySet()) {	
			System.out.println("key = " + n + "    value = " + map.get(n));
	

		}
	}

}
