package com.cg.aim.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.aim.dao.AimDaoDb;
import com.cg.aim.dto.Locker;

@Service
@Transactional
public class AimServiceImp implements AimService {
@Autowired
AimDaoDb dao;

	@Override
	public Locker addLocker(Locker locker) {
		// TODO Auto-generated method stub
		return dao.save(locker);
	}


}