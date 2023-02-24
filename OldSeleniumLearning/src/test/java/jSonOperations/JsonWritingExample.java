package jSonOperations;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class JsonWritingExample {

	public static void main(String[] args) throws IOException {
		
		JSONObject jsonobject = new JSONObject();
		jsonobject.put("Name", "Arshad");
		jsonobject.put("Age", 1);
		
		JSONArray array = new JSONArray();
		array.add("Magical Smile");
		array.add("Magical Eyes");
		
		jsonobject.put("Special Qualities", array);
		
		FileWriter filewriter = new FileWriter("Arshad.json");
		filewriter.write(jsonobject.toString());
		filewriter.close();
		System.out.println(jsonobject);
	}

}
