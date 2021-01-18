package com.hcl.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.model.Feedback;

@Controller
public class FeedbackController {
	@Autowired
	private FeedbackServiceImpl repo;
	
	@GetMapping("/giveFeedback")
	public ModelAndView giveFeedback() {
		return new ModelAndView("giveFeedback");
	}
	
	@PostMapping("/giveFeedback")
	public String submitFeedback(@RequestParam("name") String name, @RequestParam("message") String message) {
		Feedback f = new Feedback();
		f.setMessage(message);
		f.setName(name);
		repo.save(f);
		return "success";
	}
}
