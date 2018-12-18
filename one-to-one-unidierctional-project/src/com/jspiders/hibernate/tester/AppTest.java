package com.jspiders.hibernate.tester;

import com.jspiders.hibernate.dao.HusbandDAO;
import com.jspiders.hibernate.dto.HusbandDTO;
import com.jspiders.hibernate.dto.WifeDTO;

public class AppTest {

	public static void main(String[] args) {
		HusbandDTO husbandDTO = new HusbandDTO();
		WifeDTO wifeDTO = new WifeDTO();

		husbandDTO.setName("Khirod");
		husbandDTO.setAge(24);
		husbandDTO.setHeight(5.8);

		wifeDTO.setName("Pushpaa");
		wifeDTO.setSalary(60000);
		wifeDTO.setHeight(5.4);

		husbandDTO.setWifeDTO(wifeDTO);

		HusbandDAO husbandDAO = new HusbandDAO();
		husbandDAO.saveHusband(husbandDTO, wifeDTO);
	}

}
