package com.java.pp.model;
public class Participants {
	 private int ParticipantID; 
	    private String ParticipantName; 
	    private String ParticipantType ; 
	    private int EventID;
		public int getParticipantID() {
			return ParticipantID;
		}
		public void setParticipantID(int participantID) {
			ParticipantID = participantID;
		}
		public String getParticipantName() {
			return ParticipantName;
		}
		public void setParticipantName(String participantName) {
			ParticipantName = participantName;
		}
		public String getParticipantType() {
			return ParticipantType;
		}
		public void setParticipantType(String participantType) {
			ParticipantType = participantType;
		}
		public int getEventID() {
			return EventID;
		}
		public void setEventID(int eventID) {
			EventID = eventID;
		}
		@Override
		public String toString() {
			return "Prticipants [ParticipantID=" + ParticipantID + ", ParticipantName=" + ParticipantName
					+ ", ParticipantType=" + ParticipantType + ", EventID=" + EventID + "]";
		}
		public Participants() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Participants(int participantID, String participantName, String participantType, int eventID) {
			super();
			ParticipantID = participantID;
			ParticipantName = participantName;
			ParticipantType = participantType;
			EventID = eventID;
		}
	    
}