package com.shankar.codes;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		
		int number = 12345;
		int reverse = 0;
		
		
		while(number>0){
			
			
			
			int num =number%10;
			
			reverse = num + (reverse * 10);
			
			System.out.println(number +"   "+num+"   "+ reverse);
			
			number = number/10;
			
			
		} 
		
		System.out.println(reverse);
		
	}
	

}
