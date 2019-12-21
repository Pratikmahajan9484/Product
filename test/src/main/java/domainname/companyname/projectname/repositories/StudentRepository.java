package domainname.companyname.projectname.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import domainname.companyname.projectname.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long>{

}
