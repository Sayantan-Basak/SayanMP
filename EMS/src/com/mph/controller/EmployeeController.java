package com.mph.controller;

import java.util.Comparator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

import com.mph.model.Employee;
import com.mph.model.Salary;
import com.mph.model.Manager;

public class EmployeeController implements EmployeeInterface{
	Employee emp;
	Manager mgr;
	Salary sal;
	List<Employee> emplist = new ArrayList<Employee>();
	public List addEmployee()
	{
		emp = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee Id:");
		int eno = sc.nextInt();
		emp.setEid(eno);
		System.out.println("Enter the Employee name:");
		String enam = sc.next();
		emp.setEname(enam);	
		
		sal= new Salary();
		
		System.out.println("Enter basic Salary");
		double basic = sc.nextDouble();
		sal.setBasic(basic);
		//System.out.println("Enter DA");
		double da = 0.3*basic;
		sal.setDa(da);
		//System.out.println("Enter HRA");
		double hra = 0.2*basic;
		sal.setHra(hra);
		//System.out.println("Enter PF");
		double pf= 0.1*basic;
		sal.setPf(pf);
		
		sal.setGross(basic, da, hra);
		sal.setNet(sal.getGross(),pf);
		emp.setSalary(sal);
		
		emplist.add(emp);
		
		System.out.println("New Employee "  + enam + " has been added");
	    return emplist;
	}
		public void addManager()
		{
			mgr = new Manager();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Employee Id:");
			int eno = sc.nextInt();
			mgr.setEid(eno);
			System.out.println("Enter the Employee name:");
			String enam = sc.next();
			mgr.setEname(enam);	
			
			sal= new Salary();
			
			System.out.println("Enter basic Salary");
			int basic = sc.nextInt();
			sal.setBasic(basic);
			System.out.println("Enter DA");
			int da = sc.nextInt();
			sal.setDa(da);
			System.out.println("Enter HRA");
			int hra = sc.nextInt();
			sal.setHra(hra);
			System.out.println("Enter PF");
			int pf= sc.nextInt();
			sal.setPf(pf);
			
			sal.setGross(basic, da, hra);
			sal.setNet(sal.getGross(),pf);
			mgr.setSalary(sal);
			System.out.println("Enter dept:");
			String dept=sc.next();
			
			mgr.setDept(dept);
			
			
			System.out.println("New Manager "  + enam + " has been added");
		
	}
	
	
	public void viewEmployee(List elist)
	{
		
		Iterator i= elist.iterator();

		while(i.hasNext())
		{
			System.out.println(i.next());
		}	
	}
	public void viewManager()
	{
		System.out.println(mgr);	
	}
	
	public void sortEmployee(List emplist)
	{
		//Object[] arr=emplist.toArray();
		//Arrays.sort(emplist,Employee.nameComparator);
		Collections.sort(emplist);
		//System.out.println("Sorted Employee Array w.r.t Name :" + Arrays.toString(emplist));
		System.out.println("Sorted Employee Array w.r.t Name :" + emplist);
		}
	
	
	
}