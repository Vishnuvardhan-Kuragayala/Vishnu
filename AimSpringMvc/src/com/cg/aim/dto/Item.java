package com.cg.aim.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="item")
@Component
public class Item {
	@Id
	@Column(name="item_id")
    private Integer Id;
	@Column(name="item_name")
	private String name;
	@Column(name="item_batchnumber")
	private int batchNumber;
	@ManyToOne
	@JoinColumn(name="locker_id")
	private Locker locker;
	
	public Item() {
		super();
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer Id) {
		this.Id = Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBatchNumber() {
		return batchNumber;
	}

	public void setBatchNumber(int batchNumber) {
		this.batchNumber = batchNumber;
	}

	public Locker getLocker() {
		return locker;
	}

	public void setLocker(Locker locker) {
		this.locker = locker;
	}
	
	


}
