package com.ashokit.call.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="CALL_DETAILS")
public class CallDetailsEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer callId;
	
	private Integer callDuration;
	
	private Long fromNumber;
	
	private Long toNumber;
	
	private LocalDateTime calledOn;
}
