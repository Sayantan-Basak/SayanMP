package com.mph.controller;

import java.util.List;

public interface EmployeeInterface {
	
	public List addEmployee();
	public void addManager();
	public void viewEmployee(List elist);
	public void viewManager();
	public void sortEmployee(List elist);

}
