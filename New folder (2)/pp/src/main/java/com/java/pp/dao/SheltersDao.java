package com.java.pp.dao;

import java.sql.SQLException;
import java.util.List;

import com.java.pp.model.Shelters;

public interface SheltersDao {
	List<Shelters> ShowShelter() throws ClassNotFoundException, SQLException;
	Boolean AddShelters(Shelters shelter) throws ClassNotFoundException, SQLException;
	List<Shelters> SearchSheltersByLocation(String Location) throws ClassNotFoundException, SQLException;
	List<Shelters> SearchShelterById(int ShelterID) throws ClassNotFoundException, SQLException;
}