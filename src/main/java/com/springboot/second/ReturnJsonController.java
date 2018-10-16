package com.springboot.second;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReturnJsonController {
	
	@RequestMapping("topic-list")
	public List<TopicClass> listOfTopic() {
		List<TopicClass> obj = new ArrayList<TopicClass>();
		obj.add(new TopicClass(1, "Spring"));
		obj.add(new TopicClass(2, "Hibernate"));
		obj.add(new TopicClass(3, "Jsp"));
		obj.add(new TopicClass(4, "Servlet"));
		return obj;
	}
}
