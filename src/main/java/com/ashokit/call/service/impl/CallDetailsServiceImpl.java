package com.ashokit.call.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.call.entity.CallDetailsEntity;
import com.ashokit.call.model.CallDetails;
import com.ashokit.call.repository.CallDetailsEntityRepository;
import com.ashokit.call.service.CallDetailsService;

@Service
public class CallDetailsServiceImpl implements CallDetailsService {

	@Autowired
	CallDetailsEntityRepository callRepo;
	
	@Override
	public List<CallDetails> fetchCallDetailsOf(Long fromNumber) {
		 List<CallDetailsEntity> callsEntity=callRepo.findByFromNumber(fromNumber);
		 
		 List<CallDetails> lstCalls=new ArrayList<>();
		 callsEntity.forEach(entity->
		 {
			 CallDetails dto=new CallDetails();
			 BeanUtils.copyProperties(entity, dto);
			 lstCalls.add(dto);
		 });
		return lstCalls;
	}

}
