package com.sahadev.Service;

import java.util.List;
import java.util.Optional;

import com.sahadev.entity.Category;
import com.sahadev.entity.Job;

public interface JobService {

	Job createJob(Job job);

	public List<Job> getAllJob();

	public Job getJobById(int job_id);

	
	  //public Job getJobByName(String title); 
	// public Job getJobByNameIgnoreCase(String title);

	public Job findByNameContaining(String title);

	 

}
