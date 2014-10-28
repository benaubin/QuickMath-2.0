package com.bensites.java.QuickMath.core.Operators;

import com.bensites.java.QuickMath.core.Operator;

public class Subtract extends Operator {

	public Subtract() {
		super("-",3);
	}
	@Override
	public double doOperation(double left, double right){
		return left - right;
	};
}