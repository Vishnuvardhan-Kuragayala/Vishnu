package com.cg.aim.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.aim.dto.Item;
import com.cg.aim.dto.Locker;
import com.cg.aim.dto.LockerLog;
@Repository("dao")
public class AimDaoImp implements AimDaoDb {

	@PersistenceContext
	EntityManager entitymanager;
	@Override
	public Locker save(LockerLog lockerLog) {
		if(entitymanager.find(Locker.class, lockerLog.getLocker().getLockerId())==null) {
			entitymanager.persist(lockerLog);
			entitymanager.flush();
		}
		else {
			entitymanager.persist(lockerLog.getLocker().getItem().get(0));
			entitymanager.flush();
		}
		return null;
	}

	@Override
	public Locker findById(int id) {
		return entitymanager.find(Locker.class, id);
	}

	@Override
	public List<Item> showAll() {
		Query query=entitymanager.createQuery("FROM Item");
		List<Item> itemList=query.getResultList();
		return itemList;
	}

	@Override
	public List<Locker> showall() {
		Query query=entitymanager.createQuery("FROM Item");
		List<Locker> locList=query.getResultList();
		return locList;
	}
	
}
