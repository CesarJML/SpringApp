package com.example.daos;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.models.Contact;

public interface IContactDAO {
	
	void save(Contact entity);
	void delete(int id);
	void update(Contact entity);
	Contact findById(int id);
	List<Contact> getList();

}
