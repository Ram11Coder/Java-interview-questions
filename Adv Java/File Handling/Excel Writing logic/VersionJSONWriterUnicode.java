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

public class VersionJSONWriterUnicode {
	static String filename;
	static int rowCount;
	static List<String> storeVal = new ArrayList<String>();

	public static void main(String[] args) throws Exception {
		BufferedWriter bw = new BufferedWriter(
				new FileWriter("D:/Downloads/LanguageTranslator/exception/Customer/invalidFiles.txt"));
		VersionJSONWriterUnicode jsonWriter = new VersionJSONWriterUnicode();
		File folder = new File(
				"D:/Downloads/LanguageTranslator/LanguageTranslator/Sources/CustomerVersionJsonSource/resources");
		// FileInputStream fis = new FileInputStream(file);
		// InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
		// BufferedReader reader = new BufferedReader(isr);
		File[] listOfFiles = folder.listFiles();
		System.out.println("Total files : " + listOfFiles.length);
		for (File file : listOfFiles) {
			if (file.isFile()) {

				String jsonInput = readFileAsString(file.toString());
				filename = file.getName();

				jsonWriter.dataGeneratorr(filename);
				if (storeVal.size() > 0 && rowCount == storeVal.size()) {
					String pat = "\"LANGUAGE.CODE\" : \"1\"";

					String toReplace = "";
					for (int i = 1; i <= 3; i++)
						toReplace += "\"LANGUAGE.CODE\" : \"" + i + "\"" + ((i < 3) ? "},\n {" : "");

					jsonInput = jsonInput.replace(pat, toReplace);
					String str = "\"TEXT\" : \"";// "TEXT" : "
					String[] splitArray = jsonInput.split(str);
					for (int i = 1; i < splitArray.length; i++) {

						int j = splitArray[i].indexOf("}");
						splitArray[i] = str + splitArray[i].substring(0, j + 1) + ",{ " + str
								+ splitArray[i].substring(0, j + 1) + ",{        \"TEXT\" " + ": \""
								+ storeVal.get(i - 1) + "\"      }" + splitArray[i].substring(j + 1);

					}
					String val = String.join("", splitArray);
					String newVal = val.replace(", \"TEXT\" :", "\"TEXT\" :");
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
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(
						"D:/Downloads/LanguageTranslator/Destination/UnicodeJsonComponents/Customer/" + filename),
				"UTF-8"));
		out.write(splitArray1);
		out.flush();
		out.close();

	}

	public static String readFileAsString(String file) throws Exception {
		return new String(Files.readAllBytes(Paths.get(file)), StandardCharsets.UTF_8);
	}

	public void dataGeneratorr(String filename) throws IOException {

		try {
			String path = "D:/Downloads/LanguageTranslator/LanguageTranslator/TranslatedFiles/Customer/resources/"
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
