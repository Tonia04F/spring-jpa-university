package jana60.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import jana60.model.Department;

public interface DepartmentRepository extends CrudRepository<Department, Integer> {

	 List<Department> findAllByOrderByName();
	
}
