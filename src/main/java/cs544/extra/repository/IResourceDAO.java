package cs544.extra.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cs544.extra.domain.Resource;

public interface IResourceDAO extends JpaRepository<Resource, Integer>{
	public Resource saveAndFlush(Resource arg0);
	List<Resource> findAll();
}