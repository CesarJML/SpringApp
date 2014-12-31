package com.example.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.models.Contact;

@Repository
@Transactional
public class ContactDAO implements IContactDAO {

	@PersistenceContext
	private EntityManager em;
	

	public void save(Contact entity) {
		
		em.persist(entity);

	}

	public void delete(int id) {

		Contact contact = this.findById(id);
		
		if(contact != null)
			em.remove(contact);
		
	}
	

	public void update(Contact entity) {
		
		em.persist(entity);
		
	}


	public Contact findById(int id) {
		
		return em.find(Contact.class, id);
	}

	public List<Contact> getList() {
		
		Query query = em.createQuery("SELECT e FROM Contact e");
		return query.getResultList();
	}
	
	public ContactDAO()
	{
	}
	
}
