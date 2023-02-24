package FileWriting;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class UsingFileOutputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String location = "usingoutputstream.txt";
		String content ="Welcome to India";
		
		FileOutputStream outputstream = new FileOutputStream(location);
		byte[] writethis = content.getBytes();
		outputstream.write(writethis);
		outputstream.close();

	}

}
