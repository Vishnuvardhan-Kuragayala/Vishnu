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
/**@AuthorVishnu
 * write on 20-05-2019
 * lastModified 21-05-2019
 * Class used to perform Business Logic and Interact with dao.
 */
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
	
	/**@Author Vishnu
	 * write on 20-05-2019
	 * lastModified 21-05-2019
	 * (non-Javadoc)
	 * @see com.cg.aim.service.AimServiceImp
	 *  @returns list of items
	 */

	public List<Item> showAll() {
		return dao.showAll();
	}

	/**@Author Vishnu
	 * write on 20-05-2019
	 * lastModified 21-05-2019
	 * (non-Javadoc)
	 * @see com.cg.aim.service.AimServiceImp
	 *  @returns search locker whether it is existing or not
	 */
	public Locker searchById(int lockerId)  {
		Locker locker=dao.findById(lockerId);
		if(locker==null) {
			//throw new Aimlockerexception("Please enter valid locker_Id");
		}
		return locker;
	}

	
	

}
