package com.cg.aim.AimSpringBoot.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.aim.AimSpringBoot.dto.Item;
import com.cg.aim.AimSpringBoot.dto.LockerLog;
import com.cg.aim.AimSpringBoot.service.AimService;
/**
 * Written by Vishnu on 27-05-2019
 * last modified on 27-05-2019
 * class Controller to receive the request.(request handler)
 */

@RestController
@RequestMapping("/aim")
public class AimController {
	@Autowired
	AimService service;
	
	/**
	 * Written by Vishnu on 27-05-2019
	 * last modified on 27-05-2019
	 * it adds the Lockerlog,lockers and items 
	 */

	 @RequestMapping(value="/add",method=RequestMethod.POST)
	 public ResponseEntity<LockerLog> addLoc(@ModelAttribute LockerLog lockerLog){
		
		LockerLog log=service.addloc(lockerLog);
		if(log==null) {
			return new ResponseEntity<LockerLog>(HttpStatus.NOT_FOUND);
			
			
		}
			//return ResponseEntity("LockerlOG NOT ADDED",HttpStatus.NOT_FOUND);
			
		return  new ResponseEntity<LockerLog>(log,HttpStatus.OK);
	 
	 }

	 
	 /**
	  * Written by Vishnu on 27-05-2019
	  * last modified on 27-05-2019
	  * shows all list of items
	  */

	 @RequestMapping(value="/show",method=RequestMethod.GET)
	 public ResponseEntity<List<LockerLog>>show(@ModelAttribute Item item){
		List<LockerLog>itemslist=service.showAll();
		if(itemslist==null) {
			return new ResponseEntity("No items to show",HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<LockerLog>>(itemslist,HttpStatus.OK);
		
	} 
	 
	 
	 /**
	  * Written by Vishnu on 27-05-2019
	  * last modified on 27-05-2019
	  * finds the lockerlog id whether it is present or not.
	  */

	 @RequestMapping(value="/find",method=RequestMethod.POST)
	public ResponseEntity<List<LockerLog>> searchLockerLog(@RequestParam("id")int id){
		
		 List<LockerLog>logs=service.searchById(id);
		 if(logs.isEmpty()) {
			 return new ResponseEntity("No Lockerlog found",HttpStatus.NOT_FOUND);
		 }
		 return new ResponseEntity<List<LockerLog>>(logs,HttpStatus.OK);
		
		 
		 
		 
	 }
	 
	 	 
}
