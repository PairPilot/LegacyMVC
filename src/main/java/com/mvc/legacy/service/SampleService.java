package com.mvc.legacy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.legacy.entity.Actor;
import com.mvc.legacy.mapper.SampleMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class SampleService {
	
	@Autowired
	private SampleMapper sampleMapper;
	
	public ArrayList<Actor> findAllActors(){ 
		
		ArrayList<Actor> actors = sampleMapper.findAllActors();
		
		for(Actor a : actors) {
			log.info(a.toString());
		}
		
		
		return actors;
	}

}
