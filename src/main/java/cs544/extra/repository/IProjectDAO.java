package cs544.extra.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cs544.extra.domain.Project;

public interface IProjectDAO extends JpaRepository<Project, Integer> {

	public Project saveAndFlush(Project arg0);

	// public void addProject(Project p);
	public List<Project> findAll();
	// public void editProject(Project p);
	// public void addTask(Project p, Task t);
	// public void addBeneficiary(Project p, Beneficiary b);
}
