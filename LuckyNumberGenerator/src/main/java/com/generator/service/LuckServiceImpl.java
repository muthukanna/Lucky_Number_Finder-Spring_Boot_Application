package com.generator.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import com.generator.model.LuckyModel;
import com.generator.model.Quotes;
import com.generator.repository.LuckyNumberRepo;

@Service
public class LuckServiceImpl implements LuckService {

	// using constructor injection

	private static LuckyNumberRepo luckyNumberRepo;

	LuckServiceImpl(LuckyNumberRepo luckyNumberRepo) {
		LuckServiceImpl.luckyNumberRepo = luckyNumberRepo;
	}

	public static boolean insertFiles() throws FileNotFoundException, IOException {

		String excelFilePath = "src/main/resources/Famous_Writing_Quotes.xlsx"; 

		try (FileInputStream fileInputStream = new FileInputStream(new File(excelFilePath));
				Workbook workbook = new XSSFWorkbook(fileInputStream)) {

			// Get first sheet to retrieve the values
			Sheet sheet = workbook.getSheetAt(0);

			for (Row row : sheet) {

				// First column: Quote
				Cell quoteCell = row.getCell(0);
				// Second column: Author
				Cell authorCell = row.getCell(1);

				if (quoteCell != null && authorCell != null) {
					String quoteText = quoteCell.getStringCellValue().trim();
					String authorName = authorCell.getStringCellValue().trim();

					if (!quoteText.isEmpty()) {
						Quotes quote = new Quotes();
						quote.setQuotes(quoteText);
						quote.setAuthor(authorName.isEmpty() ? "Unknown" : authorName);
						luckyNumberRepo.save(quote);
					}
				}
			}
		}

		return true;

	}

	@Override
	public LuckyModel getNumber() throws FileNotFoundException, IOException {

		LuckServiceImpl.insertFiles();

		List<Quotes> list = luckyNumberRepo.findAll();
		Random rd = new Random();
		Quotes quotes = list.get(rd.nextInt(100));
		LuckyModel lkmd = new LuckyModel();
		lkmd.setNumber(rd.nextInt(10));
		lkmd.setQuotes(quotes);

		return lkmd;

	}

}
