package domainname.companyname.projectname.commons.core.abstractservice;

import domainname.companyname.projectname.commons.core.abstractbase.AbstractEntity;

public abstract class  GenericService<T extends AbstractEntity<N> , N> implements AbstractService<T, N> {

	public final T create(T entity) {
		return null;
	}

	public final T update(T entity) {
		return null;
	}

	public final boolean delete(T entity) {
		return false;
	}

	public final boolean isExistById(N number) {
		return false;
	}

	
	
}
