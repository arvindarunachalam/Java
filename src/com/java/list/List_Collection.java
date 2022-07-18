package com.java.list;

import java.util.ArrayList;

public class List_Collection {

	public static void main(String[] args) {
		 ArrayList<Object> al = new ArrayList<Object>();
		 
		 al.add("arvind");
		 al.add(23);
		 al.add(675);
		 al.add("rtr");
 ArrayList<Object> al1= new ArrayList<Object>();
		 
		 al.add("nani");
		 al.add(46);
		 al.add(45);
		 al.add("mnm");
//		 System.out.println(al);
		 
		System.out.println(al.size()); 
		
          al.remove(0);
          System.out.println(al);	
          
          int in = al.indexOf("rtr");
          System.out.println(in);
        
       System.out.println( al.retainAll(al1)); 
          
          
          
          
          al.removeAll(al);
          System.out.println(al);
          
//          al.addAll(al);
//          System.out.println(al);
//          
//          
//          
//          al.retainAll(al);
//          System.out.println(al);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
