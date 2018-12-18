package com.jspider.manyToOne.dto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "leaf_table")
public class LeafDTO implements Serializable {

	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "leaf_id")
	private int leafId;
	@Column(name = "colour")
	private String colour;
	@Column(name = "weight")
	private double weight;
	@Column(name = "shaped")
	private String shape;

	// IN CASE OF UNI-DIRECTIONAL

	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE, CascadeType.DETACH })
	@JoinColumn(name = "tree_id")
	private TreeDTO treeDTO;

	public LeafDTO() {
		System.out.println(this.getClass().getSimpleName() + " Object Created !!");
	}

	public int getLeafId() {
		return leafId;
	}

	public void setLeafId(int leafId) {
		this.leafId = leafId;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public TreeDTO getTreeDTO() {
		return treeDTO;
	}

	public void setTreeDTO(TreeDTO treeDTO) {
		this.treeDTO = treeDTO;
	}

}
