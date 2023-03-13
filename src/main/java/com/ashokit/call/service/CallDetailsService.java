package com.ashokit.call.service;

import java.util.List;

import com.ashokit.call.model.CallDetails;

public interface CallDetailsService {
	
	List<CallDetails> fetchCallDetailsOf(Long fromNumber);

}
