package com.java.pp.main;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.java.pp.dao.PetsDao;
import com.java.pp.dao.PetsDaoImpl;
import com.java.pp.model.Pets;
public class ShowpetsByBreed {
	public static void main(String[] args) {
		
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter PetBreed");
			
			 String  Breed=sc.next();
			 PetsDao dao=new PetsDaoImpl();
			 try {
				List<Pets> petsList= dao.ShowpetsByType(Breed);
				if(petsList.isEmpty()) {
					System.out.println("invalid petBreed");
				}else {
					 for (Pets pets: petsList) {
						 System.out.println(pets);
						
					}
					
				
				}
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		}


}