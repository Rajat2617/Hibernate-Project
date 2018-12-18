package com.jspiders.hibernate.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "wife_table")
public class WifeDTO implements Serializable {

	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "wife_id")
	private int wifeId;
	@Column(name = "w_name")
	private String name;
	@Column(name = "w_height")
	private double height;
	@Column(name = "w_salary")
	private double salary;

	public WifeDTO() {
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	public int getWifeId() {
		return wifeId;
	}

	public void setWifeId(int wifeId) {
		this.wifeId = wifeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
