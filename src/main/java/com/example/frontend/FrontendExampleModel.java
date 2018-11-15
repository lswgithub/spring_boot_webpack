package com.example.frontend;

public class FrontendExampleModel {
	private final long id;
	private final String content;
	
	public FrontendExampleModel(long id, String content) {
		this.id = id;
		this.content = content;
	}
	
	public long getId() {
		return id;
	}
	
	public String getContent() {
		return content;
	}
}