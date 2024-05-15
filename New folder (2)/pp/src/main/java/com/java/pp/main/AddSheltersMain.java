package com.java.pp.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.pp.model.Shelters;
import com.java.pp.dao.SheltersDao;
import com.java.pp.dao.SheltersDaoImpl;
import com.java.pp.model.Shelters;
public class AddSheltersMain {
	public static void main(String[] args) {
		Shelters shelter = new Shelters();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter ShelterID");
			shelter.setShelterID(sc.nextInt());
			System.out.println("enter Name");
			shelter.setName(sc.next());
			System.out.println("enter Location");
			shelter.setLocation(sc.next());
		}
		SheltersDao dao = new SheltersDaoImpl();
		try {
			Boolean Success=dao.AddShelters(shelter);
			if(Success==true) {
				System.out.println("data inserted succesfully");
			}
			else {
				System.out.println("data not inserted");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}