package com.sandeepps;

import org.apache.camel.builder.RouteBuilder;

public class SimpleRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from("file:D:/temp/inputtest").split().tokenize("\n").to("jms:queue:SANDEEPS.CAMEL");
	}

}
