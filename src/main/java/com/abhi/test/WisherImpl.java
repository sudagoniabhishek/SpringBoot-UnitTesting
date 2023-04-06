package com.abhi.test;

public class WisherImpl implements Wisher {

	public String sayHi(String name) {
		
		if(name == null || name.length() == 0) {
			throw new IllegalArgumentException();
		}
		return "Hello "+name;
	}

}
