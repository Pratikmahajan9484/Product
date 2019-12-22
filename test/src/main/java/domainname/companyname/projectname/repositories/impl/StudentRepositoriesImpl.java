package domainname.companyname.projectname.repositories.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import domainname.companyname.projectname.Student;
import domainname.companyname.projectname.repositories.StudentRepository;

@Service("pratik")
public class StudentRepositoriesImpl{

	@Autowired
	private StudentRepository repo;
	
	public void save(Student s){
		 repo.save(s);
		
	}
	

}
