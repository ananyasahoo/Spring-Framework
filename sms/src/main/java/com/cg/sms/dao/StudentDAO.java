package com.cg.sms.dao;

import java.util.List;

import com.cg.sms.domain.Student;

/**
 * This StudentDAO interface will perform the CRUD Operations
 * author- @Ananya
 *
 */
public interface StudentDAO {
	/**
	 * It will save the student object into the students table
	 * @param stu object will be saved
	 */
	 void insert(Student student);
	 /**
		 * It will delete the student object from the students table
		 * @param stu object will be deleted
		 */
		
	 void delete(Student student);
	 
	 /**
		 * It will delete the student object based on student id
		 * @param id of the person
		 */
		
	 
	 void delete(int id);
	 /**
		 * It will update the student object 
		 * @param student data will be updated
		 */
	 
	 
	 void update(Student student);
	 /**
		 * It will return the list of students in the students table
		 * @return
		 */
	 

	 
	
	
}
