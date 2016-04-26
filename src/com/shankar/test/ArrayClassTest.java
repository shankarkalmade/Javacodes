package com.shankar.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayClassTest {

	@Test
	public void testAdd() {
		
		ArrayClass test = new ArrayClass();
		assertEquals(60, test.add(10,20,30));
		
		
	}

	@Test
	public void testMultiply() {
		ArrayClass test = new ArrayClass();
		assertEquals(30, test.multiply(1,30));
		
	}

}
