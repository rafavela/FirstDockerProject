package com.dragonfruit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dragonfruit.bean.ReminderBean;
import com.dragonfruit.repository.SimpleDao;

@Service
public class SimpleService {
	
	@Autowired
	private SimpleDao simpleDao;
	
	public List<ReminderBean> getAllReminders(){
		return simpleDao.findAll();
	}
}
