package com.java.pp.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.pp.Util.DBConnUtil;
import com.java.pp.Util.DBPropertyUtil;
import com.java.pp.model.Donations;
import com.java.pp.model.Pets;
import com.java.pp.model.Shelters;
public class DonationsDaoImpl implements DonationsDao {
	Connection connection;
	PreparedStatement pst;

	@Override
	public List<Donations> showDonation() throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.connectionString("db");
		connection = DBConnUtil.getConnection(connStr);
		String cmd = "select * from Donations";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<Donations> DonationsList = new ArrayList<Donations>();
		Donations donation = null;
		while(rs.next()) {
			donation = new Donations();
			donation.setDonationID(rs.getInt("DonationID"));
			donation.setDonarName(rs.getString("DonarName"));
			donation.setDonationType(rs.getString("DonationType"));
			donation.setDonationAmount(rs.getDouble("DonationAmount"));
			donation.setDonationItem(rs.getString("DonationItem"));
			donation.setDonationDateTime(rs.getDate("DonationDateTime"));

			
			DonationsList.add(donation);
		}
		return DonationsList;
	
	}

	@Override
	public List<Donations> showDononName(String DonarName) throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.connectionString("DB");
		connection = DBConnUtil.getConnection(connStr);
		String cmd="select * from Donations where DonarName =?";
		pst=connection.prepareStatement(cmd);
		pst.setString(1, DonarName);
		ResultSet rs = pst.executeQuery();
		List<Donations> DonationsList = new ArrayList<Donations>();
		Donations donation = null;
		while(rs.next()) {
			donation = new Donations();
			donation.setDonationID(rs.getInt("DonationID"));
			donation.setDonarName(rs.getString("DonarName"));
			donation.setDonationType(rs.getString("DonationType"));
			donation.setDonationAmount(rs.getDouble("DonationAmount"));
			donation.setDonationItem(rs.getString("DonationItem"));
			donation.setDonationDateTime(rs.getDate("DonationDateTime"));

			
			DonationsList.add(donation);
		}
		return DonationsList;
	}

	@Override
	public Boolean CreateDonations(Donations donations) throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.connectionString("db");
		connection = DBConnUtil.getConnection(connStr);
		String cmd = "Insert Into Donations (DonationID, DonarName, DonationType, DonationAmount, DonationItem, DonationDate)Values(?,?,?,?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1,donations.getDonationID());
		pst.setString(2,donations.getDonarName());
		pst.setString(3,donations.getDonationType());
		pst.setDouble(4,donations.getDonationAmount());
		pst.setString(5,donations.getDonationItem());
		pst.setDate(6,donations.getDonationDateTime());
		int RowsInserted=pst.executeUpdate();
		if(RowsInserted>0) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public List<Donations> getDonationsDateRange(Date startDate, Date endDate)
			throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.connectionString("DB");
		connection = DBConnUtil.getConnection(connStr);
		String cmd ="select * from Donations where DonationDateTime between ? and ? ";
		
		pst=connection.prepareStatement(cmd);
		pst.setDate(1, startDate);
		pst.setDate(2, endDate);
		
		ResultSet rs=pst.executeQuery();
		List<Donations> DonationsList = new ArrayList<Donations>();
		Donations donation = null;
		while(rs.next()) {
			donation = new Donations();
			donation.setDonationID(rs.getInt("DonationID"));
			donation.setDonarName(rs.getString("DonarName"));
			donation.setDonationType(rs.getString("DonationType"));
			donation.setDonationAmount(rs.getDouble("DonationAmount"));
			donation.setDonationItem(rs.getString("DonationItem"));
			donation.setDonationDateTime(rs.getDate("DonationDateTime"));

			
			DonationsList.add(donation);
		}
		return DonationsList;
	}

	@Override
	public Boolean updateDonationsItem(String DonationItem, int DonationId)
			throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.connectionString("DB");
		connection = DBConnUtil.getConnection(connStr);
		String  cmd="update Donations set DonationItem=? where DonationId=? ";
		pst=connection.prepareStatement(cmd);
		pst.setString(1, DonationItem);
		pst.setInt(2, DonationId);
		
	
		int RowsInserted=pst.executeUpdate();
		if(RowsInserted>0) {
			return true;
		}
		else {
			return false;
		}


	}

}