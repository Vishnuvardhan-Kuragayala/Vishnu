package com.cg.aim.service;

import java.util.List;

import com.cg.aim.dto.Item;
import com.cg.aim.dto.Locker;
import com.cg.aim.dto.LockerLog;

public interface AimService {
	public Locker add(LockerLog lockerLog);
	public List<Item> showAll();
	public List<Locker>showall();
	public Locker searchById(int lockerId);
	



}
