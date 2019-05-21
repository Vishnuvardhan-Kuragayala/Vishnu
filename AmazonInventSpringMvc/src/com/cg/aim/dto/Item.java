package com.cg.aim.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="item")
@Component
public class Item {
	@Id
	@Column(name="item_id")
    private int Id;
	@Column(name="item_name")
	private String name;
	@Column(name="item_batchnumber")
	private int batchNumber;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
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
	public Item(int id, String name, int batchNumber) {
		super();
		Id = id;
		this.name = name;
		this.batchNumber = batchNumber;
	}
	public Item() {
		super();
	}
	


	
}
