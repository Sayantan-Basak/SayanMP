package com.mph.model;

import com.mph.controller.EmployeeController;
import com.mph.model.Employee;
import com.mph.model.Salary;

public class Manager extends Employee{
	private String dept;
	public void setDept(String dep)
	{
		this.dept=dep;
	}
	public String getDept()
	{
		return dept;
		
}
	@Override
	public String toString() {
		
		return "Manager [eid=" + this.getEid() + ", ename=" + this.getEname() + ", salary=" + this.getSalary() + "] Department="+dept+" ";
	}
}
