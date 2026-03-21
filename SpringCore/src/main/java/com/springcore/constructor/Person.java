package com.springcore.constructor;

import java.util.List;

public class Person {
	private String name;
	private int pid;
	private Certi cer;
	private List<String>list;
	public Person(String name,int pid,Certi cer,List<String>list) {
		this.name=name;
		this.pid=pid;
		this.cer=cer;
		this.list=list;
	}
	
	public String toString() {
		return this.name+" : "+this.pid+"{"+this.cer.name+"}"+this.list;
	}
}
