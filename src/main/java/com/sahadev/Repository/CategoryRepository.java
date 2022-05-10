package com.sahadev.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sahadev.entity.Category;
import com.sahadev.entity.Job;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

  public Category findByTitle(String title);



}
