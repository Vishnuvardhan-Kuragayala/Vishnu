package com.cg.aim.dao;

import com.cg.aim.dto.Item;
import com.cg.aim.dto.Locker;
import com.cg.aim.dto.LockerLog;

public interface AimDaoDb {
	public Locker save(Locker locker);	
	public Item addingItem(int lockerId,String itemName,LockerLog locker);
}
