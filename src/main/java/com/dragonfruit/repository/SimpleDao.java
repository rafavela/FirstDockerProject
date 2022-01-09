package com.dragonfruit.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dragonfruit.bean.ReminderBean;

@Repository
public interface SimpleDao extends CrudRepository<ReminderBean, Long>{
	public List<ReminderBean> findAll();
}
