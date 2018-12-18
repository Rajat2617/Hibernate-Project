package com.jspider.hibernate.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pub_table")
public class PubDTO implements Serializable {

	@Id
	@Column(name = "pub_id")
	private int pubId;
	@Column(name = "pub_name")
	private String pubName;
	@Column(name = "drink_type")
	private String drinkType;
	@Column(name = "entry_fee")
	private double entryFee;
	@Column(name = "entry_type")
	private long entryType;

	public PubDTO() {
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	public int getPubId() {
		return pubId;
	}

	public void setPubId(int pubId) {
		this.pubId = pubId;
	}

	public String getPubName() {
		return pubName;
	}

	public void setPubName(String pubName) {
		this.pubName = pubName;
	}

	public String getDrinkType() {
		return drinkType;
	}

	public void setDrinkType(String drinkType) {
		this.drinkType = drinkType;
	}

	public double getEntryFee() {
		return entryFee;
	}

	public void setEntryFee(double entryFee) {
		this.entryFee = entryFee;
	}

	public long getEntryType() {
		return entryType;
	}

	public void setEntryType(long entryType) {
		this.entryType = entryType;
	}

}
