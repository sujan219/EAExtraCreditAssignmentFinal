package cs544.extra.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cs544.extra.domain.Project;

public interface IProjectDAO extends JpaRepository<Project, Integer> {

	public Project saveAndFlush(Project arg0);

	public List<Project> findAll();
	
	public Project findOneById(int id);
}