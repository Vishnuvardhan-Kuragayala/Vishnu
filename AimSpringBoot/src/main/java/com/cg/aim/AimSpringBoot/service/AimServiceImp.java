package com.cg.aim.AimSpringBoot.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.aim.AimSpringBoot.dao.AimDao;
import com.cg.aim.AimSpringBoot.dto.Item;
import com.cg.aim.AimSpringBoot.dto.LockerLog;
@Service
public class AimServiceImp implements AimService {
@Autowired
AimDao dao;


/**
 * Written by Vishnu on 27-05-2019
 * last modified on 27-05-2019
 * it adds the Lockerlog,
 */
	@Override
	public LockerLog addloc(LockerLog lockerLog) {
		 dao.save(lockerLog);
		return  dao.save(lockerLog);
	
	}
	 
	 /**
	  * Written by Vishnu on 04-05-2019
	  * last modified on 27-05-2019
	  * shows all list of items
	  */

	@Override
	public List<LockerLog> showAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
	 /**
	  * Written by Vishnu on 27-05-2019
	  * last modified on 27-05-2019
	  * finds the lockerlog id whether it is present or not.
	  */
	@Override
	public List<LockerLog> searchById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	

}
