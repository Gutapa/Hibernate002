package com.shreeganesh.hibernate.Hibernate002.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author User
 *
 */
@Entity
@Table(name = "students")
public class Student {

	@Id
	@Column(name = "Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "student_name",length = 70)
	private String name;
	
	@Column(name = "student_number",nullable=false)
	private long number;

	@Embedded
    @AttributeOverrides({
            @AttributeOverride(name="addressLine1", 
                               column=@Column(name="home_address_line_1")),
            @AttributeOverride(name="addressLine2", 
                               column=@Column(name="home_address_line_2")),
            @AttributeOverride(name="city", 
                               column=@Column(name="home_city")),
            @AttributeOverride(name="country", 
                               column=@Column(name="home_country"))
    })
	private Address homeAddress;
	
	@Embedded
	@AttributeOverrides({
        @AttributeOverride(name="addressLine1", 
                           column=@Column(name="hostel_address_line_1")),
        @AttributeOverride(name="addressLine2", 
                           column=@Column(name="hostel_address_line_2")),
        @AttributeOverride(name="city", 
                           column=@Column(name="hostel_city")),
        @AttributeOverride(name="country", 
                           column=@Column(name="hostel_country"))
})
	private Address hostelAddress;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getHostelAddress() {
		return hostelAddress;
	}

	public void setHostelAddress(Address hostelAddress) {
		this.hostelAddress = hostelAddress;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", number=" + number + ", homeAddress=" + homeAddress
				+ ", hostelAddress=" + hostelAddress + "]";
	}

	

	
	
	
	
	
}
