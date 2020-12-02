package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

import com.google.gson.Gson;

public class Util {
	public static Map<String, String> getXPathsForPage() throws IOException {
		File file = new File("C:\\automation-sample\\src\\main\\java\\resources\\locator.json");
		BufferedReader br = new BufferedReader(new FileReader(file));

		String xpathString = "";
		String line = "";

		while ((line = br.readLine()) != null) {
			xpathString += line;
		}

		Gson gson = new Gson().newBuilder().create();
		return gson.fromJson(xpathString, Map.class);
	}
}
