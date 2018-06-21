package com.scp.missingnumber;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JSONPrintDemo {
	public static void main(String args[]) throws JsonGenerationException, JsonMappingException, IOException {

		int[] recentScores = { 77, 72, 23, 57, 54, 36, 74, 17 };
		Player cricketer = new Player("Virat", "cricket", 25, 121, recentScores);

		ObjectMapper mapper = new ObjectMapper();

		System.out.println("Default JSON String:" + mapper.writeValueAsString(cricketer));
		System.out.println("formatted JSON String \n"
		+ mapper.defaultPrettyPrintingWriter().writeValueAsString(cricketer));

	}

}
