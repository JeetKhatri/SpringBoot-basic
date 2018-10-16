package com.springboot.third;

public class TopicClass {
	
	int topicId;
	String topicName;

	public TopicClass() {
	}
	
	public TopicClass(int topicId, String topicName) {
		this.topicId=topicId;
		this.topicName=topicName;
	}
	public int getTopicId() {
		return topicId;
	}

	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

}
