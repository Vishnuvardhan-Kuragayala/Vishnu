package com.cg.aim.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.aim.dto.Item;
import com.cg.aim.dto.Locker;
import com.cg.aim.dto.LockerLog;
@Repository
public class AimDaoImp implements AimDaoDb  {
	static List<Locker> LockerData;
	
	public AimDaoImp() {
		LockerData=new ArrayList<Locker>();
	}
	@PersistenceContext
    EntityManager entitymanager;
	@Override
	public Locker save(Locker locker) {
		entitymanager.persist(locker);
        entitymanager.flush();
		return locker;
	}
	@Override
	public Item addingItem(int lockerId, String itemName, LockerLog locker) {
		
		Locker loc;
		loc=entitymanager.find(Locker.class,lockerId);
		List<Item>items=new ArrayList<Item>();
		Item item=new Item();
		item.setBatchNumber(lockerId);
		item.setName(itemName);
		items=loc.getItem();
		items.add(item);
		loc.setItem(items);
		entitymanager.persist(loc);
		entitymanager.flush();
		return item;
	}


		
	
	
}