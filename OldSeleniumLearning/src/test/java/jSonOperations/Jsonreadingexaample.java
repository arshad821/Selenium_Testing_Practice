package jSonOperations;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Jsonreadingexaample {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
		
		//to read create object for jsonparser
		JSONParser jsonparser = new JSONParser();
		
		//to read the file
		FileReader filereader = new FileReader("Arshad.json");
		
		//parse the read file using parse() method and store it as object
		Object parsedobject = jsonparser.parse(filereader);
		JSONObject jsonobject = (JSONObject) parsedobject;
		
		String name = (String)jsonobject.get("Name");
		Long age = (Long)jsonobject.get("Age");
		JSONArray array = (JSONArray)jsonobject.get("Special Qualities");
		Iterator iterator = array.iterator();
		System.out.println("Name is "+ name);
		System.out.println("Age is "+ age);
		while(iterator.hasNext()){
			System.out.println("Speacial feautres" + iterator.next());
		}
	}

}
