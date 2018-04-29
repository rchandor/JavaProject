package com.example.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.IJsonService;

@RestController
@RequestMapping(value="json")
public class JsonController {

	@Autowired
	IJsonService jsonService;
	
	@RequestMapping(value = "getJsonResponse")
	public void getJsonResponse() {
		try {
			jsonService.getJsonResponse();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

	@RequestMapping(value = "getJsonResponseFromUrl")
	public void getJsonResponseFromUrl() {
		try {
			jsonService.getJsonResponseFromUrl();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
