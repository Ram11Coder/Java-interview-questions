package com.aspire.t24.writeFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class OverrideWriter {
	static String filename;
	static int rowCount;
	static List<String> storeVal = new ArrayList<String>();

	public static void main(String[] args) throws Exception {
		BufferedWriter bw = new BufferedWriter(
				new FileWriter("D:/Downloads/LanguageTranslator/exception/Override/invalidFiles.txt"));
		OverrideWriter jsonWriter = new OverrideWriter();
		File folder = new File("D:/Downloads/LanguageTranslator/LanguageTranslator/Sources/OVERRIDE");
		File[] listOfFiles = folder.listFiles();
		System.out.println("Total files : " + listOfFiles.length);
		for (File file : listOfFiles) {
			if (file.isFile()) {

				String jsonInput = readFileAsString(file.toString());
				filename = file.getName();

				jsonWriter.dataGeneratorr(filename);
				if (storeVal.size() > 0 && rowCount == storeVal.size()) {

					String str = "\"MESSAGE\" : \"";// "MESSAGE" : "
					String[] splitArray = jsonInput.split(str);
					for (int i = 1; i < splitArray.length; i++) {

						int j = splitArray[i].indexOf("}");
						splitArray[i] = str + splitArray[i].substring(0, j + 1) + ",{ " + str
								+ splitArray[i].substring(0, j + 1) + ",{        \"MESSAGE\" " + ": \""
								+ storeVal.get(i - 1) + "\"      }" + splitArray[i].substring(j + 1);

					}
					String val = String.join("", splitArray);
					String newVal = val.replace(", \"MESSAGE\" :", "\"MESSAGE\" :");
					jsonWriter.writeToFile(newVal);
					String finalVal = newVal.replace("’", "'");
					jsonWriter.writeToFile(finalVal);
					System.out.println(filename + " Write sucessfully!!");
					storeVal.clear();
				} else {
					storeVal.clear();
					bw.write(filename.toString() + "\n");
				}
			}
		}
		bw.close();
	}

	public void writeToFile(String splitArray1) throws IOException {
		BufferedWriter outputWriter = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(
						"D:/Downloads/LanguageTranslator/Destination/UnicodeJsonComponents/Override/" + filename),
				"UTF-8"));
		outputWriter.write(splitArray1);
		outputWriter.flush();
		outputWriter.close();

	}

	public static String readFileAsString(String file) throws Exception {
		return new String(Files.readAllBytes(Paths.get(file)), StandardCharsets.UTF_8);
	}

	public void dataGeneratorr(String filename) throws IOException {

		try {
			String path = "D:/Downloads/LanguageTranslator/LanguageTranslator/TranslatedFiles/Override/Override/"
					+ filename + ".xlsx";
			File f = new File(path);
			if (f.exists()) {
				FileInputStream file = new FileInputStream(f);

				XSSFWorkbook workbook = new XSSFWorkbook(file);
				XSSFSheet sheet = workbook.getSheetAt(0);
				Iterator<Row> rowIterator = sheet.iterator();

				// System.out.println("Last row num : " + sheet.getLastRowNum());
				rowCount = 0;
				while (rowIterator.hasNext()) {
					++rowCount;
					Row row = rowIterator.next();
					if (row.getCell(1) != null && !row.getCell(1).toString().isEmpty()) {
						storeVal.add(row.getCell(1).toString());
					}
				}
				file.close();
			} else {
				System.out.println(path + " is not availble !! ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
