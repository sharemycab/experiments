package com.example;

import java.net.URI;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

public class HttpServerFactory {
	
	private static HttpServer server = null;
	public static void startServer(URI baseUri, ResourceConfig resourceConfig){
		server = GrizzlyHttpServerFactory.createHttpServer(baseUri, resourceConfig);
	}
	
	public static void stopServer(){
		if( server != null )
			server.stop();
	}
	 

}
