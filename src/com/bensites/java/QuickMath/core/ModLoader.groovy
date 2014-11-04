package com.bensites.java.QuickMath.core;

import java.io.File;

public class ModLoader {
	
	def classLoader = Thread.currentThread().contextClassLoader
  	static load(File folder) {
		 folder.createTempDir()
		 folder.listFiles().each {file ->
			if (file.name.endsWith('.jar')) {
				  println "Found: ${file.absolutePath}"
				  classLoader.addURI(new URL('file:' + file.absolutePath))
			}
		 }
	}
}
