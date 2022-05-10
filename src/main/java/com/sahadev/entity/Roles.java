package com.sahadev.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="role_table")
public class Roles implements Serializable{

	private static final long serialVersionUID = -3839009371711250899L;
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 @Column(name="role_id",updatable=false, nullable=false)
	private int id;
	 
	 public String role;
	 
	 @OneToOne(fetch=FetchType.LAZY , cascade=CascadeType.ALL)
	 @JoinColumn(name="user_id")
	 private User user;

	public Roles() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Roles(int id, String role, User user) {
		super();
		this.id = id;
		this.role = role;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	 
	 
	

}
