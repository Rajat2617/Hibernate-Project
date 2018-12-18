package com.jspiders.hibernate.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "relationship_table")
public class RelationShipDTO implements Serializable {

	@Id
	@Column(name = "relation_id")
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	private int relationId;
	@Column(name = "b_name")
	private String bName;
	@Column(name = "g_name")
	private String gName;
	@Column(name = "type")
	private String type;
	@Column(name = "years")
	private double years;

	public RelationShipDTO() {
		System.out.println(this.getClass().getSimpleName() + " Object Created !!");
	}

	public int getRelationId() {
		return relationId;
	}

	public void setRelationId(int relationId) {
		this.relationId = relationId;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getgName() {
		return gName;
	}

	public void setgName(String gName) {
		this.gName = gName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getYears() {
		return years;
	}

	public void setYears(double years) {
		this.years = years;
	}

}
