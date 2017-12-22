package com.tworks.domain;

public class JobNotify {
	private int id,circle_code,city_id;
	public int getCircle_code() {
		return circle_code;
	}
	public void setCircle_code(int circle_code) {
		this.circle_code = circle_code;
	}
	public int getCity_id() {
		return city_id;
	}
	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	public String getState_name() {
		return state_name;
	}
	public void setState_name(String state_name) {
		this.state_name = state_name;
	}
	@Override
	public String toString() {
		return "JobNotify [id=" + id + ", circle_code=" + circle_code
				+ ", city_id=" + city_id + ", title=" + title
				+ ", description=" + description + ", city_name=" + city_name
				+ ", state_name=" + state_name + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	private String title;
	private String description;	
	private String city_name;	
	private String state_name;	


}
