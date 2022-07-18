package com.java.map;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Hash_Map {

	public static void main(String[] args) {
		
		TreeMap<Integer, Object> hm=new TreeMap<Integer, Object>();
		
		hm.put(15, "loki");
		hm.put(12, "Nani");
		hm.put(10, "Sindhu");
		hm.put(14, "Loki");
		
	//	System.out.println(hm);
		
		int s = hm.size();
		
		System.out.println(s);
		 
		Set<Integer> ks = hm.keySet();
		
		System.out.println(ks);
		
		
		Collection<Object> values = hm.values();
		System.out.println(values);
		
		System.out.println(hm.containsKey(1));
		System.out.println(hm.containsValue("loki"));
		
		Object o = hm.get(11);
		System.out.println(o);
		for (Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+"  "+m.getValue());
		}
		
		
		
	}
	
	
	
	
	

}
