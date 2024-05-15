package com.java.pp.main;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import com.java.pp.dao.SheltersDao;
import com.java.pp.dao.SheltersDaoImpl;
import com.java.pp.model.Shelters;
public class SearchShelterByIdMain {
	public static void main(String[] args) {
		int ShelterId;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter ShelterId");
			ShelterId=sc.nextInt();
		}
		SheltersDao dao = new SheltersDaoImpl();
		try {
			List<Shelters>shellList=dao.SearchShelterById(ShelterId);
			for (Shelters shell : shellList) {
				System.out.println(shell);
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}