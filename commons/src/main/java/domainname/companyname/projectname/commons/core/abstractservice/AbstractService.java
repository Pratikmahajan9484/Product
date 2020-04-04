package domainname.companyname.projectname.commons.core.abstractservice;

/*@Author
Pratik Mahajan*/


interface AbstractService<T , P>{
	
	 public abstract T create(T entity);
	
	 public abstract T update(T entity);
	
	 public abstract boolean delete(T entity);
	
	 public abstract boolean isExistById(P number); 
}
