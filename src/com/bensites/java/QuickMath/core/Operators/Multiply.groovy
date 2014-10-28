package com.bensites.java.QuickMath.core.Operators;

import com.bensites.java.QuickMath.core.Operator;

public class Multiply extends Operator {

	public Multiply() {
		super("x",3)
		new Multiply(true)
		
	}
	private Multiply(boolean bool) {
		super("*",3)
		new Multiply(0)
	}
	private Multiply(int intthing) {
		super("•",3)
	}
	@Override
	public double doOperation(double left, double right){
		return left * right
	};
}