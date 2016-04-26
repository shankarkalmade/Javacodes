package com.shankar.codes;

import java.util.ArrayList;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<Object>();
	    
	    al.add("java");
	    al.add('a');
	    al.add('b');
	    al.add('a');
	    al.add("java");
	    al.add(10.3);
	    al.add('c');
	    al.add(14);
	    al.add("java");
	    al.add(12);
	    System.out.println(al);

	    ArrayList<Object> distinctElements= removeDuplicates(al);
		
	   
	   System.out.println(distinctElements);
	   
	   for(Object obj : distinctElements){
		   System.out.println(obj);
	   }
	   
	}

	private static ArrayList<Object> removeDuplicates(ArrayList<Object> al) {
	
		ArrayList<Object> distinct = new ArrayList<Object>();
		
		for(int i=0; i<al.size(); i++){
			
			for(int j=i+1; j<=al.size()-1; j++){
				
				if(al.get(i).equals(al.get(j))){
					al.remove(j);
					
				}
				
			}
			
			
			
		}
		
		
		distinct = al;
		return distinct;
	}
	

}
