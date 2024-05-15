package com.java.pp.main;

import java.sql.SQLException;
import java.util.Scanner;
import com.java.pp.dao.PetsDao;
import com.java.pp.dao.PetsDaoImpl;
import com.java.pp.model.Pets;
public class ShowPetsID {
public static void main(String[] args) {
		
		
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter PetID");
			
			 int  PetID=sc.nextInt();
			 PetsDao dao=new PetsDaoImpl();
			 try {
				Pets pets= dao.ShowPetsID(PetID);
				if(pets==null) {
					System.out.println("invalid petID");
				}else {
					
				
				System.out.println(pets);}
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		}

}