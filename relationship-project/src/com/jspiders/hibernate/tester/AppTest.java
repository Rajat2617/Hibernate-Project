package com.jspiders.hibernate.tester;

import com.jspiders.hibernate.dao.RelationShipDAO;
import com.jspiders.hibernate.dto.RelationShipDTO;

public class AppTest {

	public static void main(String[] args) {
		RelationShipDTO relationShipDTO = new RelationShipDTO();

		relationShipDTO.setbName("Khirod Kumar");
		relationShipDTO.setgName("Shurabhi");
		relationShipDTO.setType("It's Complicated");
		relationShipDTO.setYears(4.5);

		RelationShipDAO relationShipDAO = new RelationShipDAO();

		relationShipDAO.saveRelationShip(relationShipDTO);
	}
}
