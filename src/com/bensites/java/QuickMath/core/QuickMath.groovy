package com.bensites.java.QuickMath.core

import java.util.ArrayList
import java.lang.Runtime

import com.bensites.java.QuickMath.core.Operators.RegisterCore

class QuickMath {
	public static OperatorRegistry registry = new OperatorRegistry()
	public static void main(String[] args) {
		println "Welcome to QuickMath 2.0!"
		println "Registering operators"
		RegisterCore.register()
		if(args.length != 0)
			run(args)
		else {
			Scanner input = new Scanner(System.in)
			while(true) {
				println()
				println("------------------------")
				print("EasyCalc> ")
				String argsRaw = input.nextLine()
				if(argsRaw != "42") {
					String temp = "";
					ArrayList<String> paramsLocal = new ArrayList<String>()
					for (char c : argsRaw.toCharArray()) {
						if(c == ' ') {
							paramsLocal.add(temp)
							temp = ""
						} else 
							temp = temp + c
					}
					paramsLocal.add(temp)
					try {
						run(paramsLocal.toArray())
						println()
					} catch(e) {
						println("Please enter a valid expression")
					}
				} else {
					println("Congrats! You hacked life!")
					while(true) {
						print(InetAddress.getLocalHost().getHostName() + ":~ " + System.getProperty("user.name") + "\$ ")
						try{Runtime.getRuntime().exec(input.nextLine())}
						catch(java.lang.IllegalArgumentException | java.io.IOException e)
						{println("Please enter a valid bash command")}
					}
				}
			}
		}
	}
	public static ArrayList<String> toArray(Object[] args){
		ArrayList<String> argsList = new ArrayList<String>()
		for(String argument : args)
			argsList.add(argument)
		return argsList
	}
	public static run(Object[] args){
		ArrayList<String> paramslocal = toArray(args)
		paramslocal.get(1)
		println()
		println("Now Running:")
		for (String arg : args)
			print(arg + " ")
		println()
		println()
		println("The answer is:")
		Operator operation = registry.getFromString(paramslocal.get(1))
		print(operation.doOperation(paramslocal))
	}
}
