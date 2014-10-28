package com.bensites.java.QuickMath.core

import java.util.ArrayList
import java.util.HashMap

public class OperatorRegistry {
	def HashMap<String, Operator> Registry = new HashMap<String, Operator>()
	def ArrayList<Operator> operators = new ArrayList<Operator>()
	
	public Operator register(Operator operator){
		Registry.put(operator.getOperator(), operator)
		operators.add(operator)
		operator
	}
	
	public Operator getFromString(String operator){
		Registry.get(operator)
	}
}
