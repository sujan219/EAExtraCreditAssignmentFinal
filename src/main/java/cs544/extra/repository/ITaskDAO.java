package cs544.extra.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cs544.extra.domain.Resource;
import cs544.extra.domain.Task;

public interface ITaskDAO extends JpaRepository<Task, Integer>{
	public Task saveAndFlush(Task arg0);
	public List<Task> findAll();
	public List<Task> findByProject_Id(int id);
}