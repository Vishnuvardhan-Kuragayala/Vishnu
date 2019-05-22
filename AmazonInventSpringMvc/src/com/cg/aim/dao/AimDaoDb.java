package com.cg.aim.dao;


import java.util.List;

import com.cg.aim.dto.Item;
import com.cg.aim.dto.Locker;
import com.cg.aim.dto.LockerLog;


public interface AimDaoDb {
	public Locker save(Locker lockerLog);
	public LockerLog save(LockerLog lockerLog);
	
	public Locker findById(int id) throws Exception;
	public  List<Item> showAll();}


