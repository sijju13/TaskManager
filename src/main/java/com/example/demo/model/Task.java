package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TaskData")
public class Task {
	
	private int taskid;
	private String  taskTitle;
	private int duration;
	private String assingedto; 
	
	
	@Id
	public int getTaskid() {
		return taskid;
	}
	public void setTaskid(int taskid) {
		this.taskid = taskid;
	}
	public String getTaskTitle() {
		return taskTitle;
	}
	public void setTaskTitle(String taskTitle) {
		this.taskTitle = taskTitle;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getAssingedto() {
		return assingedto;
	}
	public void setAssingedto(String assingedto) {
		this.assingedto = assingedto;
	}
	

}
