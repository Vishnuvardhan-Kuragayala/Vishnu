package com.cg.aim.config.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cg.aim.dto.Locker;
import com.cg.aim.service.AimService;


@Controller
public class MyController {

@Autowired
AimService service;
@GetMapping("home")
public ModelAndView homePage()
{
	return new ModelAndView("homepage");
}

@GetMapping("addlocker")
public ModelAndView getAddLocker(@ModelAttribute("locker") Locker locker)
{
	return new ModelAndView("addlocker");
	
}
@PostMapping("addLocker")
public ModelAndView AddTutor(@ModelAttribute("locker") Locker locker)
{
	Locker addlocker=service.addLocker(locker);
	return new ModelAndView("success","key",addlocker);
	
}



}
