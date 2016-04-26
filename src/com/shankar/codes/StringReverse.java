package com.shankar.codes;

public class StringReverse {
	
	
	public static void main(String[] args) {
		
		String original = "shankarkalmade";
		
		String reverse1= reverse(original); 
		System.out.println(reverse1);
		
		
		
		
		
		String reverse2 = reverse2(original);
		System.out.println(reverse2);
		
		
		
		
	}

	public static String reverse2(String original) {
		
		int start = 0;
		int end =original.length()-1;
		
		while (start< end){
			
			char tmp = original.charAt(start);
			char [] array = original.toCharArray();
			array[start]= array[end];
			array[end]= tmp;
			
			original= new String(array);
			
			start++;
			end--;
		}
		
		
		
		return original;
	}

	private static String reverse(String original) {
		
		String reverse= "";
		
		for(int i= original.length()-1; i>=0; i-- ){
			
			reverse+=original.charAt(i);
			
		}
		
		return reverse;
	}

	
	
	
}
