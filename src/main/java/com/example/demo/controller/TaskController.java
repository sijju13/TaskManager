package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Task;
import com.example.demo.model.TaskRepository;
@RestController
public class TaskController {
	@Autowired
	TaskRepository tasks;
	
	@GetMapping("/tasks")
	public List<Task> getTask()
	{
		return tasks.findAll();
	}
	
	
	@PostMapping("/inserttasks")
	public Task saveTask(@RequestBody Task task)
	{
		Task t=tasks.save(task);
		return t;
	}
	
	@PutMapping("/updateTask")
	public Task updateTask(@RequestBody Task tobj)
	{
		int taskid=tobj.getTaskid();
		Optional<Task> updatetask=tasks.findById(taskid);
		Task update=null;
		if(updatetask.isPresent())
		{
			update=updatetask.get();
			update.setTaskid(tobj.getTaskid());
			update.setTaskTitle(tobj.getTaskTitle());
			update.setDuration(tobj.getDuration());
			update.setAssingedto(tobj.getAssingedto());
			tasks.save(update);
		}
		return update;
	}

}
