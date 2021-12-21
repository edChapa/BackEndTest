package Task1;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class Async {
	public static void downloadFromURL(String url, String fileName) {
		new Thread(new Runnable() {
			public void run() {
				try (BufferedInputStream in = new BufferedInputStream(new URL(url).openStream());
						FileOutputStream fileOutputStream = new FileOutputStream(fileName)) {
							byte dataBuffer[] = new byte[1024];
						    int bytesRead;
						    while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
						        fileOutputStream.write(dataBuffer, 0, bytesRead);
						    }
						    System.out.println("Finished downloading Test.png");
				} catch (IOException e) {
					System.out.println("Failed to download the file");
				}
			}
		}
		).start();
	}
}
