package com.springboot.third;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<TopicClass> topics = new ArrayList<TopicClass>(Arrays.asList(
			new TopicClass(1, "Spring"),
			new TopicClass(2, "Hibernate"),
			new TopicClass(3, "Jsp"),
			new TopicClass(4, "Servlet")));

	public List<TopicClass> listOfTopics(){
		return topics;
	}
	
	public TopicClass topicDetails(int id){
		for (int i = 0; i < topics.size(); i++) {
			if(topics.get(i).getTopicId() == id)
				return topics.get(i);
		}
		return null;
	}
	
	public boolean addTopics(TopicClass topic){
		return topics.add(topic);
	}

	public boolean updateTopics(TopicClass topic, int id) {
		for (int i = 0; i < topics.size(); i++) {
			if(topics.get(i).getTopicId() == id) {
				topics.set(i, topic);
				return true;
			}
		}
		return false;
	}

	public boolean deleteTopics(int id) {
		for (int i = 0; i < topics.size(); i++) {
			if(topics.get(i).getTopicId() == id) {
				topics.remove(topics.get(i));
				return true;
			}
		}
		return false;
	}
}
