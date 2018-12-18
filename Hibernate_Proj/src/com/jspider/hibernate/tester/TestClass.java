package com.jspider.hibernate.tester;

import com.jspider.hibernate.dao.PubDAO;
import com.jspider.hibernate.dto.PubDTO;

public class TestClass {

	public static void main(String[] args) {
		PubDTO pubDTO = new PubDTO();

		pubDTO.setPubId(1);
		pubDTO.setPubName("Hops & Grains");
		pubDTO.setEntryFee(899.99);
		pubDTO.setEntryType(2);
		pubDTO.setDrinkType("Martini dry Olives");

		PubDAO dao = new PubDAO();

		dao.savePub(pubDTO);
	}

}
