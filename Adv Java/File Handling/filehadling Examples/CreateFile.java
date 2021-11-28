package filehadling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CreateFile {
	/**
	 * 1.Using File class
	 * 
	 * 2.
	 * 
	 */
	public static void main(String[] args) {
		File f = new File("D:\\daily coding track\\sample.txt");
		boolean status;
		try {
			status = f.createNewFile();
			if (status)
				System.out.println("File is created ");
			else
				System.out.println("File is already there..");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 2.Fileoutput stream
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the file with location path: ");
		String str = sc.nextLine();
		try {
			FileOutputStream fileOut = new FileOutputStream(str, true);
			System.out.println("Enter the file content :");
			String content = sc.nextLine();
			byte b[] = content.getBytes();

			fileOut.write(b);
			fileOut.close();
			System.out.println("File saved");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 3. Javanio package

		Path pathLocation = Paths.get("D:\\daily coding track\\sample1.txt");
		try {
			Path newpath = Files.createFile(pathLocation);
			System.out.println("File created at " + newpath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
