package com.sandeepps.processor;


import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.sandeepps.model.Employee;

public class MyProcessor implements Processor {

	public void process(Exchange exchange) throws Exception {
		Employee employee = exchange.getIn().getBody(Employee.class);
		employee.setEmpName("SANDEEP Rocks");
		exchange.getIn().setBody(employee);
	}

}