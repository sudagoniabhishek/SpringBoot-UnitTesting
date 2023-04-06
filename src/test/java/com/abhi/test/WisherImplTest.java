package com.abhi.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;



public class WisherImplTest {
	
	private  WisherImpl WISHER_IMPL;
	
	@BeforeEach
	public void preSetUp() {
		System.out.println("Before test invoked");
		WISHER_IMPL=new WisherImpl();
	}

	
	@Test
	public void testSayHello() {
		WisherImpl impl=WISHER_IMPL;
		String response = impl.sayHi("abhishek");
		Assertions.assertNotNull(response);
		Assertions.assertEquals("Hello abhishek", response);
	}
	
	@Test
	public void testSayHelloShouldThrowException() {
		WisherImpl impl=WISHER_IMPL;
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {String response = impl.sayHi("");});
	}
	@Test
	public void testSayHelloShouldThrowExceptionForNullInput() {
		WisherImpl impl=WISHER_IMPL;
		Assertions.assertThrows(IllegalArgumentException.class, () -> {String response = impl.sayHi(null);});
	}
	@AfterEach
	public void cleanUp() {
		System.out.println("After test invoked");
		WISHER_IMPL=null;
	}

}
