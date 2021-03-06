package com.cy.pj.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.cy.pj.entity.Contents;

@Mapper
public interface ContentsDao {
	
	
	Contents findContentById(Integer cid);

	List<Contents> findContents();	 
	
	Contents findPreContent(Integer cid);
	
	Contents findNextContent(Integer cid);
	
	@Select("select contents_id from usercontents where user_id=#{userId}")
	List<Integer> findContentsByuserId(Integer userId);

	List<Contents> findCollects(List<Integer> contentIds);
	
}
