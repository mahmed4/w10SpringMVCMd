package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.ClassInstructors;
import dmacc.repository.ClassInstructorsRepository;

@Controller
public class WebController {
	@Autowired
	ClassInstructorsRepository repo;
	
	@GetMapping({ "/", "viewAll" })
	public String viewAllClassInstructors(Model model) {
	if(repo.findAll().isEmpty()) {
	return addNewClassInstructors(model);
	}
	model.addAttribute("classInstructors", repo.findAll());
	return "results";
	}
	
	@GetMapping("/inputClassInstructors")
	public String addNewClassInstructors(Model model) {
		ClassInstructors c = new ClassInstructors();
	model.addAttribute("newClassInstructors", c);
	return "input";
	}
	
	@PostMapping("/inputClassInstructors")
	public String addNewClassInstructors(@ModelAttribute ClassInstructors c, Model model) {
	repo.save(c);
	return viewAllClassInstructors(model);
	}
	
	@GetMapping("/edit/{id}")
	public String showUpdateClassInstructors(@PathVariable("id") long id, Model model) {
		ClassInstructors c = repo.findById(id).orElse(null);
	model.addAttribute("newClassInstructors", c);
	return "input";
	}

	@PostMapping("/update/{id}")
	public String reviseClassInstructors(ClassInstructors c, Model model) {
	repo.save(c);
	return viewAllClassInstructors(model);
	}
	
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") long id, Model model) {
		ClassInstructors c = repo.findById(id).orElse(null);
	repo.delete(c);
	return viewAllClassInstructors(model);
	
	}

}
