package com.slokam.insurence.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.insurence.entity.GhBasicDetails;
import com.slokam.insurence.service.GhBasicDetailsService;

@RestController
@RequestMapping("GhBasicDetails")
public class GhBasicDetailsController {
	
	@Autowired
	private GhBasicDetailsService service;
	
	@RequestMapping(value="/all",method = RequestMethod.GET)
	public ResponseEntity<List<GhBasicDetails>> getall()
	{
		List<GhBasicDetails> data = service.getall();
		ResponseEntity<List<GhBasicDetails>> responceentity = new ResponseEntity<>(data,HttpStatus.OK);
		
		
		return responceentity;
		
	}

}
