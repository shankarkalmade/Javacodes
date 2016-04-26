package com.shankar.test;

public class ArrayClass {
	
	
    public int add(int... number) {
        int total = 0;
        for (int i : number) {
                total += i;
        }
        return total;
}

public int multiply(int... number) {
        int product = 1;
        for (int i : number) {
                product *= i;
        }
        return product;
}


}
