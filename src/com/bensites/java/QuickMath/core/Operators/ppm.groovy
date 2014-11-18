package com.bensites.java.QuickMath.core.Operators;

import com.bensites.java.QuickMath.core.Operator

/**
 * Parts per million
 * @author Ben
 *
 */
public class ppm extends Operator{

	public ppm() {
		super("ppm",3)
	}
	@Override
	double doOperation(double left, double right) {
		left / right * 1000000
	}

}
