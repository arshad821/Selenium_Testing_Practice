package FileWriting;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UsingBufferedwrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String location = "usingbufferwriter.txt";
		String content ="Summer season";
		
		FileWriter filewriter = new FileWriter(location);
		
		BufferedWriter bufferedwriter = new BufferedWriter(filewriter);
		
		bufferedwriter.write(content);
		bufferedwriter.close();

	}

}
