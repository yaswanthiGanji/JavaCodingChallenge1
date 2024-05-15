package com.java.pp.model;
import java.math.BigDecimal;
import java.sql.Date;

public class Donations {
	private int DonationID ; 
    private String DonarName; 
    private String DonationType; 
    private Double DonationAmount; 
    private String DonationItem ; 
    private Date DonationDateTime;
	public int getDonationID() {
		return DonationID;
	}
	public void setDonationID(int donationID) {
		DonationID = donationID;
	}
	public String getDonarName() {
		return DonarName;
	}
	public void setDonarName(String donarName) {
		DonarName = donarName;
	}
	public String getDonationType() {
		return DonationType;
	}
	public void setDonationType(String donationType) {
		DonationType = donationType;
	}
	public Double getDonationAmount() {
		return DonationAmount;
	}
	public void setDonationAmount(Double donationAmount) {
		DonationAmount = donationAmount;
	}
	public String getDonationItem() {
		return DonationItem;
	}
	public void setDonationItem(String donationItem) {
		DonationItem = donationItem;
	}
	public Date getDonationDateTime() {
		return DonationDateTime;
	}
	public void setDonationDateTime(Date donationDateTime) {
		DonationDateTime = donationDateTime;
	}
	@Override
	public String toString() {
		return "Donations [DonationID=" + DonationID + ", DonarName=" + DonarName + ", DonationType=" + DonationType
				+ ", DonationAmount=" + DonationAmount + ", DonationItem=" + DonationItem + ", DonationDateTime="
				+ DonationDateTime + "]";
	}
	public Donations() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Donations(int donationID, String donarName, String donationType, Double donationAmount, String donationItem,
			Date donationDateTime) {
		super();
		DonationID = donationID;
		DonarName = donarName;
		DonationType = donationType;
		DonationAmount = donationAmount;
		DonationItem = donationItem;
		DonationDateTime = donationDateTime;
	}
	
}