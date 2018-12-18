package com.jspiders.hibernate.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "husband_table")
public class HusbandDTO implements Serializable {

	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "husband_id")
	private int husbandId;
	@Column(name = "h_name")
	private String name;
	@Column(name = "h_height")
	private double height;
	@Column(name = "h_age")
	private double age;

	@OneToOne
	@JoinColumn(name = "wife_id")
	private WifeDTO wifeDTO;

	public HusbandDTO() {
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	public int getHusbandId() {
		return husbandId;
	}

	public void setHusbandId(int husbandId) {
		this.husbandId = husbandId;
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

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public WifeDTO getWifeDTO() {
		return wifeDTO;
	}

	public void setWifeDTO(WifeDTO wifeDTO) {
		this.wifeDTO = wifeDTO;
	}
}
