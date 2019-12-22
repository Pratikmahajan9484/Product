package domainname.companyname.projectname;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import domainname.companyname.projectname.repositories.StudentRepository;
import domainname.companyname.projectname.repositories.impl.StudentRepositoriesImpl;

public class Test {

	@Autowired
	StudentRepository student;
	
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
		System.out.println("main");
		
		StudentRepositoriesImpl bean = ctx.getBean(StudentRepositoriesImpl.class);
		System.out.println(bean);
		Student student2 = new Student();
		student2.setCreatedOn(new Date());
		student2.setName("pratik");
		
		bean.save(student2);
		
	}
	
	
}
