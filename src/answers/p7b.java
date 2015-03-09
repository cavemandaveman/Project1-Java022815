package answers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class p7b {

	public static void main(String[] args) throws IOException {

		List<String> primes = new ArrayList<>();
		BufferedReader reader = new BufferedReader(new FileReader("./src/answers/primearray.txt"));
		
		
		//Add content of txt file to the array "primes"
		while(true) {
			String line = reader.readLine();
			if(line == null)
				break;
			primes.add(line);
		}
		reader.close();
		
		
		//Change from ArrayList to String Array
		String[] str = new String[primes.size()];
		primes.toArray(str);
		
		
		//Initialize variables to find needed consecutive numbers and print to console
		int min = Integer.parseInt(str[0]);
		int first5 = Integer.parseInt(str[4]);
		int first10 = Integer.parseInt(str[9]);
		
		first5 = first5 - min - 4;
		first10 = first10 - min - 9;
		
		System.out.println("Minimum numbers to make consecutive array of the first 5 primes: " + first5);
		System.out.println("Minimum numbers to make consecutive array of the first 10 primes: " + first10);

		
	}

}
