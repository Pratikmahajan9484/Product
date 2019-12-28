package domainname.companyname.projectname.commons.core.abstractservice;

import domainname.companyname.projectname.commons.core.abstractbase.AbstractEntity;

public interface AbstractService< T extends AbstractEntity< ? extends Number>, I extends Number >{
	
	 public abstract T create(T entity);
	
	 public abstract T update(T entity);
	
	 public abstract void delete(T entity);
	
	 public abstract boolean isExistById(I number); 
}
