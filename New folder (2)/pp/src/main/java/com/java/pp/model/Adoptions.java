package com.java.pp.model;

import java.sql.Date;

public class Adoptions {
	private int EventID;  
    private String EventName; 
    private Date EventDate; 
    private String Location;
	public int getEventID() {
		return EventID;
	}
	public void setEventID(int eventID) {
		EventID = eventID;
	}
	public String getEventName() {
		return EventName;
	}
	public void setEventName(String eventName) {
		EventName = eventName;
	}
	public Date getEventDate() {
		return EventDate;
	}
	public void setEventDate(Date eventDate) {
		EventDate = eventDate;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	@Override
	public String toString() {
		return "Adoptions [EventID=" + EventID + ", EventName=" + EventName + ", EventDate=" + EventDate + ", Location="
				+ Location + "]";
	}
	public Adoptions() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Adoptions(int eventID, String eventName, Date eventDate, String location) {
		super();
		EventID = eventID;
		EventName = eventName;
		EventDate = eventDate;
		Location = location;
	}
    
}