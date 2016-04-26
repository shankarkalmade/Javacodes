package com.shankar.codes;

public class FibIterative {

	static int maxLimit= 100;
	
	public static void main(String[] args) {
		
		printFib(maxLimit);
		
		
		
		
		
	}

	private static void printFib(int maxLimit2) {
		
		int f1= 0;
		int f2= 1;
		System.out.println(f1 +"\n"+ f2);
		
		while((f1+ f2)< maxLimit){
			
			int sum = f1 +f2;
			
			f1 = f2;
			f2 = sum;
			
			System.out.println(sum);		
					
			
		}
		
		
		
	}
	
	
}
