package domainname.companyname.projectname.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import domainname.companyname.projectname.Student;
import domainname.companyname.projectname.repositories.StudentRepository;
import domainname.companyname.projectname.service.IStudentService;

@Service("service")
public class StudentServiceImpl implements IStudentService{

	@Autowired
	private StudentRepository repo;
	@Override
	public void create(Student entity) {

		repo.save(entity);
	}

	@Override
	public void update(Student entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Student entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isExistById(Long number) {
		// TODO Auto-generated method stub
		return false;
	}


}
