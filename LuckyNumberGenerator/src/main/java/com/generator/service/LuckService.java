package com.generator.service;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.generator.model.LuckyModel;

public interface LuckService {
	
	public LuckyModel getNumber() throws FileNotFoundException, IOException;

}
