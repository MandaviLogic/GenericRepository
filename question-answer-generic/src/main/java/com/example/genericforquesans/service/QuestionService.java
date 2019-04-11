package com.example.genericforquesans.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.genericforquesans.entities.Question1;
import com.example.genericforquesans.repository.QuestionRepository1;

@Service
public class QuestionService {

	@Autowired
	private QuestionRepository1 questionRepository;
	
	public List<Question1> findAll(){
		return questionRepository.findAll();
	}
	
	public Question1 save(Question1 question) {
		return questionRepository.save(question);
	}
	
	public Optional<Question1> findById(Long questionId){
		return questionRepository.findById(questionId);
	}
	
	public void delete(Question1 question) {
		questionRepository.delete(question);
	}

	public boolean existsById(Long questionId) {
		return questionRepository.existsById(questionId);
	}
}
