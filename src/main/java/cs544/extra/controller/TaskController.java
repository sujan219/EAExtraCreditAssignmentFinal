package cs544.extra.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cs544.extra.domain.Task;
import cs544.extra.repository.ITaskDAO;

@Controller
public class TaskController {
	
	@Autowired
	private ITaskDAO taskDAO;
	
	@RequestMapping(value="tasks", params={"id=projectId"})
	public String openTasksPage(Model model, int projectId){
		List<Task> tList = taskDAO.findByProject_Id(projectId);
		model.addAttribute("taskList", tList);
		model.addAttribute("task", new Task());
		return "tasks";
	}
	
	@RequestMapping(value="tasks", params={"id=projectId"}, method=RequestMethod.POST)
	public String saveTask(Model model, Task task, int projectId){
		taskDAO.saveAndFlush(task);
		return openTasksPage(model, projectId);
	}
}