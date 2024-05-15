package com.java.pp.dao;

import java.sql.SQLException;
import java.util.List;

import com.java.pp.model.Adoptions;

public interface AdoptionsDao {
	List<Adoptions> showAdoptionEvents() throws ClassNotFoundException, SQLException;
	Boolean CreateAdoptionEvents(Adoptions adoptionevents) throws ClassNotFoundException, SQLException;
}