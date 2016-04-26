package com.shankar.codes;

import java.util.Scanner;

public class BinToDecimal {
	
	public static void main(String[] args) {
		
		System.out.println("Enter Binary value : ");
		Scanner scanner = new Scanner(System.in);
		
		int input= scanner.nextInt();
		
		int decimal = convertToDecimal(input);
		
		System.out.println(input+" is:   "+decimal);
	}

	private static int convertToDecimal(int input) {
		
		int decimal= 0;
		
		int power=0;
		
		while (true){
			
			if(input==0){
				
				break;
			}else{
				
				int tmp = input % 10;
				decimal+= tmp * Math.pow(2,power);
				power++;
				input= input/10;
				
			}
			
		}
		
		return decimal;
	}
	
}
