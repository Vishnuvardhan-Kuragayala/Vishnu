package com.cg.aim.config.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.aim.dto.Item;
import com.cg.aim.dto.Locker;
import com.cg.aim.dto.LockerLog;
import com.cg.aim.service.AimService;
import com.cg.saloon.dto.Saloon;
import com.cg.saloon.exception.SaloonNotFoundException;

@Controller
public class MyController {

Locker lockerobj;
@Autowired
AimService service;
@GetMapping("home")
public ModelAndView homePage()
{
	return new ModelAndView("homepage");
}


/*@GetMapping("addlocker")
public ModelAndView getAddLocker(@ModelAttribute("locker") Locker locker)
{
	return new ModelAndView("add");
	
}
@PostMapping("addLoc")
public ModelAndView AddTutor(@ModelAttribute("locker") Locker locker)
{
	Locker addlocker=service.add(locker);
	return new ModelAndView("success","key",addlocker);
	}*/

@GetMapping("addlockerLog")
public ModelAndView getAddLockerOne(@ModelAttribute("locker") LockerLog locker)
{
	return new ModelAndView("addOne");
	
}
@PostMapping("addLocOne")

public ModelAndView AddTutorOme(@ModelAttribute("locker") LockerLog locker)
{
	LockerLog addlocker=service.add(locker);
	return new ModelAndView("successOne","key",addlocker);
}

@GetMapping("additems")
public ModelAndView AddItemss()
{
	return new ModelAndView("addit") ;
	
}
@PostMapping("additp")
public ModelAndView Additloc(@RequestParam ("Itemname")String name,@RequestParam("ItemId")int id,@RequestParam("ItembatchNumber")int batchNumber)
{
	
	Item ite=new Item();
	ite.setName(name);
	ite.setId(id);
	ite.setBatchNumber(batchNumber);
	List<Item>Itemslist=new ArrayList<>();
	Itemslist.add(ite);
	Locker locke=new Locker();
	System.out.println(lockerobj+"hi");
	locke.setLockerId(lockerobj.getLockerId());
	
	locke.setCapacity(lockerobj.getCapacity());
	locke.setList(Itemslist);
	
	service.add(locke);
	return new ModelAndView("success");
	
	
	
	
	
	/*@GetMapping("searchpage")
	public String searchPage() {
	 return ("searchlocker");
	}

	@GetMapping("searchpost")
	public ModelAndView showlocker(@RequestParam("Addsaloonlocker") int lockerid)  {
	 Locker sa=new Locker();
	 List <Locker>searchresult=service.searchById(id);
	 
	 return new ModelAndView("showlocker","showlockersearch");
	// eve.setEventName(name);
	 //Event eventSearch=delegateservice.eventInfo(eve);
	 //return new ModelAndView("searchresult","showeventsearch",eventSearch);
	} 
	@GetMapping("goHome")
	public ModelAndView goHomePgae()
	{
		return new ModelAndView("listlocker");
		
	}*/
	
}}
