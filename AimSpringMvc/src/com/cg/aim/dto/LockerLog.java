package com.cg.aim.dto;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.stereotype.Component;
@Entity
@Table(name="lockerlog")
@Component
public class LockerLog {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="lockerlog_id")
	private int id;
	@Column(name="date")
	@Temporal(TemporalType.DATE)
	private Date date;
	@Column(name="requester")
	private String requester;
	@Column(name="description")
	private String description;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="locker_id")
	private Locker locker;
	
	
	
	public LockerLog() {
		super();
		
	}
	
	public LockerLog(int id, Date date, String requester, String description, Locker locker) {
		super();
		this.id = id;
		this.date = date;
		this.requester = requester;
		this.description = description;
//		this.locker = locker;
	}

	public LockerLog(String requester, String description) {
		this.requester=requester;
		this.description=description;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getRequester() {
		return requester;
	}
	public void setRequester(String requester) {
		this.requester = requester;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Locker getLocker() {
	return locker;
}

	public void setLocker(Locker locker) {
		this.locker = locker;
}

	@Override
	public String toString() {
		return "LockerLog [id=" + id + ", date=" + date + ", requester=" + requester + ", Description=" + description
				+ ", locker=" + locker + "]";
	}

	 
	
}
