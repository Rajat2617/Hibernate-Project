package com.jspider.manyToOne.tester;

import java.util.ArrayList;
import java.util.List;

import com.jspider.manyToOne.dao.TreeDAO;
import com.jspider.manyToOne.dto.LeafDTO;
import com.jspider.manyToOne.dto.TreeDTO;

public class TestApp {

	public static void main(String[] args) {
		TreeDTO treeDTO = new TreeDTO();

		treeDTO.setTreeName("Neem");
		treeDTO.setHeight(210.45);
		treeDTO.setYear(50);

		LeafDTO leafDTO = new LeafDTO();
		leafDTO.setColour("Green");
		leafDTO.setShape("Oval");
		leafDTO.setWeight(2.6);

		LeafDTO leafDTO1 = new LeafDTO();
		leafDTO1.setColour("Yellow");
		leafDTO1.setShape("Triangle");
		leafDTO1.setWeight(2.6);

		LeafDTO leafDTO2 = new LeafDTO();
		leafDTO2.setColour("Light Green");
		leafDTO2.setShape("Reactangle");
		leafDTO2.setWeight(2.6);

		List<LeafDTO> listOfleaf = new ArrayList<LeafDTO>();
		listOfleaf.add(leafDTO);
		listOfleaf.add(leafDTO1);
		listOfleaf.add(leafDTO2);

		leafDTO.setTreeDTO(treeDTO);
		leafDTO1.setTreeDTO(treeDTO);
		leafDTO2.setTreeDTO(treeDTO);

		treeDTO.setLeafDTO(listOfleaf);

		// LeafDAO leafDAO = new LeafDAO();
		// leafDAO.saveLeaf(leafDTO);

		TreeDAO treeDAO = new TreeDAO();
		treeDAO.saveTree(treeDTO);
	}
}
