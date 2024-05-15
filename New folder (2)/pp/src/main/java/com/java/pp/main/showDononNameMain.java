package com.java.pp.main;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import com.java.pp.dao.DonationsDao;
import com.java.pp.dao.DonationsDaoImpl;

import com.java.pp.model.Donations;
public class showDononNameMain {
	public static void main(String[] args) {
		String DonorName;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter DonarName");
			DonorName=sc.next();
		}
		DonationsDao dao = new DonationsDaoImpl();
		try {
			List<Donations> DonationsList = dao.showDononName(DonorName) ;
			for (Donations donation : DonationsList) {
				System.out.println(donation);
			}
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}