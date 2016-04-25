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
	
	def properties = [:]
	
	Input input		// une seule input mais qui peut contenir plusieurs messages
	Output output	// une seule output mais qui peut contenir plusieurs messages

	def state		
}

@ToString
class Input{
	def type	// mime ou class ou application Compose (pas de type primitif style int car aucun sens dans approche métier)
	def value	// souvent jsons ou image...
	def adapter
}

@ToString
class Output{
	def type	// mime ou class ou application Compose (pas de type primitif style int car aucun sens dans approche métier)
	def value
	def adapter
}

enum State{
	TERMINATED,
	FAILED,
	RUNNING
}

