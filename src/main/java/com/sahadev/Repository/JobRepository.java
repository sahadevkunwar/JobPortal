package com.sahadev.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sahadev.entity.Job;
@Repository
public interface JobRepository extends JpaRepository<Job,Integer>{

	 public Job findByTitle(String title);

	//public Job findByTitleIgnoreCase(String title);

	public Job findByTitleContaining(String title);

}
