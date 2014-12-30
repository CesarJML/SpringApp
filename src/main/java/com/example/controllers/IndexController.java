package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.models.Contact;

@Controller
@RequestMapping(value="/index")
public class IndexController {

	@RequestMapping(value="/createContact", method=RequestMethod.GET)
	public ModelAndView createContact()
	{
		return new ModelAndView("createContact", "command", new Contact());
	}
	
	@RequestMapping(value="/deleteContact", method=RequestMethod.GET)
	public String deleteContact()
	{
		return "deleteContact";
	}
	
	@RequestMapping(value="/retrieveContactById", method=RequestMethod.GET)
	public String retrieveContactById()
	{
		return "retrieveContactById";
	}
	
	@RequestMapping(value="/retrieveContacts", method=RequestMethod.GET)
	public String retrieveContacts()
	{
		return "retrieveContacts";
	}
	
}
