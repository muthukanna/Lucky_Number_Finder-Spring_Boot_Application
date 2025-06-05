package com.generator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generator.model.Quotes;

@Repository
public interface LuckyNumberRepo extends JpaRepository<Quotes, Long> {
	
	// AN INTERFACE TO CONNECT WITH DATABASE

}
