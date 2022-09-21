package com.mvc.legacy.mapper;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mvc.legacy.entity.Actor;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Slf4j
public class SampleMapperTests {
	
	@Autowired
	private SampleMapper sampleMapper;

	@Test
	public void findAllActorsTest() {
		
		for(Actor a : sampleMapper.findAllActors()) {
			
			log.info(a.toString());
		}
		
//		log.info("bye");
	}

}
