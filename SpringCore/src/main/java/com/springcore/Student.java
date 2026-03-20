package com.springcore;

public class Student {
    private int sid;
    private String sname;
    private String saddr;

    // Getter and Setter for sid
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    // Getter and Setter for sname
    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    // Getter and Setter for saddr
    public String getSaddr() {
        return saddr;
    }

    public void setSaddr(String saddr) {
        this.saddr = saddr;
    }

	public Student(int sid, String sname, String saddr) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.saddr = saddr;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", saddr=" + saddr + "]";
	}
}