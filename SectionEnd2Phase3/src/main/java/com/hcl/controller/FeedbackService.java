package com.hcl.controller;
import java.util.List;

import com.hcl.model.Feedback;

public interface FeedbackService {

	public void save(Feedback user);

	public List<Feedback> listAll();
	
	public void delete(Long id);

	public Feedback get(Long id);

}