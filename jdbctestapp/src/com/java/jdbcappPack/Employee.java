package com.java.jdbcappPack;
/*
 * Create table Emp(empno int primary key,
empname varchar(20), job varchar(20), sal int);
 */
public class Employee {

	private int empno;
	private String empname;
	private String job;
	private int sal;
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	
}
