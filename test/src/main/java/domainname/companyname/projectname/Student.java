package domainname.companyname.projectname;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import domainname.companyname.projectname.commons.core.abstractbase.AbstractEntity;

@Entity
@Table(name="Student")
public class Student extends AbstractEntity<Long> implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@Basic
	@Column(name="name")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
}
