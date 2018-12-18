package com.jspider.gun.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "gun_table")
public class GunDTO  implements Serializable{

	@Id
	@Column(name = "gun_id")
	@GenericGenerator(name = "raj", strategy = "increment")
	@GeneratedValue(generator = "raj")
	private int gunId;
	@Column(name = "gun_name")
	private String gunName;
	@Column(name = "price")
	private long price;
	@Column(name = "gun_type")
	private String gunType;
	@Column(name = "gun_range")
	private double gunRange;

	public GunDTO() {
		System.out.println(this.getClass().getSimpleName() + " Object is Created !!");
	}

	public int getGunId() {
		return gunId;
	}

	public void setGunId(int gunId) {
		this.gunId = gunId;
	}

	public String getGunName() {
		return gunName;
	}

	public void setGunName(String gunName) {
		this.gunName = gunName;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getGunType() {
		return gunType;
	}

	public void setGunType(String gunType) {
		this.gunType = gunType;
	}

	public double getGunRange() {
		return gunRange;
	}

	public void setGunRange(double gunRange) {
		this.gunRange = gunRange;
	}

}
