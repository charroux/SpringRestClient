package org.olabdynamics.compose

import groovy.transform.ToString;

@ToString
class Output{
	def type	// mime ou class ou application Compose (pas de type primitif style int car aucun sens dans approche métier)
	def value	
	def adapter
}
