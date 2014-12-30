package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.models.Contact;
import com.example.services.ContactService;

@Controller
@RequestMapping(value="/contact")
public class ContactController {

	@Autowired
	private ContactService contactService;
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public ModelAndView home()
	{
		return new ModelAndView("home", "command", new Contact());
	}
	
	@RequestMapping(value="/createContact", method=RequestMethod.POST)
	public ModelAndView createContact(@ModelAttribute Contact contact)
	{
		int id = contactService.createContact(contact);
		ModelAndView mv = new ModelAndView("success");
		mv.addObject("id", id);
		mv.addObject("operation", "Created");
		return mv;
	}
	
	@RequestMapping(value="/deleteContact", method=RequestMethod.POST)
	public ModelAndView deleteContact(int id)
	{
		int returnId = contactService.deleteContact(id);
		ModelAndView mv = new ModelAndView("success");
		mv.addObject("id", id);
		mv.addObject("operation", "Deleted");
		return mv;
	}
	
	@RequestMapping(value="/retrieveById", method=RequestMethod.GET)
	public ModelAndView retrieveContactById(@RequestParam(value="id", required = true) int id)
	{
		Contact contact = contactService.getContactById(id);
		return new ModelAndView("contactDisplay", "result", contact);
	}
	
	@RequestMapping(value="/retrieveContacts", method=RequestMethod.GET)
	public ModelAndView retrieveContacts()
	{
		return new ModelAndView("contactList", "result", contactService.getContacts());
	}
	
}
