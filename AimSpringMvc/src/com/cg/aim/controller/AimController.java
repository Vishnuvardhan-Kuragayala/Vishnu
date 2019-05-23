package com.cg.aim.controller;

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

@Controller
public class AimController {
	Locker lockerobj;
	LockerLog logObj;
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

	@GetMapping("addlocker")
	public ModelAndView getAddLockerOne(@ModelAttribute("log") LockerLog lockerLog)
	{
		return new ModelAndView("addOne");
		
	}
	@PostMapping("addLocOne")

	public ModelAndView addLocker(@ModelAttribute("log") LockerLog lockerLog)
	{
		System.out.println(lockerLog.getDescription());
		Locker locker=service.add(lockerLog);
		
		return new ModelAndView("successtwo","key",locker);
	}
	@GetMapping("additems")
	public ModelAndView getItem(@ModelAttribute("item") Item item)
	{
		return new ModelAndView("additem");
		
	}
	@PostMapping("itemadd")

	public ModelAndView addItem(@ModelAttribute("item") Item item,@RequestParam("lid") Integer lid)
	{
		Locker locker=service.searchById(lid);
		item.setLocker(locker);
		System.out.println(locker);
		Locker loc=new Locker();
		LockerLog log=new LockerLog();
		List<Item> iList=new ArrayList<Item>();
		iList.add(item);
		loc.setItem(iList);
		log.setLocker(loc);
		service.add(log);
		return new ModelAndView("additem","key",item);
	}

	
	@GetMapping("showitems")
	public ModelAndView showItem()
	{
		List<Item> items=service.showAll();
		System.out.println(items);
		return new ModelAndView("showallitems","items",items);
		
	}
	
	
	
	
	
	@GetMapping("searchlocker")
	public ModelAndView getsearch(@ModelAttribute("searchlocker")Locker locker)
	{
		return new ModelAndView("Searchlockerr");
	}
	@PostMapping("searchLockerr")
	public ModelAndView SearchLockerr(@ModelAttribute("searchlockerr")Locker lockerr,@RequestParam("lockerId")int lockerr_id)
	{
		Locker Lockerlit;
		Lockerlit=service.searchById(lockerr_id);
		
		
		
		return new ModelAndView("successOne","lockers",Lockerlit);
		
	}
	
	
}
