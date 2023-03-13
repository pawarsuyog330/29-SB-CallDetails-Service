package com.ashokit.call.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashokit.call.entity.CallDetailsEntity;

@Repository
public interface CallDetailsEntityRepository extends JpaRepository<CallDetailsEntity, Integer> {

	List<CallDetailsEntity> findByFromNumber(Long fromNumber);
}
