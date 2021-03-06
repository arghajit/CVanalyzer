package util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileUtil {
	
	public static void saveToFile(InputStream uploadedInputStream,
	        String uploadedFileLocation) {

	    try {
	        OutputStream out = null;
	        int read = 0;
	        byte[] bytes = new byte[1024];

	        out = new FileOutputStream(new File(uploadedFileLocation));
	        while ((read = uploadedInputStream.read(bytes)) != -1) {
	            out.write(bytes, 0, read);
	        }
	        out.flush();
	        out.close();
	    } catch (IOException e) {

	        e.printStackTrace();
	    }

	}
	
	public static void saveToFile(InputStream uploadedInputStream,
	        File uploadedFileLocation) {

	    try {
	        OutputStream out = null;
	        int read = 0;
	        byte[] bytes = new byte[1024];

	        out = new FileOutputStream(uploadedFileLocation);
	        while ((read = uploadedInputStream.read(bytes)) != -1) {
	            out.write(bytes, 0, read);
	        }
	        out.flush();
	        out.close();
	    } catch (IOException e) {

	        e.printStackTrace();
	    }

	}

}
