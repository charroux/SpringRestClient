package org.olabdynamics.compose

import groovy.transform.ToString
import groovy.transform.AutoClone

@ToString
@AutoClone
class Application {
	
	def specifications
	def name
	def description
	
	def language
	
	Input input		// une seule input mais qui peut contenir plusieurs messages
	Output output	// une seule output mais qui peut contenir plusieurs messages

	def state		
}

enum State{
	TERMINATED,
	FAILED,
	RUNNING
}

