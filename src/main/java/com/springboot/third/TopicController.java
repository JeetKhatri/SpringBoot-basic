package com.springboot.third;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("topics")
	public List<TopicClass> listOfTopic() {
		return topicService.listOfTopics();
	}
	
	@RequestMapping("/topic/{id}")
	public TopicClass topicDetails(@PathVariable int id) {
		return topicService.topicDetails(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public boolean addTopic(@RequestBody TopicClass topic) {
		return topicService.addTopics(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public boolean updateTopic(@RequestBody TopicClass topic, @PathVariable int id) {
		return topicService.updateTopics(topic,id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public boolean deleteTopc(@PathVariable int id) {
		return topicService.deleteTopics(id);
	}
}
