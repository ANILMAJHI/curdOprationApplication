package com.anil.springboot.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="employees")
@DynamicUpdate

public class Employees {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQUENCE1")
	@SequenceGenerator(name="SEQUENCE1", sequenceName="SEQUENCE1", allocationSize=1)
	@Column(name = "empId")
	private int empId;
	@Column(name = "firstname")
	private String firstname;
	@Column(name = "lastname")
	private String lastname;
	@Column(name = "address")
	private String address;
	/*
	 * @Column(name = "DOJ") private Date DOJ;
	 */
	@Column(name = "salary")
	private float salary;

	@Column(name = "gender")
	private String gender;
	
	public Employees() {

	}

	public Employees(int empId, String firstname, String lastname, String address, Date dOJ, float salary,
			String gender) {
		super();
		this.empId = empId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		/* DOJ = dOJ; */
		this.salary = salary;
		this.gender = gender;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	/*
	 * public Date getDOJ() { return DOJ; }
	 * 
	 * public void setDOJ(Date dOJ) { DOJ = dOJ; }
	 */

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employees [empId=" + empId + ", firstname=" + firstname + ", lastname=" + lastname + ", address="
				+ address + ", salary=" + salary + ", gender=" + gender + "]";
	}

	
}
