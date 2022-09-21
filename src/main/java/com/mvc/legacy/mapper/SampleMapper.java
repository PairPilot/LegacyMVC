package com.mvc.legacy.mapper;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.mvc.legacy.entity.Actor;

public interface SampleMapper {
	
	@Select("SELECT * FROM ACTOR")
	public ArrayList<Actor> findAllActors();
}
