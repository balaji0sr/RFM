//$Id$
package com.Service;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonArray {
	public static JSONArray getJsonArray(String filename) {
		String path = "/home/balaji-ztcon37/Desktop/RMF dataset/" + filename + ".json";

		JSONParser jsonParser = new JSONParser();
		JSONArray jarr = null;
		try {
			FileReader reader = new FileReader(path);
			Object obj = jsonParser.parse(reader);
			JSONObject jobj = (JSONObject) obj;

			jarr = (JSONArray) jobj.get(filename);
			System.out.println(jarr.size());
		} catch (Exception e) {
			System.out.println(e);
		}
		return jarr;
	}
}
