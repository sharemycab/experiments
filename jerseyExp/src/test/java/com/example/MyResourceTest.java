package com.example;

import static org.junit.Assert.*;

import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.server.ResourceConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyResourceTest {

	private static String BASE_URI = "http://localhost:8080/base";
	private static Client c = null;

	@Before
	public void setUp() throws Exception {
		ResourceConfig resourceConfig = new ResourceConfig(MyResource.class);
		HttpServerFactory.startServer(new URI(BASE_URI),resourceConfig);
		c = ClientBuilder.newClient();
	}

	@After
	public void tearDown() throws Exception {
		HttpServerFactory.stopServer();
		c.close();
	}

	/**
	 * Test to see that the message "Got it!" is sent in the response.
	 */
	@Test
	public void testGetIt() {
		WebTarget target = c.target(BASE_URI);

		String responseMsg = target.path("myresource").request()
				.get(String.class);
		assertEquals("Got it!", responseMsg);
	}
}