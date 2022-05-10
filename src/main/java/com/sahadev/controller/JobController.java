package com.sahadev.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sahadev.Service.CategoryService;
import com.sahadev.Service.JobService;
import com.sahadev.entity.Category;
import com.sahadev.entity.Job;
import com.sahadev.entity.User;

@Controller
@RequestMapping("/employeer")
public class JobController {

	@Autowired
	private JobService jobService;
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/employeerHome")
	public String openHome() {
		return "employeer_home";
	}

	@GetMapping("/addJob")
	public String addJob(Model model) {
		model.addAttribute("itemlist", categoryService.getAllCategory());
		return "addJob";
	}

	@PostMapping("/addJob")
	public String displayCategory(@ModelAttribute Job job) {
		jobService.createJob(job);
		return "redirect:/login";
	}

	/*
	 * @GetMapping("/displayjob/{id}") public String getAllJob(Model model) {
	 * model.addAttribute("joblist", jobService.getAllJob()); return "displayJob"; }
	 */
	/*
	 * @GetMapping("/displayjob/{id}") public String
	 * getJobById(@PathVariable("id")int job_id,Model model) {
	 * model.addAttribute("joblist", jobService.getJobById(job_id));
	 * //jobService.getJobById(job_id); return "displayJob";
	 * 
	 * }
	 */
	
	
	/*
	 * @GetMapping("/displayjob/{title}") public String
	 * getJobByName(@PathVariable("title") String title,Model model) {
	 * model.addAttribute("joblist",jobService.getJobByNameIgnoreCase(title)); //
	 * jobService.getJobByNameIgnoreCase(title); return "displayJob"; }
	 */
	 

	  @GetMapping("/displayjob/{title}") 
	  public String findByNameContaining(@PathVariable("title") String title,Model model) {
	  model.addAttribute("joblist",jobService.findByNameContaining(title));
	 // jobService.getJobByName(title); 
	  return "displayJob"; }
	 
}
