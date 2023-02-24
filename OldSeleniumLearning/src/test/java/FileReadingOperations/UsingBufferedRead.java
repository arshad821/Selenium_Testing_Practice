package FileReadingOperations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class UsingBufferedRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String location = "usingbufferwriter.txt";
		//String content ="Summer season";

		FileReader filereader = new FileReader(location);

		BufferedReader reader = new BufferedReader(filereader);

		String currentline = reader.readLine();
		System.out.println(currentline);

		//if more line available
		String currentline1;
		while((currentline1=reader.readLine())!=null){
			System.out.println(currentline1);
		}

	}

}
