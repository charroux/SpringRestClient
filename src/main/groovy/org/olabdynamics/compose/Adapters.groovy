package org.olabdynamics.compose

import groovy.transform.ToString;

enum UnidirectionalAdapter{
	File,
	HTTP,
	FTP,
	SFTP,
	Feed,
	Stream,
	SQL,
	NoSQL,
	Mail,
	UDP,
	TCP,
	AMQP,
	MQTT,
	WebSocket
}

enum BidirectionalAdapter{
	AMQP,
	WebService,
	JavaApplication
}

@ToString
class FileAdapter{
	def adapter = UnidirectionalAdapter.File
	def directory
}

@ToString
class WebServiceAdapter{
	def adapter = BidirectionalAdapter.WebService
	def wsdl
}

@ToString
class HttpWebServiceAdapter{
	
	enum Method { GET, PUT, POST }
	
	def adapter = UnidirectionalAdapter.HTTP
	def url
	def method
}

@ToString
class JavaServiceAdapter{
	def adapter = BidirectionalAdapter.JavaApplication
	def javaClass 
	def method
}
