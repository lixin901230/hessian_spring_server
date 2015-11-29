package com.lx.hession.service.impl;

import com.lx.hession.service.IHelloService;

public class HelloServiceImpl implements IHelloService {

	private static final long serialVersionUID = -3903948931196160656L;

	@Override
	public String sayHello(String name) {
		
		return "Hello "+name+" First Hessian!";
	}

}
