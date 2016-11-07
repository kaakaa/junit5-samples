package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.expectThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;


class ExceptionTest {
	@Test
	void exceptionTest() {
		Calculator calculator = new Calculator();
		Throwable exception = expectThrows(ArithmeticException.class, 
			() -> calculator.div(1, 0)
		);
		assertEquals("/ by zero", exception.getMessage());
	}

}
