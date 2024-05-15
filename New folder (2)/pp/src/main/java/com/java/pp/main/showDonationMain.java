package com.java.pp.main;
import java.sql.SQLException;
import java.util.List;

import com.java.pp.dao.DonationsDao;
import com.java.pp.dao.DonationsDaoImpl;

import com.java.pp.model.Donations;

public class showDonationMain {
	public static void main(String[] args) {
		DonationsDao dao = new DonationsDaoImpl();
		try {
			List<Donations> DonationsList = dao.showDonation() ;
			for (Donations donation : DonationsList) {
				System.out.println(donation);
			}
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}