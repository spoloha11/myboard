package com.myboard.dao;

// Generated Mar 13, 2013 12:50:36 AM by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * AdditionalCalendarEntries generated by hbm2java
 */
public class AdditionalCalendarEntries implements java.io.Serializable {

	private static final long serialVersionUID = 6177932439424185060L;

	private Integer entryId;
//Begin Modification (Ben Andow)
//	private String uid;
	private Users user;
//End Modification (Ben Andow)
	private String title;
	private String description;
	private Date date;

	public AdditionalCalendarEntries() {
	}

//Begin Modification (Ben Andow)
//	public AdditionalCalendarEntries(String uid, String title,
//			String description, Date date) {
//		this.uid = uid;
//		this.title = title;
//		this.description = description;
//		this.date = date;
//	}
	
	public AdditionalCalendarEntries(Users user, String title,
			String description, Date date) {
		this.user = user;
		this.title = title;
		this.description = description;
		this.date = date;
	}
//End Modification (Ben Andow)
	

	public Integer getEntryId() {
		return this.entryId;
	}

	public void setEntryId(Integer entryId) {
		this.entryId = entryId;
	}

//Begin Modification (Ben Andow)
//	public String getUid() {
//		return this.uid;
//	}
//
//	public void setUid(String uid) {
//		this.uid = uid;
//	}
	public Users getUser() {
		return this.user;
	}

	public void setUser(Users user) {
		this.user = user;
	}
//End Modification (Ben Andow)
	
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
