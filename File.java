package prapul;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class File {

	public static void main(String[] args) throws IOException {
		copyFileUsingStream("C:/Users/prapul/Desktop/prapul/prapul/src/prapul/File.java", "C:/Users/prapul/Desktop/prapul/prapul/src/prapul/file.txt");
	}
	private static void copyFileUsingStream(String in, String out) throws IOException {
	    InputStream is = null;
	    OutputStream os = null;
	    try {
	        is = new FileInputStream(in);
	        os = new FileOutputStream(out);
	        byte[] buffer = new byte[1024];
	        int length;
	        while ((length = is.read(buffer)) > 0) {
	            os.write(buffer, 0, length);
	        }
	    } finally {
	        is.close();
	        os.close();
	    }
	}
}
