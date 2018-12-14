package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable{
	
	@Override
	public void plus(int a, int b) {
		System.out.println(a+" + "+b+" = "+(a+b));
	};
	
	@Override
	public void minus(int a, int b) {
		System.out.println(a+" - "+b+" = "+(a-b));
	};
	
	@Override
	public void multiply(int a, int b) {
		System.out.println(a+" * "+b+" = "+(a*b));
	};
	
	@Override
	public void devide(int a, int b) {
		System.out.println(a+" / "+b+" = "+(a/b));
	};

}
