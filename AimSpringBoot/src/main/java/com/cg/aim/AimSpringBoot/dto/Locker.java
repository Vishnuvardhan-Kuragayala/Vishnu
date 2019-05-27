package com.cg.aim.AimSpringBoot.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Locker")
public class Locker {
	@Id
	@Column(name="locker_id")
	private int lockerId;

	@Column(name="capacity")
	private int capacity;

	@OneToMany(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="locker_item")
	private List<Item> item;

	public List<Item> getItem() {
		return item;
	}
	public void setItem(List<Item> item) {
		this.item = item;
	}

	public Locker() {
		super();

	}
	public Locker(int lockerId, int capacity, List<Item> list) {
		super();
		this.lockerId = lockerId;
		this.capacity = capacity;
		this.item = list;
	}

	public int getLockerId() {
		return lockerId;
	}

	public void setLockerId(int lockerId) {
		this.lockerId = lockerId;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public List<Item> getList() {//this one
		return item;
	}
	public void setList(List<Item> list) {
		this.item = list;
	}
	@Override
	public String toString() {
		return "Locker [lockerId=" + lockerId + ", capacity=" + capacity + ", list=" + item + "]";
	}


}


