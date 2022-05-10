package com.sahadev.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sahadev.Repository.CategoryRepository;
import com.sahadev.Service.CategoryService;
import com.sahadev.entity.Category;

@Transactional
@Service
public class CategoryImpl implements CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepo;

	
	  @Override
	  public Category createCategory(Category category) {
		  return categoryRepo.save(category); }
	 

	@Override
	public Category getCategoryById(Integer catId) {
		return categoryRepo.getById(catId);
	}

	
	  @Override public void deleteCategoryById(Integer catId) {
	  if(categoryRepo.findById(catId).isPresent()) {
	  categoryRepo.deleteById(catId); } }
	 

	@Override
	public List<Category> getAllCategory() {
		return categoryRepo.findAll();
	}


	@Override
	public Category updateCategory(Category category) {
       
		return categoryRepo.save(category);
		
	}


	@Override
	public Category fetchCategoryByName(String title) {
		return categoryRepo.findByTitle(title);
	}


	





	/*
	 * @Override public Category saveCategory(Category category) { return
	 * categoryRepo.save(category); }
	 */


}
