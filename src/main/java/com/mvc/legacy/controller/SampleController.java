package com.mvc.legacy.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mvc.legacy.entity.Actor;
import com.mvc.legacy.service.SampleService;

@RestController
@RequestMapping(value = { "sample/" })
public class SampleController {
	
	@Autowired
	private SampleService sampleService;
	
	@RequestMapping(value = "/actors", method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ArrayList<Actor> findAllActors(){
		
		return sampleService.findAllActors();
	}

}
