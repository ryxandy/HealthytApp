package com.healthycoderapp;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class BMICalculatorTest {

	@Test
	void should_Return_When_DietRecommended() {
		//Given
		Double weight = 75.0;
		Double Height = 1.65;
		//When
		Boolean recommended = BMICalculator.isDietRecommended(weight, Height);
		//Then
		assertTrue(recommended);
	}

	@Test
	void should_Not_Return_When_DietRecommended() { 
		//Given
		Double weight = 40.0;
		Double Height = 1.95;
		//When
		Boolean recommended = BMICalculator.isDietRecommended(weight, Height);
		//Then
		assertFalse(recommended);
		}

	//Mutiple assertions
	@Test
	void indCoderWithWorstBMI() {
		//Given
		List<Coder> coders = new ArrayList();
		coders.add(new Coder(1.80, 60.0));
		coders.add(new Coder(1.82, 98.0));
		coders.add(new Coder(1.80, 64.7));
		
		//When
		Coder coderWorstBMI = BMICalculator.findCoderWithWorstBMI(coders);
		//Then
			assertAll(
				() ->assertEquals(1.85, coderWorstBMI.getHeight()),
				() ->assertEquals(98.5, coderWorstBMI.getHeight()),
				() ->assertEquals(5.5, coderWorstBMI.getHeight())
		);
	}
}
	
	
