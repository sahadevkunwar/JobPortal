package com.sahadev.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sahadev.Repository.CategoryRepository;
import com.sahadev.Repository.JobRepository;
import com.sahadev.Service.JobService;
import com.sahadev.entity.Category;
import com.sahadev.entity.Job;
import com.sahadev.entity.Roles;

@Service
@Transactional
public class JobServiceImpl implements JobService{
	@Autowired
	private JobRepository jobRepository;

	@Override
	public Job createJob(Job job) {

		return jobRepository.save(job);	
		
	}

	@Override
	public List<Job> getAllJob() {
		return jobRepository.findAll();
	}

	@Override
	public Job getJobById(int job_id) {
		return jobRepository.findById(job_id).orElse(new Job());
	}

	/*
	 * @Override public Job getJobByName(String title) { return
	 * jobRepository.findByTitle(title); }
	 */
	
	
	/*
	 * @Override public Job getJobByNameIgnoreCase(String title) { return
	 * jobRepository.findByTitleIgnoreCase(title); }
	 */

	@Override
	public Job findByNameContaining(String title) {
	return jobRepository.findByTitleContaining(title);
	}


	
	
}
