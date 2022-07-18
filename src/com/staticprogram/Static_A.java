package com.staticprogram;

public class Static_A {
	
	static String a ="health";
	static void condition() {
      a="wealth";
      
	}
		}
	
       class Static_b extends Static_A{
	    public static void boss() {
          System.out.println("result:"+a);
		}
	

}
