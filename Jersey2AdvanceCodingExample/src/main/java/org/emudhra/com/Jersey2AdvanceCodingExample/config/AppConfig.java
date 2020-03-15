package org.emudhra.com.Jersey2AdvanceCodingExample.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/rest")
public class AppConfig extends ResourceConfig{

	public AppConfig() {
		packages("org.emudhra.com.Jersey2AdvanceCodingExample");
	}
}
