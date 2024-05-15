package com.java.pp.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.pp.dao.PetsDao;
import com.java.pp.dao.PetsDaoImpl;
import com.java.pp.model.Pets;
public class AddPets {
	public static void main(String[] args) {
		
		
		 try (Scanner scanner = new Scanner(System.in)) {
			PetsDao dao = new PetsDaoImpl();
			 System.out.println("Enter the name of the pet:");
			 String name = scanner.nextLine();

			 System.out.println("Enter the age of the pet:");
			 int age = scanner.nextInt();
			 scanner.nextLine(); // Consume newline

			 System.out.println("Enter the breed of the pet:");
			 String breed = scanner.nextLine();

			 System.out.println("Is the pet available for adoption? (true/false):");
			 boolean availableForAdoption = scanner.nextBoolean();
			 scanner.nextLine(); // Consume newline

			 System.out.println("Enter the type of the pet:");
			 String Type = scanner.nextLine();
			 Pets newPet = new Pets();
			 newPet.setName(name);
			 newPet.setAge(age);
			 newPet.setBreed(breed);
			 newPet.setAvailableForAdoption(availableForAdoption ? 1 : 0);
			 newPet.setType(Type);

			 // Call the addPet method to add the new pet to the database
			 try {
				dao.AddPets(newPet);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	     System.out.println("New pet added successfully!");
		}
}