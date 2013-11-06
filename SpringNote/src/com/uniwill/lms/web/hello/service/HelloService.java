package com.uniwill.lms.web.hello.service;

import org.springframework.stereotype.Service;

@Service(value="IHelloService")
public class HelloService implements IHelloService {

	@Override
	public String getGugudan(int num) {
		String str = "";
		
		for(int i = 0 ; i < 10 ; i++) {
			str += num + " * " + i + " = " + (num * i) + "<br/>"; 
		}
		
		return str;
	}

}
