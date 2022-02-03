package com.aspire.t24.writeFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * TODO: Document me!
 *
 * @author raja.subramani
 *
 */

public class VersionJSONWriter {
	static String filename;
	static int rowCount;
	static List<String> storeVal = new ArrayList<String>();

	public static void main(String[] args) throws Exception {
		BufferedWriter bw = new BufferedWriter(
				new FileWriter("D:/Downloads/LanguageTranslator/exception/Customer_new/invalidFiles.txt"));
		VersionJSONWriter jsonWriter = new VersionJSONWriter();
		File folder = new File("D:/Downloads/LanguageTranslator/LanguageTranslator/Sources/VERSION");
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
					jsonWriter.writeToFile(newVal);
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
		BufferedWriter outputWriter = null;
		outputWriter = new BufferedWriter(
				new FileWriter("D:/Downloads/LanguageTranslator/Destination/Collateral/" + filename));

		outputWriter.write(splitArray1);
		outputWriter.flush();
		outputWriter.close();

	}

	public static String readFileAsString(String file) throws Exception {
		return new String(Files.readAllBytes(Paths.get(file)));
	}

	public void dataGeneratorr(String filename) throws IOException {

		try {
			String path = "D:/Downloads/LanguageTranslator/LanguageTranslator/TranslatedFiles/Collateral/resources/"
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
					if (row.getCell(1) != null) {
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
