package com.cg.aim.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.aim.dao.AimDaoDb;
import com.cg.aim.dao.AimDaoImp;
import com.cg.aim.dto.Item;
import com.cg.aim.dto.Locker;
import com.cg.aim.dto.LockerLog;
@Service
@Transactional
public class AimServiceImp implements AimService {
	@Autowired
	private AimDaoDb dao=null;
	


	public List<Item> showAll() {
		return dao.showAll();
	}

	public Locker searchById(int lockerId) throws Exception  {
		Locker locker=dao.findById(lockerId);
		if(locker==null) {
			//throw new Aimlockerexception("Please enter valid locker_Id");
		}
		return locker;
	}


	@Override
	public Locker add(Locker locker) {
		// TODO Auto-generated method stub
		return dao.save(locker);
	}

	@Override
	public LockerLog add(LockerLog lockerLog) {
		// TODO Auto-generated method stub
		return dao.save(lockerLog);
	}

	
	
}
