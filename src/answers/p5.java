package answers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class p5 {

	public static void main(String[] args) throws IOException {
      
		List<String> nums = new ArrayList<>();
		BufferedReader reader = new BufferedReader(new FileReader("./src/resources/longnums.txt"));
		FileWriter writer = new FileWriter("./src/answers/p5a.txt");
		
		//Add lines from file to ArrayList
		while(true) {
			String line = reader.readLine();
			if(line.isEmpty())
				break;
			nums.add(line);
		}
		reader.close();
		
		Collections.sort(nums);

		//Write array to text file
		for(String a : nums)
			writer.write(a + "\n");
		writer.close();
		
		
		//Change string array to BigInteger and add all values
		BigInteger total = new BigInteger(nums.get(0));
		for(int i = 1; i < nums.size(); i++) {
			BigInteger a = new BigInteger(nums.get(i));
			total = total.add(a);
		}
		
		
		//Change "total" to string and print first 10 characters
		String newnum = total.toString();
		System.out.print("First 10 digits of total: ");
		for(int i = 0; i < 10; i++)
			System.out.print(newnum.charAt(i));

	}

}
