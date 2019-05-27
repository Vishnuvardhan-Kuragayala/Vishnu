package com.cg.aim.AimSpringBoot.service;

import java.util.List;

import com.cg.aim.AimSpringBoot.dto.Item;
import com.cg.aim.AimSpringBoot.dto.Locker;
import com.cg.aim.AimSpringBoot.dto.LockerLog;

public interface AimService {

/**
 * Written by Vishnu on 04-05-2019
 * last modified on 27-05-2019
 * it adds the Lockerlog,
 */
	public LockerLog addloc(LockerLog lockerLog);
	
	/**
	  * Written by Vishnu on 04-05-2019
	  * last modified on 27-05-2019
	  * shows all list of items
	  */
	public List<LockerLog> showAll();
	
	 /**
	  * Written by Vishnu on 04-05-2019
	  * last modified on 27-05-2019
	  * finds the lockerlog id whether it is present or not.
	  */
	public List<LockerLog> searchById(int id);
}