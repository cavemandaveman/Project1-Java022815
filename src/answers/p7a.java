package answers;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class p7a {

	public static void main(String[] args) throws IOException {

		List<Integer> primes = new ArrayList<>();
		FileWriter writer = new FileWriter("./src/answers/primearray.txt");
		
		
		//Find and add prime numbers below 100 to "primes" array
		for (int i = 1; i <= 100; i++) {
			int counter = 0;
			for(int num = i; num >= 1; num--) {
				if(i%num == 0)
					counter += 1;
			}
			if (counter == 2 && i != 0)
				primes.add(i);
		}
	

		//Write array to file
		for(Integer s : primes)
			writer.write(s + "\n");
		writer.close();
		
	}
	
}
