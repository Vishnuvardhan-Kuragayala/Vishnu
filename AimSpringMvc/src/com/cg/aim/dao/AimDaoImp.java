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




/**
 * Written by Vishnu on 04-05-2019
 * last modified on 21-05-2019
 * class AimDaoImp add the data to the database 
 */
@Repository("dao")
public class AimDaoImp implements AimDaoDb {

	@PersistenceContext
	EntityManager entitymanager;
	EntityManager entityManager;
/**
 * Written by Vishnu on 04-05-2019
 * last modified on 21-05-2019
 * save method save the LockerLog details to database
 
 * @returnsLockerLog
 */
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
	
	
	/**
	 * Written by Vishnu on 04-05-2019
	 * last modified on 21-05-2019
	 * finds locker by id from database
	 * @returns whether locker is existig or not
	 */

	@Override
	public Locker findById(int id) {
		return entitymanager.find(Locker.class, id);
	}

	/**
	 * Written by Vishnu on 04-05-2019
	 * last modified on 21-05-2019
	 * lists the items present in database
	 * @returns list of items
	 */
	@Override
	public List<Item> showAll() {
		Query query=entitymanager.createQuery("FROM Item");
		List<Item> itemList=query.getResultList();
		return itemList;
	}

	
	
}
