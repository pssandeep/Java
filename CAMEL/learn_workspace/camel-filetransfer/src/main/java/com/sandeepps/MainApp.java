package com.sandeepps;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SimpleRouteBuilder routeBuilder = new SimpleRouteBuilder();
        CamelContext ctx = new DefaultCamelContext();
        try {
            ctx.addRoutes(routeBuilder);
            ctx.start();
            System.out.println("START");
            Thread.sleep(5 * 60 * 1000);
            ctx.stop();
            System.out.println("STOP");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
	}

}
