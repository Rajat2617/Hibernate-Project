package com.jspiders.hibernate.tester;

import com.jspiders.hibernate.dao.HusbandDAO;
import com.jspiders.hibernate.dto.HusbandDTO;
import com.jspiders.hibernate.dto.WifeDTO;

public class AppTest {

	public static void main(String[] args) {
		HusbandDTO husbandDTO = new HusbandDTO();
		WifeDTO wifeDTO = new WifeDTO();

		husbandDTO.setName("Kundan");
		husbandDTO.setAge(25);
		husbandDTO.setHeight(5.8);

		wifeDTO.setName("Aishwarya");
		wifeDTO.setSalary(70000);
		wifeDTO.setHeight(5.8);

		husbandDTO.setWifeDTO(wifeDTO);

		HusbandDAO husbandDAO = new HusbandDAO();
		husbandDAO.saveHusband(husbandDTO, wifeDTO);

		// HusbandDTO husbandDTO = husbandDAO.getHusbandById(2);
		// if (husbandDTO != null) {
		// System.out.println("----------------------------------------");
		// WifeDTO wifeDTO = husbandDTO.getWifeDTO();
		// System.out.println("Husband Name: " + husbandDTO.getName());
		// System.out.println("Wife name: " + wifeDTO.getName());
	}
}
