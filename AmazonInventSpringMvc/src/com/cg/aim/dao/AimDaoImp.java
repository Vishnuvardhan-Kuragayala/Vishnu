package com.cg.aim.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.aim.dto.Item;
import com.cg.aim.dto.Locker;
import com.cg.aim.dto.LockerLog;
@Repository
public class AimDaoImp implements AimDaoDb {
	    @PersistenceContext
		EntityManager em;
		
		static int logCount=100;
		

		public Locker findById(int id) {
			try {
			//em=Dbutil.getConnection();
			String sql="from Locker where lockerId=:id";
			TypedQuery<Locker> query=em.createQuery(sql,Locker.class);
			query.setParameter("id",id);
			Locker locker=query.getSingleResult();
			return locker;
			}catch(Exception e) {
				//throw new Aimlockerexception("Locker not found");
			}finally {
				em.close();
			}
			return null;
		}
		public List<Locker>showall(){
			//em=Dbutil.getConnection();
			Query sqlquery=em.createQuery(" from Locker where Capacity>50");
		//	TypedQuery<Locker> query=em.createQuery(sql,Locker.class);
	        List<Locker> lockerList=sqlquery.getResultList();
			
			return lockerList;
		}
		
		

		public List<Item> showAll() {
			//em=Dbutil.getConnection();
			String sql="select item from Item item";
			TypedQuery<Item> query=em.createQuery(sql,Item.class);
			List<Item> itemList=query.getResultList();
			
			return itemList;
		}

		@Override
		public Locker save(Locker lockerLog) {
			em.persist(lockerLog);
			em.flush();
			return lockerLog;
			// TODO Auto-generated method stub
			
		}
		@Override
		public LockerLog save(LockerLog lockerLog) {
			// TODO Auto-generated method stub
			em.persist(lockerLog);
			em.flush();
			return lockerLog;
		}

		

		

	}		
		
	
	
	


		
	
	
