package com.junit;



import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class RunnerClass {
	
	
	public static void main(String[] args) {
	Result result=JUnitCore.runClasses(SuitDemo.class);
	}

}
