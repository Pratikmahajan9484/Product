package domainname.companyname.projectname.commons.core.abstractservice;

import domainname.companyname.projectname.commons.core.abstractbase.AbstractEntity;

public interface AbstractService<T extends AbstractEntity< ? extends Number>, P extends Number >{
	
	 abstract void create(T entity);
	
	 abstract void update(T entity);
	
	 abstract void delete(T entity);
	
	 abstract boolean isExistById(P number); 
}
