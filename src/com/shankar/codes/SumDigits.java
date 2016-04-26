package com.shankar.codes;

public class SumDigits {

	
	public static void main(String[] args) {
		
		int number = 12545;
		
		int sum =0;
		
		while (number!=0){
			
			sum += number%10;
			number= number/10;
			
			
			
		}
		
		System.out.println(number+"  Addition :   "+ sum);
		
	}
	
	
}
