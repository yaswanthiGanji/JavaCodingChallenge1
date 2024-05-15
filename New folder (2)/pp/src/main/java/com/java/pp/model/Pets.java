package com.java.pp.model;

public class Pets {
	private int PetID ;
    private String Name; 
    private int Age; 
    private String Breed; 
    private String Type; 
    private int AvailableForAdoption;
	public int getPetID() {
		return PetID;
	}
	public void setPetID(int petID) {
		PetID = petID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getBreed() {
		return Breed;
	}
	public void setBreed(String breed) {
		Breed = breed;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public int getAvailableForAdoption() {
		return AvailableForAdoption;
	}
	public void setAvailableForAdoption(int availableForAdoption) {
		AvailableForAdoption = availableForAdoption;
	}
	@Override
	public String toString() {
		return "Pets [PetID=" + PetID + ", Name=" + Name + ", Age=" + Age + ", Breed=" + Breed + ", Type=" + Type
				+ ", AvailableForAdoption=" + AvailableForAdoption + "]";
	}
	public Pets() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pets(int petID, String name, int age, String breed, String type, int availableForAdoption) {
		super();
		PetID = petID;
		Name = name;
		Age = age;
		Breed = breed;
		Type = type;
		AvailableForAdoption = availableForAdoption;
	}
    

}