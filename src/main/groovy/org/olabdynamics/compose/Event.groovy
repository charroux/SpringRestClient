package org.olabdynamics.compose

import groovy.transform.ToString;

@ToString
class Event {
	
	Direction direction
	def name
	def type	// mime ou class ou application Compose (pas de type primitif style int car aucun sens dans approche métier)
	def value	// souvent jsons ou image...
	def adapter

}

enum Direction{
	InComing,
	OutGoing
}
