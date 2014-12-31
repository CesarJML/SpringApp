package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Contact;
import com.example.services.ContactService;

@RestController
@RequestMapping(value="/rest")
public class ContactRESTController {

	
	@Autowired
	private ContactService contactService;
	
	@RequestMapping(value="/createContact", method=RequestMethod.POST)
	public Contact createContact(@RequestBody Contact contact)
	{
		contactService.createContact(contact);
		return contact;
	}
	
	@RequestMapping(value="/findContactById", method=RequestMethod.GET)
	public Contact findContactById(@RequestBody int id)
	{
		return contactService.getContactById(id);
	}
	
	@RequestMapping(value="/getAllContacts", method=RequestMethod.GET)
	public List<Contact> getAllContacts()
	{
		return contactService.getContacts();
	}
	
	@RequestMapping(value="/updateContact", method=RequestMethod.PUT)
	public void updateContact(@RequestBody Contact contact)
	{
		contactService.updateContact(contact);
	}
}
