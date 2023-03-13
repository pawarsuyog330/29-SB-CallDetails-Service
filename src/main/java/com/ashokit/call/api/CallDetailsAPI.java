package com.ashokit.call.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.call.model.CallDetails;
import com.ashokit.call.service.CallDetailsService;

@RestController
@RequestMapping("/api")
public class CallDetailsAPI {
	
	@Autowired
	CallDetailsService service;
	
	@GetMapping("/calldetails/{fromNumber}")
	public ResponseEntity<?> getCallDetails(@PathVariable Long fromNumber)
	{
		List<CallDetails> lst=service.fetchCallDetailsOf(fromNumber);
		if(!lst.isEmpty())
		{
			return new ResponseEntity<List<CallDetails>>(lst, HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<String>("No call Details Found for " + fromNumber , HttpStatus.BAD_REQUEST);
		}
	}
}
