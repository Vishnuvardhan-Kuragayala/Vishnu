package com.cg.aim.AimSpringBoot.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="item")

public class Item {
	@Id
	@Column(name="item_id")
    private Integer Id;
	@Column(name="item_name")
	private String name;
	@Column(name="item_batchnumber")
	private int batchNumber;
	
	
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

	public Item(Integer id, String name, int batchNumber) {
		super();
		Id = id;
		this.name = name;
		this.batchNumber = batchNumber;
	}

	@Override
	public String toString() {
		return "Item [Id=" + Id + ", name=" + name + ", batchNumber=" + batchNumber + "]";
	}



}
