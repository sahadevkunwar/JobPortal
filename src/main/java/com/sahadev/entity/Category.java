package com.sahadev.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="category_tbl")
public class Category {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int catId;
	private String title;
	private  String description;
	private int type;
	
	public Category() {
		super();
	}
	
	public Category(int catId, String title, String description, int type) {
		super();
		this.catId = catId;
		this.title = title;
		this.description = description;
		this.type = type;
	}
	public int getCatId() {
		return catId;
	}
	public void setCatId(int catId) {
		this.catId = catId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
}
