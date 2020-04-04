package domainname.companyname.projectname.entity;

import java.math.BigInteger;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import domainname.companyname.projectname.commons.core.abstractbase.AbstractEntity;

@Entity
@Table(name="Customers")
public class Customer extends AbstractEntity<Integer>{

	@Basic
	@Column(name="custom_first_name")
	private String firstName;
	
	@Basic
	@Column(name="custom_last_name")
	private String lastName;
	
	@Basic
	@Column(name="mobileno")
	private BigInteger mobileNo;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public BigInteger getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(BigInteger mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	
}
