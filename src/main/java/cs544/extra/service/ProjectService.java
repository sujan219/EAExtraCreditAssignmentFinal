package cs544.extra.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cs544.extra.domain.Project;
import cs544.extra.repository.IProjectDAO;

@Service
public class ProjectService {

	@Autowired
	private IProjectDAO projectDAO;
	
	public void save(Project p){
		projectDAO.saveAndFlush(p);
	}
	
	public List<Project> getProjects(){
		return projectDAO.findAll();
	}
}
