package com.example.services;

import java.util.List;

import com.example.daos.ContactDAO;
import com.example.models.Contact;

public class ContactService {
	
	private ContactDAO contactDAO;
	
	public ContactService()
	{
		contactDAO = new ContactDAO();
	}
	
	public int createContact(Contact contact)
	{
		return contactDAO.create(contact);
	}
	
	public int deleteContact(int id)
	{
		return contactDAO.delete(id);
	}
	
	public Contact getContactById(int id)
	{
		return contactDAO.getById(id);
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
