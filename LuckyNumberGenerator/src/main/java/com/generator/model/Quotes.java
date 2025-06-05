package com.generator.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Quotes {

	// DOT CLASS FOR TRANFER OPEATION TO H2 DATABASE
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Qid;
	private String Quotes;
	private String Author;

}
