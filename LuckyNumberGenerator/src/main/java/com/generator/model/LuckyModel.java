package com.generator.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class LuckyModel {
	
	// AND POJO CLASS TO TRANFER DATA ACROSS THE CONTROLLER

	private long luckId;
	private long number;
	private Quotes quotes;

}
