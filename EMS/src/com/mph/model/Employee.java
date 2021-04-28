package com.mph.model;

import java.util.Comparator;
import java.util.*;
import com.mph.model.Employee;
import com.mph.model.Salary;
import com.mph.model.Manager;
import com.mph.controller.EmployeeController;
import com.mph.controller.EmployeeInterface;
import com.mph.view.MainClass;
public class Employee implements Comparable<Employee>
{

	private int eid;
	private String ename;
	private Salary salary;

	/*public Employee() {
		System.out.println("From Emp constr...");
	}*/

	public void setEid(int eid) {
		this.eid = eid;
	}

	public int getEid() {
		return eid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEname() {
		return ename;
	}

	public Salary getSalary() {
		return salary;
	}

	public void setSalary(Salary salary) {
		this.salary = salary;
	}

	/*public String toString() {
		return "EiD : " + eid + "   " + "Emp name : " + ename;
	}
	*/
	@Override
	public String toString() {
		return "Employee[eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
	@Override
	public int compareTo(Employee e1) {
		
		return (this.getEname().compareTo(e1.getEname()));
	}
	
	public static Comparator<Employee> nameComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee e1, Employee e2) {
			
			return (e1.getEname().compareTo(e2.getEname()));
		}
		
		
	};
}