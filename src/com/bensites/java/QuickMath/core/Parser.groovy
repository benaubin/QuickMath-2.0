package com.bensites.java.QuickMath.core

import com.bensites.java.QuickMath.core.Operators.RegisterCore

class Parser {
	OperatorRegistry registry = new OperatorRegistry()
	Parser(){
		RegisterCore.register()
	}
	Expression parse(List<String> expression) {
		
		if(expression.contains("("){
			def openBrackets = []
			def closeBrackets = []
			for(i in 0..expression.size()-1) {
				if(expression.get(i) == "(")
					openBrackets.add(i)
				if(expression.get(i) == ")")
					closeBrackets.add(i)
			}
			for(i in 0..openBrackets.get(1)) {
				
			}
		}
		
	}
}