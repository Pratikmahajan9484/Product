package domainname.companyname.projectname.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import domainname.companyname.projectname.entity.Customer;
import domainname.companyname.projectname.repository.CustomersRepository;

@RestController
@RequestMapping(path="Customer")
public class CustomerRestController {

	@Autowired
	CustomersRepository customerRepo;
	
	
	@PostMapping(path="create" , consumes=MediaType.APPLICATION_JSON_VALUE)
	public Customer create(@RequestBody Customer c){
		return customerRepo.save(c);
	}
}
