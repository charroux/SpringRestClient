package org.olabdynamics.compose

import groovy.transform.ToString;

@ToString
class Event {
	
	def name
	
	Input input		// une seule input mais qui peut contenir plusieurs messages
	Output output	// une seule output mais qui peut contenir plusieurs messages


}
