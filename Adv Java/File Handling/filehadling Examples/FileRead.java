package filehadling;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FileRead {
	public static void main(String[] args) {
//Different ways to read file

		openFileUsingDesktop();
		readFileUsingInputstream();
		readFileUsingBufferReader();
		readFileUsingFileReader();
		readUsingScanner();
		fileReadUsingNIO();
	}

	private static void fileReadUsingNIO() {
		String path = "D:\\daily coding track\\Top 10 Algorithms.txt";

		try {
			List<String> list = Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8);
			Iterator<String> it = list.iterator();

			while (it.hasNext()) {
				System.out.println(it.next());

			}
		} catch (Exception e) {

		}
	}

	private static void readUsingScanner() {
		String path = "D:\\daily coding track\\Top 10 Algorithms.txt";

		Scanner sc = null;
		try {
			File file = new File(path);
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}

	}

	private static void readFileUsingFileReader() {
		String path = "D:\\daily coding track\\Top 10 Algorithms.txt";
		File file = new File(path);
		FileReader fr = null;
		try {
			fr = new FileReader(file);
			System.out.println("File content is :");

			int c = 0;
			while ((c = fr.read()) != -1) {
				System.out.print((char) c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fr != null)
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	}

	private static void readFileUsingBufferReader() {
		String path = "D:\\daily coding track\\Top 10 Algorithms.txt";
		File file = new File(path);
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
			System.out.println("File content is :");

			int c = 0;
			while ((c = br.read()) != -1) {
				System.out.print((char) c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (br != null)
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

	private static void readFileUsingInputstream() {
		String path = "D:\\daily coding track\\Top 10 Algorithms.txt";
		File file = new File(path);
		FileInputStream fip = null;
		try {
			fip = new FileInputStream(file);
			System.out.println("File content is :");

			int c = 0;
			while ((c = fip.read()) != -1) {
				System.out.print((char) c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fip != null)
				try {
					fip.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

	private static void openFileUsingDesktop() {
		String path = "D:\\daily coding track\\Top 10 Algorithms.txt";
		File file = new File(path);
		try {
			if (!Desktop.isDesktopSupported()) {
				System.out.println("Desktop not supported");
				return;
			}
			Desktop desktop = Desktop.getDesktop();
			if (file.exists()) {
				desktop.open(file);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
