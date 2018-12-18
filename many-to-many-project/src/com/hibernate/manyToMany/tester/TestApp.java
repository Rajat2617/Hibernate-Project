package com.hibernate.manyToMany.tester;

import java.util.ArrayList;
import java.util.List;

import com.hibernate.manyToMany.dao.MobileDAO;
import com.hibernate.manyToMany.dto.ApplicationDTO;
import com.hibernate.manyToMany.dto.MobileDTO;

public class TestApp {

	public static void main(String[] args) {

		List<MobileDTO> listOfMobiles = new ArrayList<MobileDTO>();
		List<ApplicationDTO> listOfApplications = new ArrayList<ApplicationDTO>();

		ApplicationDTO applicationDTO = new ApplicationDTO();

		applicationDTO.setAppName("Gmail");
		applicationDTO.setType("Servies");
		applicationDTO.setVersion(4.2);

		ApplicationDTO applicationDTO1 = new ApplicationDTO();

		applicationDTO1.setAppName("WhatsApp");
		applicationDTO1.setType("Social Networking");
		applicationDTO1.setVersion(4.2);

		MobileDTO mobileDTO = new MobileDTO();
		mobileDTO.setModel("Note 5 Pro");
		mobileDTO.setColour("Black");
		mobileDTO.setPrice(15000.45);

		listOfMobiles.add(mobileDTO);
		listOfApplications.add(applicationDTO);
		listOfApplications.add(applicationDTO1);

		applicationDTO.setMobileDTOs(listOfMobiles);
		applicationDTO1.setMobileDTOs(listOfMobiles);
		mobileDTO.setApplicationDTOs(listOfApplications);

		MobileDAO mobileDAO = new MobileDAO();
		mobileDAO.saveMobile(mobileDTO);

	}

}
