package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathTest {

	@Test
	void testAdd() {
		Maths math = new Maths();
		int result = math.add(1, 2);
		
		assertEquals(3, result);
		
	}
	
	
	@Test
	void testSubtraction() {
		Maths math = new Maths();
		int result = math.subtract(12, 10);
		assertEquals(2, result);
		
	}
	
	@Test
	void division() {
		Maths math = new Maths();
		float result = math.divide(5, 2);
		assertEquals(2.5, result);
	}

}
