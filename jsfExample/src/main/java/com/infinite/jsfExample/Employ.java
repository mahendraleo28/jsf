package com.infinite.jsfExample;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class Employ implements Serializable{
	public Employ() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employ(int i, String string, String string2, String string3, double d) {
		// TODO Auto-generated constructor stub
	}
	private int empno;
	private String name;
	private String dept;
	private String desig;
	private double basic;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", dept=" + dept + ", desig=" + desig + ", basic=" + basic
				+ ", getEmpno()=" + getEmpno() + ", getName()=" + getName() + ", getDept()=" + getDept()
				+ ", getDesig()=" + getDesig() + ", getBasic()=" + getBasic() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
