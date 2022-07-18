package com.java.map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Linked_Map {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lm = new LinkedHashMap<Integer, String>();
		lm.put(1, "Arvind");
		lm.put(2, "Sri");
		lm.put(3, "vj");
		lm.put(3, "kas");
		lm.put(2, "hema");
		System.out.println(lm);
		int s = lm.size();
		System.out.println("Size of Input:" + s);

		boolean ck = lm.containsKey(4);

		System.out.println(ck);

		boolean cv = lm.containsValue("Sri");

		System.out.println(cv);

		Set<Integer> ks = lm.keySet();

		System.out.println(ks);
		Collection<String> v = lm.values();
System.out.println(v);
		for (Map.Entry m : lm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
