package com.ashokit.call.model;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class CallDetails {

	private Integer callId;
	
	private Integer callDuration;
	
	private Long fromNumber;
	
	private Long toNumber;
	
	private LocalDateTime calledOn;
}
