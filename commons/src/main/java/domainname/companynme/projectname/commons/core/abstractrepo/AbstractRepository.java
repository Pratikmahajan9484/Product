package domainname.companynme.projectname.commons.core.abstractrepo;

import org.springframework.data.repository.CrudRepository;

import domainname.companyname.projectname.commons.core.abstractbase.AbstractEntity;

/*@Author 
Pratik Mahajan*/

public interface AbstractRepository<E extends AbstractEntity<P> , P> extends CrudRepository<E, P> {


}
