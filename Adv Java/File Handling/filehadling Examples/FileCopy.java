package filehadling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) {
		File filein = new File("D:\\daily coding track\\java_interview_questions.pdf");
		File fileout = new File("D:\\daily coding track\\java_interview_questions_copy.pdf");

		FileInputStream fin = null;
		FileOutputStream fout = null;

		try {
			fin = new FileInputStream(filein);
			fout = new FileOutputStream(fileout);
			System.out.println(fin.available());
			int i = 0;
			while ((i = fin.read()) != -1) {
				fout.write(i);
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			if (fin != null)
				try {
					fin.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if (fout != null)
				try {
					fout.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	}
}
