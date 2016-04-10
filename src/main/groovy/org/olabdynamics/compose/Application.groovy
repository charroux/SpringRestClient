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

class Result implements Comparable<Result>{
	
	def value

	@Override
	public int compareTo(Result result) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

