package com.cg.sms.test;



import com.cg.sms.daoimpl.StudentDAOImpl;
import com.cg.sms.domain.Student;

public class ApplicationStartup {
	public static void main(String[] args) {
	Student student=new Student();
	StudentDAOImpl stdimpl=new StudentDAOImpl();
	
	student.setFname("Ananya");
	student.setLname("Priyadarshini");
	student.setDepartment("CSE");
	student.setAge(22);
	//stdimpl.insert(student);
	//stdimpl.update(student);
	stdimpl.delete(2);
	
	
	
	
}
}
