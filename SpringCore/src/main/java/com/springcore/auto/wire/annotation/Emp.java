package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
//	@Autowired
	private Address addr;

	public Address getAddr() {
		return addr;
	}
	@Autowired
	public void setAddr(Address addr) {
		System.out.println("set value");
		this.addr = addr;
	}
	@Autowired
	public Emp() {
		super();
		this.addr=addr;
		System.out.println("Inside Constructor");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [addr=" + addr + "]";
	}
	
}
