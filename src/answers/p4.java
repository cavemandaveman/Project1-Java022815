package answers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p4 {

	public static void main(String[] args) throws IOException {

		List<String> names = new ArrayList<String>();
		BufferedReader reader = new BufferedReader(new FileReader("./src/resources/names.txt"));
		FileWriter writer = new FileWriter("./src/answers/p4aNames.txt");
		String[] str = null;
		
		
		//Add info from file to names
		String line = reader.readLine();
		names.add(line);
		
		reader.close();
		
		
		//Get rid of commas and quotes
		for(String s : names)
			str = s.toString().split(",");
		for(int i = 0; i <str.length; i++)
			str[i] = str[i].replaceAll("\"","");
		
		Arrays.sort(str);
		
		
		//Write values to new txt file
		for(String s : str)
			writer.write(s + "\n");
		
		writer.close();
		
		
		//Find totals of values of names, store in an array, and write to file
		FileWriter writer2 = new FileWriter("./src/answers/p4bNames.txt");
		long[] nameScores = new long[str.length];
		for(int i = 0; i < str.length; i++) {
			for(int j = 0; j < str[i].length(); j++){
				nameScores[i] += (str[i].charAt(j)-64) * (i+1);
			}
			writer2.write(str[i] + ": " + nameScores[i] + "\n");
		}
	
		writer2.close();
		
		
		//Add together all nameTotals and print to console
		long overallTotal = 0;
		for(int i = 0; i < nameScores.length; i++)
			overallTotal += nameScores[i];
		
		System.out.println("Total of all name scores: " + overallTotal);
		
	}

}