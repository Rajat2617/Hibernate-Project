package com.jspider.manyToOne.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "tree_table")
public class TreeDTO implements Serializable {

	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "tree_id")
	private int treeId;
	@Column(name = "tree_name")
	private String treeName;
	@Column(name = "year")
	private double year;
	@Column(name = "height")
	private double height;

	// IN CASE OF BI-DIRECTIONAL

	@OneToMany(mappedBy = "treeDTO", cascade = CascadeType.ALL)
	private List<LeafDTO> leafDTO;

	public TreeDTO() {
		System.out.println(this.getClass().getSimpleName() + " Object Created !!");
	}

	public int getTreeId() {
		return treeId;
	}

	public void setTreeId(int treeId) {
		this.treeId = treeId;
	}

	public String getTreeName() {
		return treeName;
	}

	public void setTreeName(String treeName) {
		this.treeName = treeName;
	}

	public double getYear() {
		return year;
	}

	public void setYear(double year) {
		this.year = year;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public List<LeafDTO> getLeafDTO() {
		return leafDTO;
	}

	public void setLeafDTO(List<LeafDTO> leafDTO) {
		this.leafDTO = leafDTO;
	}

}
