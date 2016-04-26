package com.shankar.codes;

public class FibRecursive {

	static int maxLimit=100;
	
	public static void main(String[] args) {
		
		printFib(0,1);
		
		
	}

	private static void printFib(int i, int j) {
	
		int sum =0;
		
		if(i==0){
			
			System.out.println(i +"  \n"+j);
		}
		
		sum  = i+j;
		
		if(sum< maxLimit){
			
			i =j ;
			j = sum;
			System.out.println(sum);
			printFib(i, j);
			
			
		}
		
		
		
	}
	
	
}
