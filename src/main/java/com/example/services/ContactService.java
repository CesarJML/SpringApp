package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.daos.IContactDAO;
import com.example.models.Contact;

@Service
public class ContactService {
	
	@Autowired
	private IContactDAO contactDAO;
	
	public ContactService()
	{
	}
	
	public int createContact(Contact contact)
	{
		return contactDAO.save(contact);
	}
	
	public int deleteContact(int id)
	{
		return contactDAO.delete(id);
	}
	
	public Contact getContactById(int id)
	{
		return contactDAO.findById(id);
	}
	
	public List<Contact> getContacts()
	{
		List<Contact> contacts = contactDAO.getList();
		return contacts;
	}
	
	public int updateContact(Contact contact)
	{
		return contactDAO.update(contact);
	}

}
