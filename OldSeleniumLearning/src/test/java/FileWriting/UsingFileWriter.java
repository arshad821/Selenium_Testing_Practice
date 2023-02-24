package FileWriting;

import java.io.FileWriter;
import java.io.IOException;

public class UsingFileWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//1.file location 2.content
		
		String location = "usingfilewriter.txt";
		String content ="Automation is simple";
		
		FileWriter filewriter = new FileWriter(location);
		
		filewriter.write(content);
		filewriter.close();

	}

}
