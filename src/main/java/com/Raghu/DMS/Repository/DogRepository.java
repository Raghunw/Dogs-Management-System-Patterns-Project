package com.Raghu.DMS.Repository;
/**
 * @author Raghupathi Reddy Rupanagudi
 */
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.Raghu.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer> {
	List<Dog> findByName(String name);

}
