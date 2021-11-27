package com.practice.testCases;

import org.apache.log4j.PropertyConfigurator;

public class BaseClass {

	public BaseClass() {
		// TODO Auto-generated constructor stub
		PropertyConfigurator.configure("log4j.properties");
		System.out.println("i am Here");
	}
}
