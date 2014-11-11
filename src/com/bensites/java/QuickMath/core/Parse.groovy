package com.bensites.java.QuickMath.core

class Parse {
	OperatorRegistry registry
	Parse(){
		println "Registering Registry"
		registry = new OperatorRegistry()
	}
	void parse(List<String> expression) {
		expression.each { String -->
			
		}
		if(expression.contains("("){
			def openBrackets = []
			def closeBrackets = []
			for(i in 0..expression.size()-1) {
				if(expression.get(i) == "(")
					openBrackets.add(i)
				if(expression.get(i) == ")")
					closeBrackets.add(i)
			}
		}
		
	}
}
