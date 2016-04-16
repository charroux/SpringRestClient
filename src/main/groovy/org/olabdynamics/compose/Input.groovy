package org.olabdynamics.compose

import groovy.transform.ToString;

@ToString
class Input{
	def type	// mime ou class ou application Compose (pas de type primitif style int car aucun sens dans approche métier)
	def value	// souvent jsons ou image...
	def adapter
}

