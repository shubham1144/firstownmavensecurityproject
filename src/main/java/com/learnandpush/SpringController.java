package com.learnandpush;
//create a controller that will intercept the request that is obtained by the servlet by 
//using servlet mapping in the web.xml file and then take the necessary action based on requestmapping

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//mention this controller annotation otherwise the system framework will b=not be able to register the controller !!and without registration we will not be able to use the controller
@Controller
public class SpringController {
	@RequestMapping(value= "/testurl", method=RequestMethod.GET)
	public String testurl(){
		return "index";
	}
	
}
