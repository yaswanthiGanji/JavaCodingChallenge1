package com.java.pp.dao;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import com.java.pp.model.Donations;

public interface DonationsDao {
	List<Donations> showDonation() throws ClassNotFoundException, SQLException;
	List<Donations> showDononName(String DononName) throws ClassNotFoundException, SQLException;
	Boolean CreateDonations(Donations donations) throws ClassNotFoundException, SQLException;
	List<Donations> getDonationsDateRange(Date startDate, Date endDate) throws ClassNotFoundException, SQLException;
	Boolean updateDonationsItem(String DonationItem, int DonationId) throws ClassNotFoundException, SQLException;
}