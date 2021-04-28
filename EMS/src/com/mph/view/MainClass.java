package com.mph.view;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;
import java.util.Collections;


import com.mph.controller.EmployeeController;
import com.mph.controller.EmployeeInterface;
import com.mph.model.Employee;

public class MainClass {

	public static void main(String[] args) {

		EmployeeInterface empc = new EmployeeController();
		List<Employee> elist=null;
		Scanner sc = new Scanner(System.in);

		String inp = null;
		do {
			System.out.println("Enter Choice");
			System.out.println("Enter 1 for Adding Employee");
			System.out.println("Enter 2 for Viewing  Employee");
			System.out.println("Enter 3 for Adding Manager");
			System.out.println("Enter 4 for Viewing  Manager");
			System.out.println("Enter 5 for Sorting employee");

			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				elist=empc.addEmployee();
				break;
			}

			case 2: {
				empc.viewEmployee(elist);
				break;
			}
			case 3: {
				empc.addManager();
				break;
			}
			case 4: {
				empc.viewManager();
				break;
			}
			case 5:{
				empc.sortEmployee(elist);
			}
			}
			System.out.println("Do you want to continue ? Y or y for yes");
			inp = sc.next();
		} while (inp.equals("Y") || inp.equals("y"));
		System.out.println("Application ended..Thanks we will continue next.");
		sc.close();
		System.exit(0);
	}
}