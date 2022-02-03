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

public class TABJSONWriter {
	static String filename;
	static int rowCount;
	static List<String> storeVal = new ArrayList<String>();

	public static void main(String[] args) throws Exception {
		BufferedWriter bw = new BufferedWriter(
				new FileWriter("D:/Downloads/LanguageTranslator/exception/TAB/invalidFiles.txt"));
		TABJSONWriter jsonWriter = new TABJSONWriter();
		File folder = new File("D:/Downloads/LanguageTranslator/LanguageTranslator/Sources/Menu/TAB");
		File[] listOfFiles = folder.listFiles();
		System.out.println("Total files : " + listOfFiles.length);
		for (File file : listOfFiles) {
			if (file.isFile()) {

				String jsonInput = readFileAsString(file.toString());
				filename = file.getName();
				jsonWriter.dataGeneratorr(filename);
				if (storeVal.size() > 0 && rowCount == storeVal.size()) {
					String pat = "\"TITLE\" : \"";// "TITLE" : "
					String[] titleSplit = jsonInput.split(pat);
					int k = titleSplit[1].indexOf("}") + 1;
					String indexOf = titleSplit[1].substring(0, k);
					jsonInput = titleSplit[0] + pat + indexOf + ",{" + pat + indexOf + ",{" + pat + storeVal.get(0)
							+ "\"	}" + titleSplit[1].substring(k);

					String str = "\"TAB.TITLE\" : \"";// "TAB.TITLE" : "
					String[] splitArray = jsonInput.split(str);
					for (int i = 1; i < splitArray.length; i++) {
						int j = splitArray[i].indexOf("}");
						splitArray[i] = str + splitArray[i].substring(0, j + 1) + ",{" + str
								+ splitArray[i].substring(0, j + 1) + ",{        \"TAB.TITLE\" " + ": \""
								+ storeVal.get(i) + "\"      }" + splitArray[i].substring(j + 1);

					}
					String val = String.join("", splitArray);
					String newVal = val.replace(", \"TAB.TITLE\" :", "\"TAB.TITLE\" :");
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
		BufferedWriter outputWriter = new BufferedWriter(
				new OutputStreamWriter(
						new FileOutputStream(
								"D:/Downloads/LanguageTranslator/Destination/UnicodeJsonComponents/TAB/" + filename),
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
			String path = "D:/Downloads/LanguageTranslator/LanguageTranslator/TranslatedFiles/Menu_Set1 final/TAB/resources/"
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
					// System.out.println(row.getCell(0) + " : " + row.getCell(1));
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
