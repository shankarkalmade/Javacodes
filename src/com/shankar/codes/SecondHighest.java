package com.shankar.codes;

public class SecondHighest {

	public static void main(String[] args) {
		
		int numbers[] = {6,3,37,12,46,5,64,21};
		int highest = 0;
		 int second_highest = 0;
		 
		for(int n:numbers){
		 
		System.out.println(highest+"  "+ second_highest+"   "+ n);	
			
		if(highest < n){
				
			System.out.println("highets updated");
		      second_highest = highest;
		      highest =n;
		 
		 } else if(second_highest < n){
			 System.out.println("second highets updated");
		                second_highest = n;
		 
		}
		 
		}
		        System.out.println("First Max Number: "+highest);
		        System.out.println("Second Max Number: "+second_highest);

		 
		 }
		
	}
	


