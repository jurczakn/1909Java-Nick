package com.revature.controller;

import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("/hello")     //extends Component
public class HelloWorldController {

	private static Logger log = Logger.getLogger("HelloWorldControllerLogger");
	
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody String getHelloWorld() {
		log.info("Hello World!");
		return "Hello World!";
	}
	
}
