package com.hcl.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.dao.FeedbackRepository;
import com.hcl.model.Feedback;

@Service
@Transactional
public class FeedbackServiceImpl implements FeedbackService {
    @Autowired 
    FeedbackRepository repo;
    
    public void save(Feedback user) {
        repo.save(user);
    }
    
    public List<Feedback> listAll() {
        return (List<Feedback>) repo.findAll();
    }
    
    public Feedback get(Long id) {
        return repo.findById(id).get();
    }
    
    public void delete(Long id) {
        repo.deleteById(id);
    }

	

	
    
}