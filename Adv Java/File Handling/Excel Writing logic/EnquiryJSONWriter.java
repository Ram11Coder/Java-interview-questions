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

public class EnquiryJSONWriter {
	static String filename;
	static int rowCount;
	static List<String> storeVal = new ArrayList<String>();

	public static void main(String[] args) throws Exception {
		BufferedWriter bw = new BufferedWriter(
				new FileWriter("D:/Downloads/LanguageTranslator/exception/Enquiry/invalidFiles.txt"));
		EnquiryJSONWriter jsonWriter = new EnquiryJSONWriter();
		File folder = new File("D:/Downloads/LanguageTranslator/LanguageTranslator/Sources/Menu/ENQUIRY");
		File[] listOfFiles = folder.listFiles();
		System.out.println("Total files : " + listOfFiles.length);
		for (File file : listOfFiles) {
			if (file.isFile()) {

				String jsonInput = readFileAsString(file.toString());
				filename = file.getName();

				jsonWriter.dataGeneratorr(filename);
				// Map<String, List<String>> map = new HashMap<String, List<String>>();

				if (storeVal.size() > 0 && rowCount == storeVal.size()) {
					List<String> seperatorArray = new ArrayList<String>();
					String seperator = storeVal.get(0);
					for (int i = 1; i < storeVal.size(); i++) {
						if (!storeVal.get(i).matches(("^[\\/*]{1}[a-zA-Z .]*[\\/*]{1}$"))) {
							seperatorArray.add(storeVal.get(i));
						} else {
							jsonInput = updateJson(seperator, seperatorArray, jsonInput);
							seperatorArray.clear();
							seperator = storeVal.get(i);
						}
					}
					jsonInput = updateJson(seperator, seperatorArray, jsonInput);
					/*
					 * String pat = "^[\\/*]{1}[a-zA-Z .]*[\\/*]{1}$"; for (String word : storeVal)
					 * { if (word.matches(pat)) { seperatorArray.add(word); } }
					 */
					String finalVal = jsonInput.replace("’", "'");
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

	private static String updateJson(String value, List<String> seperatorArray, String jsonInput) {

		if (seperatorArray.size() == 0) {
			return jsonInput;
		}

		String str = "";// "TEXT" : "
		if (value.equals("*Selezione etichette*")) {
			str = "\"SEL.LABEL\" : \"";// "SEL.LABEL" : "
		} else if (value.equals("*Etichette*")) {
			str = "\"FIELD.LBL\" : \"";// "FIELD.LBL" : "
		} else if (value.equals("*Descrizione*")) {
			str = "\"DESCRIPT\" : \"";// "DESCRIPT" : "
		} else if (value.equals("*Descrizione.breve*")) {
			str = "\"SHORT.DESC\" : \"";// "SHORT.DESC" : "
		}
		String modifiedString = str.substring(0, str.indexOf(":") + 1);
		String[] splitArray = jsonInput.split(str);
		for (int i = 1; i < splitArray.length; i++) {

			int j = splitArray[i].indexOf("}");
			splitArray[i] = str + splitArray[i].substring(0, j + 1) + ",{ " + str + splitArray[i].substring(0, j + 1)
					+ ",{ " + str + seperatorArray.get(i - 1) + "\"      }" + splitArray[i].substring(j + 1);

		}
		String val = String.join("", splitArray);
		String newVal = val.replace(", " + modifiedString, modifiedString);
		return newVal;
	}

	public void writeToFile(String splitArray1) throws IOException {
		BufferedWriter outputWriter = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(
						"D:/Downloads/LanguageTranslator/Destination/UnicodeJsonComponents/Enquiry/" + filename),
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
			String path = "D:/Downloads/LanguageTranslator/LanguageTranslator/TranslatedFiles/Menu_Set2/Menu_Set2/"
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

				/*
				 * for (int i = 0; i < storeVal.size(); i++) { if
				 * (storeVal.get(i).contains("\"")) { String pat = "\\" + "\""; String newValue
				 * = storeVal.get(i).replace("\"", pat); storeVal.set(i, newValue); } }
				 */

				file.close();
			} else {
				System.out.println(path + " is not availble !! ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
