package com.shankar.codes;

public class PrimeNumber {
	
	
	public static void main(String[] args) {
		
		int maxLimit= 50;
		
		
		printPrimeNumbers(maxLimit);
		
		
		
		
	}

	private static void printPrimeNumbers(int maxLimit) {
		int count =0;
		for(int i=2; i<=maxLimit; i++){
			count =0;
			for(int j=2; j<=i/2; j++){
				
				if(i%j==0){
					count++;
					break;
					
				}
				
			}
			
			if(count==0){
				
				System.out.println("Prime number: "+ i);
			}
			
		}
		
		
	}
	
}
