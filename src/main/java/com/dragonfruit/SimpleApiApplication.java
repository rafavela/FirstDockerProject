package com.dragonfruit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dragonfruit.bean.ReminderBean;
import com.dragonfruit.service.SimpleService;

@SpringBootApplication
@RestController
public class SimpleApiApplication {

	@Autowired
	private SimpleService simpleService;
	
	@RequestMapping("/")
	public List<ReminderBean> home() {
		return simpleService.getAllReminders();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SimpleApiApplication.class, args);
	}

}
