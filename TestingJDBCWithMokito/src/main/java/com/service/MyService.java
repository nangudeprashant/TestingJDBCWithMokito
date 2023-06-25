package com.service;
import com.dao.MyDao;
import com.entity.MyEntity;

public class MyService {
	
	private MyDao myDao;
	
	public MyService(MyDao myDao) {
		this.myDao = myDao;
	}
	
	public MyEntity findById(long id) {
		return myDao.findById(id);
	}

}
