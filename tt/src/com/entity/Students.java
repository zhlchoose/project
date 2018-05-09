package com.entity;

/**
 * Students entity. @author MyEclipse Persistence Tools
 */

public class Students implements java.io.Serializable {

	// Fields

	private Integer sid;
	private Integer cid;
	private String sname;
	private String sex;

	// Constructors

	/** default constructor */
	public Students() {
	}

	/** full constructor */
	public Students(Integer cid, String sname, String sex) {
		this.cid = cid;
		this.sname = sname;
		this.sex = sex;
	}

	// Property accessors

	public Integer getSid() {
		return this.sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public Integer getCid() {
		return this.cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

}