package com.cg.aim.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.stereotype.Repository;

import com.cg.aim.dto.Item;
import com.cg.aim.dto.Locker;
import com.cg.aim.dto.LockerLog;
import com.cg.aim.service.AimService;
@Repository("dao")
public class AimDaoImp implements AimDaoDb {
	static final Logger logger = Logger.getLogger(AimService.class);


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
		PropertyConfigurator.configure("C:\\Users\\KURAGAYALA VISHNU\\Desktop\\sts-4.2.1.RELEASE\\STS PROGRAMS\\AmazonSpringMvc\\src\\resources\\log4j.properties"); 
		logger.info("lOCKERlOG added successful");
	
		
		return null;
	}

	@Override
	public Locker findById(int id) {
		PropertyConfigurator.configure("C:\\Users\\KURAGAYALA VISHNU\\Desktop\\sts-4.2.1.RELEASE\\STS PROGRAMS\\AmazonSpringMvc\\src\\resources\\log4j.properties"); 
		logger.info("SEARCHES BY ID");
		
		return entitymanager.find(Locker.class, id);
		
	}

	@Override
	public List<Item> showAll() {
		Query query=entitymanager.createQuery("FROM Item");
		List<Item> itemList=query.getResultList();
		PropertyConfigurator.configure("C:\\Users\\KURAGAYALA VISHNU\\Desktop\\sts-4.2.1.RELEASE\\STS PROGRAMS\\AmazonSpringMvc\\src\\resources\\log4j.properties"); 
		logger.info("DISPLAY ALL LOCKERLOGS");

		return itemList;
	}

	@Override
	public List<Locker> showall() {
		Query query=entitymanager.createQuery("FROM Item");
		List<Locker> locList=query.getResultList();
		PropertyConfigurator.configure("C:\\Users\\KURAGAYALA VISHNU\\Desktop\\sts-4.2.1.RELEASE\\STS PROGRAMS\\AmazonSpringMvc\\src\\resources\\log4j.properties"); 
		logger.info("DISPLAY ALL LOCKERLOGS");

		return locList;
	}
	
}