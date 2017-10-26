package com.slokam.insurence.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.insurence.dao.GhBasicDetailsDao;
import com.slokam.insurence.entity.GhBasicDetails;

@Service
public class GhBasicDetailsService  implements GhBasicDetailsiService{

	@Autowired
	private GhBasicDetailsDao dao;
	
	@Override
	public List<GhBasicDetails> getall() {
		
		return  dao.findAll();
	}

}
