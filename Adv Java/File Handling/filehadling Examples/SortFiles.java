package filehadling;

import java.io.File;
import java.util.Arrays;

public class SortFiles {
	public static void main(String[] args) {

		File file = new File("D:\\daily coding track");
		File[] fileDir = file.listFiles();
		Arrays.sort(fileDir);
		
		for (File f : fileDir) {
			if (f.isFile())
				System.out.println("File -> " + f.getName() + " : " + f.getAbsolutePath());
			else if (f.isDirectory())
				System.out.println("Dir -> " + f.getName() + " : " + f.getAbsolutePath());
			else
				System.out.println("Unknown -> " + f.getName() + " : " + f.getAbsolutePath());

		}

	}
}
