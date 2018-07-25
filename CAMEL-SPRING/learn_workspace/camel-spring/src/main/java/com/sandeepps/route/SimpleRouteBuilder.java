package com.sandeepps.route;

import org.apache.camel.builder.RouteBuilder;
import com.sandeepps.processor.MyProcessor;

public class SimpleRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:D:/temp/inputtest?noop=true").process(new MyProcessor()).to("file:D:/temp/outputtest");
    }

}
