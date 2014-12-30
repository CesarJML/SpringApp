package com.example.daos;

import java.util.List;

public interface IDAO {
	
	<T> int create(T entity);
	int delete(int id);
	<T> int update(T entity);
	<T> T getById(int id);
	<T> List<T> getList();

}
