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
@Service("service")
@Transactional
public class AimServiceImp implements AimService {
	@Autowired
	 AimDaoDb dao;
	
	public AimServiceImp() {
		dao=new AimDaoImp();
	}

	public Locker add(LockerLog lockerLog) {
		return dao.save(lockerLog) ;
	}

	public List<Item> showAll() {
		return dao.showAll();
	}

	public Locker searchById(int lockerId)  {
		Locker locker=dao.findById(lockerId);
		if(locker==null) {
			//throw new Aimlockerexception("Please enter valid locker_Id");
		}
		return locker;
	}

	
	public List<Locker> showall() {
		return dao.showall();		// TODO Auto-generated method stub
	}
	

}
