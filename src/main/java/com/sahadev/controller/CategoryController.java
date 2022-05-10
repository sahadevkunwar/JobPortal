package com.sahadev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sahadev.Service.CategoryService;
import com.sahadev.entity.Category;
import com.sahadev.entity.Job;
import com.sahadev.entity.User;

@Controller
@RequestMapping("/admin/category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@GetMapping("/add")
	public String addCategory(Model model) {
		model.addAttribute("categoryList", categoryService.getAllCategory());
		return "createCategory";
	}
	 @PostMapping("/add") 
	  public String addCategory(@ModelAttribute Category category) 
	  {
		  categoryService.createCategory(category);
		  return "redirect:/admin/category/displayCategory"; 
		  }
		

	@GetMapping("/delete/{catId}")
	public String deleteCategoryById(@PathVariable("catId") Integer catId) {
		categoryService.deleteCategoryById(catId);
		return "redirect:/admin/category/displayCategory";

	}

	@GetMapping("/edit/{catId}")
	public String updateCategory(@PathVariable("catId") Integer catId,Model model) {
	 Category category=categoryService.getCategoryById(catId);
	 model.addAttribute("category", category);
	 return  "updateCategory";
	}
	@PostMapping("/update")
	public String updateCategory(@ModelAttribute Category category) {
		categoryService.updateCategory(category);
		return "redirect:/admin/category/displayCategory";
	}

	@GetMapping("/name/{title}")
	public Category fetchCategoryByName(@PathVariable("title") String title) {
		return categoryService.fetchCategoryByName(title);
	}

	@GetMapping("/displayCategory")
	public String displayCategory(Model model) {
	model.addAttribute("categoryList", categoryService.getAllCategory());
		return "displayCategory";
	}
	

}
