package com.cg.sms.menu;

import java.util.Scanner;

import com.cg.sms.daoimpl.StudentDAOImpl;
import com.cg.sms.domain.Student;

public class SMSApp {
	public void start() {
		int choice;
		String continueChoice;
		Scanner sc=  new Scanner(System.in);
		do {
			showMenu();		
			System.out.println("Enter Your Choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("-------Please Provide below details---------");
				Student stud = new Student();
				System.out.println("Enter your first name : ");
				stud.setFirstName(sc.next());
				System.out.println("Enter your last name : ");
				stud.setLastName(sc.next());
				System.out.println("Enter your contact no : ");
				stud.setContact(sc.next());
				System.out.println("Enter your Email : ");
				stud.setEmail(sc.next());
				System.out.println("Enter your Branch : ");
				stud.setBranch(sc.next());
				StudentDAOImpl impl=new StudentDAOImpl();
				impl.insert(stud);
				System.out.println("Student Registered Successfully!");
				break;
			case 2:
				System.out.println("-------Please Provide below details---------");
				Department dept = new Department();
				System.out.println("Enter Department Name : ");
				dept.setDeptName(sc.next());
				System.out.println("Enter Department Head : ");
				dept.setDeptHead(sc.next());
				System.out.println("Enter contact no : ");
				dept.setDeptContact(sc.next());
				
				DepartmentDAOImpl deptimpl=new DepartmentDAOImpl();
				deptimpl.add(dept);
				System.out.println("Department added!");
				break;
			case 3:
				System.out.println("-------Remove User---------");
				break;
			case 4:
				System.out.println("-------Edit User---------");
				break;
			case 5:
				System.out.println("-------Find User---------");
				break;
			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("Wrong Choice");
				break;
			}
			System.out.println("Do you want to continue : [yes/no]");
			continueChoice = sc.next();
		}while(continueChoice.equalsIgnoreCase("yes"));
	}
	
	private void showMenu() {
		System.out.println("---------Student Management System-----------");
		System.out.println("1. Register Student");
		System.out.println("2. Add Department details");
		System.out.println("3. Show All Students");
		System.out.println("4. Remove Student");
		System.out.println("5. Find Student");
		System.out.println("0. Exit");
	}


}
