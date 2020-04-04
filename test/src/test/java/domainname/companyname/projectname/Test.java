package domainname.companyname.projectname;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import domainname.companyname.projectname.repositories.StudentRepository;
import domainname.companyname.projectname.service.IStudentService;

public class Test {

	@Autowired
	StudentRepository student;
	
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
		System.out.println("main");
		
		IStudentService bean = (IStudentService) ctx.getBean("service");
		Student s = new Student();
		
		
	}
	
	
}
