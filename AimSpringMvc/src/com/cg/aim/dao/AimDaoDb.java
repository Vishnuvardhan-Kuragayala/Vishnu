package com.cg.aim.dao;

import java.util.List;

import com.cg.aim.dto.Item;
import com.cg.aim.dto.Locker;
import com.cg.aim.dto.LockerLog;

public interface AimDaoDb {
	public static final String queryInsertLocker ="INSERT INTO LOCKER VALUES(?,?)";

	public static final String queryInsertItem ="INSERT INTO ITEM VALUES(?,?,?,?)";

	public Locker save(LockerLog lockerLog);	
	public Locker findById(int id) ;
	public List<Item> showAll();

		
	

}