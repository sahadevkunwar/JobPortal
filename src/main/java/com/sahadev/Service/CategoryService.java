package com.sahadev.Service;


import java.util.List;

import com.sahadev.entity.Category;

public interface CategoryService {

	public Category createCategory(Category category);
	public Category getCategoryById(Integer catId);
	public void deleteCategoryById(Integer catId);
	public List<Category> getAllCategory();
	public Category updateCategory(Category category);
	//public String fetchCategoryByName();
	//public String fetchCategoryByName();
	//Category fetchCategoryByName();
   public Category fetchCategoryByName(String title);

}
