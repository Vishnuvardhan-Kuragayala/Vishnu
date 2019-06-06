package com.cg.aim.service;

import java.util.List;


import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.aim.dao.AimDaoDb;
import com.cg.aim.dao.AimDaoImp;
import com.cg.aim.dto.Item;
import com.cg.aim.dto.Locker;
import com.cg.aim.dto.LockerLog;
@Service("service")
@Transactional
public class AimServiceImp implements AimService {
	static final Logger logger = Logger.getLogger(AimServiceImp.class);
	@Autowired
	 AimDaoDb dao;
	
	public AimServiceImp() {
		dao=new AimDaoImp();
	}

	public Locker add(LockerLog lockerLog) {
		PropertyConfigurator.configure("C:\\Users\\KURAGAYALA VISHNU\\Desktop\\sts-4.2.1.RELEASE\\STS PROGRAMS\\AmazonSpringMvc\\src\\resources\\log4j.properties"); 
		logger.info("lOCKERlOG added successful");
		return dao.save(lockerLog) ;
	}

	public List<Item> showAll() {
		PropertyConfigurator.configure("C:\\Users\\KURAGAYALA VISHNU\\Desktop\\sts-4.2.1.RELEASE\\STS PROGRAMS\\AmazonSpringMvc\\src\\resources\\log4j.properties"); 
		logger.info("DISPLAY ALL LOCKERLOGS");

		return dao.showAll();
	}

	public Locker searchById(int lockerId)  {
		Locker locker=dao.findById(lockerId);
		if(locker==null) {
			//throw new Aimlockerexception("Please enter valid locker_Id");
		}
		PropertyConfigurator.configure("C:\\Users\\KURAGAYALA VISHNU\\Desktop\\sts-4.2.1.RELEASE\\STS PROGRAMS\\AmazonSpringMvc\\src\\resources\\log4j.properties"); 
		logger.info("SEARCHES BY ID");
		
		return locker;
	}

	
	public List<Locker> showall() {
		PropertyConfigurator.configure("C:\\Users\\KURAGAYALA VISHNU\\Desktop\\sts-4.2.1.RELEASE\\STS PROGRAMS\\AmazonSpringMvc\\src\\resources\\log4j.properties"); 
		logger.info("DISPLAY ALL LOCKERLOGS");

		return dao.showall();		// TODO Auto-generated method stub
	}
	

}