package com.jspiders.hibernate.gmailApp.tester;

import java.util.ArrayList;
import java.util.List;

import com.jspiders.hibernate.gmailApp.dao.GmailAppDAO;
import com.jspiders.hibernate.gmailApp.dto.GmailAppDTO;
import com.jspiders.hibernate.gmailApp.dto.UserDTO;

public class AppTest {

	public static void main(String[] args) {

		GmailAppDTO gmailAppDTO = new GmailAppDTO();

		gmailAppDTO.setName("Google-Gmail");
		gmailAppDTO.setType("Social");
		gmailAppDTO.setVersion(2.1);

		UserDTO userDTO = new UserDTO();

		userDTO.setUsername("rajat.ranjan05@gmail.com");
		userDTO.setPassword("qwerty1234");
		userDTO.setPhoneNumber(9888182617l);

		UserDTO userDTO1 = new UserDTO();

		userDTO1.setUsername("rr.rocks97@gmail.com");
		userDTO1.setPassword("asdfg1234");
		userDTO1.setPhoneNumber(6204927290l);

		List<UserDTO> listOfUsers = new ArrayList<UserDTO>();

		listOfUsers.add(userDTO);
		listOfUsers.add(userDTO1);

		userDTO.setGmailAppDTO(gmailAppDTO);
		userDTO1.setGmailAppDTO(gmailAppDTO);

		gmailAppDTO.setUserDTOs(listOfUsers);

		GmailAppDAO gmailAppDAO = new GmailAppDAO();
		gmailAppDAO.saveGamilApp(gmailAppDTO);

	}

}
