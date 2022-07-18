package com.primeNo;

public class Prime_NumberSingle {       //anything div by itslef  eg; 1/1 2/2 3/3 5/5 7/7....
    public static void main(String[] args) {
		 
    	int a=12;
    	int c=0;
    	for (int i = 2; i < a; i++) {
    		if (a%i==0) {
    			c++;
		}
		}
    	   if (c==0) {
			System.out.println("Prime Number ="+a);
		}
    	   else {
			System.out.println("Not a Prime ="+a);
		}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
	}
}
