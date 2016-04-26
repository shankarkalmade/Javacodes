package com.shankar.codes;

public class SecondLowest {

	public static void main(String[] args) {
		
	
	int numbers[] = {6,3,37,12,46,5,64,21};
	int lowest = numbers[0];
	 int second_lowest =numbers[0];
	 
	for(int n:numbers){
	 
	System.out.println(lowest+"  "+ second_lowest+"   "+ n);	
		
	if(n < lowest ){
			
		System.out.println("highets updated");
	      second_lowest = lowest;
	      lowest =n;
	 
	 } else if(n < second_lowest){
		 System.out.println("second highets updated");
	                second_lowest = n;
	 
	}
	 
	}
	        System.out.println("First Max Number: "+lowest);
	        System.out.println("Second Max Number: "+second_lowest);

	 
	 }
	
}
