package com.primeNo;

public class Prime_NumberMulti {
   public static void main(String[] args) {
	
	   for (int i = 2; i <=100; i++) {
		int c=0;
		for (int j = 2; j < i; j++) {
			if (i%j==0) {
				c++;
			}
		    }
		    if (c==0) {
				System.out.println("Prime Number ="+i);
			}
		    else {
				System.out.println("Not a PrimeNumber ="+i);
			}
	}
	}
    }
