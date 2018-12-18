package com.jspider.gun.tester;

import com.jspider.gun.dao.GunDAO;
import com.jspider.gun.dto.GunDTO;

public class TestGun {

	public static void main(String[] args) {
		// GunDTO gunDTO = new GunDTO();
		//
		// gunDTO.setGunName("AK47");
		// gunDTO.setPrice(567891234);
		// gunDTO.setGunType("Manual");
		// gunDTO.setGunRange(300.50);

		GunDAO gunDAO = new GunDAO();
		// gunDAO.saveGun(gunDTO);

		GunDTO gunDTO = gunDAO.getGunByName("AK47");
		System.out.println("Gun_ID " + gunDTO.getGunId());
		System.out.println("Gun_Range " + gunDTO.getGunRange());
		System.out.println("Gun_Name " + gunDTO.getGunName());

		String type = gunDAO.getGunTypeByName("AK47");
		System.out.println("Gun Type : " + type);
	}
}
