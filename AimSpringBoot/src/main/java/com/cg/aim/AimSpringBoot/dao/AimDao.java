package com.cg.aim.AimSpringBoot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.aim.AimSpringBoot.dto.Item;
import com.cg.aim.AimSpringBoot.dto.LockerLog;
/**
 * Written by Vishnu on 27-05-2019
 * last modified on 27-05-2019
 * dao interface extends jparepository and access curdrepository interface
 */
public interface AimDao extends JpaRepository<LockerLog, Integer>{
	//public LockerLog findById(int lockerId);
	//public List<Item> showAll();
	 /**
	  * Written by Vishnu on 27-05-2019
	  * last modified on 27-05-2019
	  * finds the lockerlog id whether it is present or not.
	  */
	public List<LockerLog>findById(int id);
}
