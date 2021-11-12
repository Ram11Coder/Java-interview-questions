package com.NaveenAutomation;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

/**
 * Convert .jpg --> .png/.bmp/.gif
 *
 */
public class Qsn38 {
	public static void main(String[] args) {

		try {
			// URL url = new
			// URL("https://m.media-amazon.com/images/I/61EnZPOqvRS._SX569_.jpg");

			File file = new File(
					"C:\\Users\\thulasi.janarthanan\\EclipseJ2ee_Workspace\\JavaNotes\\Images\\monitor.jpg");
			BufferedImage monitor = ImageIO.read(file);

			ImageIO.write(monitor, "jpg",
					new File("C:\\Users\\thulasi.janarthanan\\EclipseJ2ee_Workspace\\JavaNotes\\Images\\monitor.jpg"));

			ImageIO.write(monitor, "gif",
					new File("C:\\Users\\thulasi.janarthanan\\EclipseJ2ee_Workspace\\JavaNotes\\Images\\monitor.gif"));
			ImageIO.write(monitor, "png",
					new File("C:\\Users\\thulasi.janarthanan\\EclipseJ2ee_Workspace\\JavaNotes\\Images\\monitor.png"));
			ImageIO.write(monitor, "bmp",
					new File("C:\\Users\\thulasi.janarthanan\\EclipseJ2ee_Workspace\\JavaNotes\\Images\\monitor.bmp"));
			System.out.println("...Done...");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
