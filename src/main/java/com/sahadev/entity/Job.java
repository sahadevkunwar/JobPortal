package com.sahadev.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="job")
public class Job {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int job_id;
	private String title;
	private String jobcategory;
	private String level;
	private int noofvacancy;
	private String employmenttype;
	private String joblocation;
    private Long salary;
    private String deadline;
    private String educationlevel;
    private String experiencerequired;
    private String jobdescription;
    
	public Job() {
		super();
	}

	public int getJob_id() {
		return job_id;
	}

	public void setJob_id(int job_id) {
		this.job_id = job_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getJobcategory() {
		return jobcategory;
	}

	public void setJobcategory(String jobcategory) {
		this.jobcategory = jobcategory;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public int getNoofvacancy() {
		return noofvacancy;
	}

	public void setNoofvacancy(int noofvacancy) {
		this.noofvacancy = noofvacancy;
	}

	public String getEmploymenttype() {
		return employmenttype;
	}

	public void setEmploymenttype(String employmenttype) {
		this.employmenttype = employmenttype;
	}

	public String getJoblocation() {
		return joblocation;
	}

	public void setJoblocation(String joblocation) {
		this.joblocation = joblocation;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public String getEducationlevel() {
		return educationlevel;
	}

	public void setEducationlevel(String educationlevel) {
		this.educationlevel = educationlevel;
	}

	public String getExperiencerequired() {
		return experiencerequired;
	}

	public void setExperiencerequired(String experiencerequired) {
		this.experiencerequired = experiencerequired;
	}

	public String getJobdescription() {
		return jobdescription;
	}

	public void setJobdescription(String jobdescription) {
		this.jobdescription = jobdescription;
	}

	public Job(int job_id, String title, String jobcategory, String level, int noofvacancy, String employmenttype,
			String joblocation, Long salary, String deadline, String educationlevel, String experiencerequired,
			String jobdescription) {
		super();
		this.job_id = job_id;
		this.title = title;
		this.jobcategory = jobcategory;
		this.level = level;
		this.noofvacancy = noofvacancy;
		this.employmenttype = employmenttype;
		this.joblocation = joblocation;
		this.salary = salary;
		this.deadline = deadline;
		this.educationlevel = educationlevel;
		this.experiencerequired = experiencerequired;
		this.jobdescription = jobdescription;
	}

	@Override
	public String toString() {
		return "Job [job_id=" + job_id + ", title=" + title + ", jobcategory=" + jobcategory + ", level=" + level
				+ ", noofvacancy=" + noofvacancy + ", employmenttype=" + employmenttype + ", joblocation=" + joblocation
				+ ", salary=" + salary + ", deadline=" + deadline + ", educationlevel=" + educationlevel
				+ ", experiencerequired=" + experiencerequired + ", jobdescription=" + jobdescription + "]";
	}

	

}
