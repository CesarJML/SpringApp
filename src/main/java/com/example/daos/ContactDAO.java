package com.example.daos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.example.models.Contact;

public class ContactDAO implements IDAO {

	private static List<Contact> contacts = new ArrayList<Contact>();
	

	public <T> int create(T entity) {
		
		contacts.add((Contact)entity);
		return ((Contact)entity).getId();
	}

	public int delete(int id) {
		// TODO Auto-generated method stub
		contacts = contacts.stream().filter(x -> x.getId() != id).collect(Collectors.toList());
		return id;
	}

	public <T> int update(T entity) {
		contacts.stream().filter(x -> x.getId() == ((Contact)entity).getId()).map(x -> x = (Contact) entity);
		return ((Contact)entity).getId();
	}

	@SuppressWarnings("unchecked")
	public <T> T getById(int id) {
		return (T) contacts.stream().filter(x -> x.getId() == id).findFirst().get();
	}

	public <T> List<T> getList() {
		// TODO Auto-generated method stub
		return (List<T>) contacts;
	}
	
}
