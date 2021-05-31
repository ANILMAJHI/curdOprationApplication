
package com.anil.springboot.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "address")
/*
 * @Data
 * 
 * @Getter
 * 
 * @Setter
 * 
 * @NoArgsConstructor
 * 
 * @AllArgsConstructor
 */
public class Address implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQUENCE1")
	@SequenceGenerator(name = "SEQUENCE1", sequenceName = "SEQUENCE1", allocationSize = 1)
	@Column(name = "pincode")
	private Integer pincode;

	@Column(name = "addessLineNo")
	private String addessLineNo;

	@Column(name = "city")
	private String city;

	@Column(name = "email")
	private String email;

	@Column(name = "mobNo")
	private long mobNo;

	/* @OneToOne(fetch = FetchType.LAZY) */

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "address")
	@JoinColumn(name = "employees_id")
	private Employees employees;

	public Address() {
		super();
	}

	public Address(Integer pincode, String addessLineNo, String city, String email, long mobNo, Employees employees) {
		super();
		this.pincode = pincode;
		this.addessLineNo = addessLineNo;
		this.city = city;
		this.email = email;
		this.mobNo = mobNo;
		this.employees = employees;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	public String getAddessLineNo() {
		return addessLineNo;
	}

	public void setAddessLineNo(String addessLineNo) {
		this.addessLineNo = addessLineNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobNo() {
		return mobNo;
	}

	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}

	public Employees getEmployees() {
		return employees;
	}

	public void setEmployees(Employees employees) {
		this.employees = employees;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", addessLineNo=" + addessLineNo + ", city=" + city + ", email=" + email
				+ ", mobNo=" + mobNo + ", employees=" + employees + "]";
	}

}
