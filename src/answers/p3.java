package answers;

import java.text.DecimalFormat;

public class p3 {

	public static void main(String[] args) {

		String[] str1 = {"2", "3", "8", "1", "3", "1", "8", "599", "1", "5", "7", "7", "8", "7", "6", "1", "1", "1", "5", "596", "7", "1", "7", "1", "1", "1", "7", "2", "1", "4", "542", "7", "1", "1", "3", "3", "2", "1", "7", "2", "2", "510", "1", "1", "1", "2", "2", "1", "3", "2", "557", "7", "2", "7", "2", "1", "7", "7", "5", "7", "2", "595", "2", "1", "4", "3", "2", "1", "2", "8", "1", "563", "2", "1", "3", "2", "2", "2", "7", "1", "569", "7", "1", "1", "1", "2", "3", "7", "538", "3", "2", "2", "3", "2", "3", "3", "1", "1", "8", "40239", "502", "5", "9", "1", "1", "7", "1", "8", "7", "568", "1", "2", "1", "1", "7", "1", "2", "7", "1", "2", "501", "1", "8", "7", "2", "1", "2", "1", "1", "1", "2", "509", "9", "2", "1", "1", "2", "2", "7", "1", "2", "541", "2", "2", "1", "8", "1", "2", "2", "2", "3", "525", "2", "7", "1", "1", "3", "2", "2", "1", "1", "479", "3", "2", "1", "8", "2", "3", "2", "2", "5", "2", "503", "2", "7", "1", "7", "2", "1", "2", "7", "8", "1", "511", "1", "2", "3", "3", "2", "3", "7", "7", "7", "498", "1", "1", "2", "4", "2", "2", "1", "1", "38998", "525", "7", "7", "1", "1", "9", "1", "1", "2", "2", "6", "1", "453", "5", "7", "4", "2", "8", "5", "1", "2", "1", "519", "5", "1", "8", "7", "1", "3", "1", "4", "536", "2", "7", "7", "1", "2", "5", "1", "2", "1", "8", "7", "1", "525", "4", "7", "9", "2", "2", "4", "1", "1", "482", "1", "2", "2", "2", "483", "7", "1", "1", "2", "2", "1", "1", "7", "3", "500", "7", "2", "1", "7", "4", "8", "3", "1", "8", "516", "7", "1", "2", "2", "1", "8", "1", "487", "8", "1", "2", "2", "2", "1", "1", "1", "2", "37944", "469", "6", "7", "2", "2", "1", "3", "1", "1", "2", "474", "7", "2", "2", "2", "2", "7", "1", "8", "2", "467", "2", "2", "2", "3", "2", "1", "1", "7", "1", "2", "431", "7", "1", "1", "7", "1", "8", "446", "3", "7", "7", "2", "1", "1", "2", "9", "3", "474", "1", "1", "3", "4", "1", "8", "1", "2", "2", "466", "4", "7", "7", "1", "5", "1", "2", "487", "1", "1", "1", "1", "2", "5", "1", "485", "7", "1", "2", "1", "8", "5", "1", "6", "447", "2", "8", "2", "1", "8", "5", "7", "37086", "491", "8", "8", "7", "2", "9", "2", "1", "7", "1", "484", "6", "7", "1", "1", "1", "1", "1", "2", "3", "463", "8", "1", "1", "7", "2", "2", "7", "2", "491", "7", "8", "8", "1", "1", "2", "3", "2", "1", "485", "3", "1", "8", "2", "5", "1", "1", "1", "2", "1", "1", "462", "1", "8", "2", "2", "2", "7", "1", "2", "8", "8", "473", "8", "1", "1", "2", "1", "5", "7", "2", "446", "1", "1", "2", "2", "1", "4", "8", "2", "486", "3", "2", "5", "1", "1", "7", "1", "2", "1", "437", "8", "1", "1", "2", "1", "2", "7", "8", "36838", "488", "3", "1", "3", "2", "7", "3", "1", "5", "1", "6", "456", "2", "8", "2", "2", "4", "2", "2", "2", "2", "9", "481", "2", "1", "1", "1", "1", "2", "4", "9", "5", "463", "7", "1", "3", "7", "1", "2", "8", "442", "1", "7", "8", "2", "1", "8", "3", "5", "458", "2", "8", "8", "1", "7", "438", "8", "2", "1", "1", "8", "1", "3", "1", "1", "1", "2", "440", "2", "2", "8", "1", "5", "5", "7", "1", "4", "458", "7", "1", "3", "5", "2", "8", "427", "7", "3", "1", "1", "1", "4", "2", "1", "35610", "482", "6", "1", "2", "7", "1", "2", "7", "7", "449", "2", "1", "1", "2", "1", "4", "2", "2", "2", "1", "443", "7", "1", "1", "1", "1", "8", "454", "2", "1", "1", "2", "1", "1", "1", "457", "1", "1", "2", "2", "2", "1", "7", "2", "3", "484", "2", "1", "5", "1", "3", "1", "1", "5", "506", "3", "1", "1", "2", "8", "6", "2", "7", "5", "470", "1", "3", "1", "8", "1", "2", "458", "3", "1", "6", "5", "1", "7", "461", "1", "3", "1", "1", "2", "7", "1", "2", "7", "35215", "442", "1", "1", "1", "1", "1", "8", "1", "1", "1", "475", "2", "1", "2", "8", "3", "2", "2", "3", "7", "2", "1", "465", "4", "1", "2", "1", "4", "4", "2", "2", "8", "460", "2", "7", "1", "1", "1", "1", "437", "3", "1", "1", "1", "4", "8", "2", "1", "2", "8", "441", "2", "1", "7", "1", "1", "1", "1", "1", "1", "467", "7", "4", "2", "2", "4", "2", "7", "2", "494", "2", "1", "1", "2", "4", "2", "1", "450", "2", "4", "8", "1", "2", "4", "7", "2", "7", "1", "427", "1", "2", "2", "6", "1", "1", "5", "2", "3", "34429", "460", "1", "1", "7", "1", "8", "1", "1", "1", "7", "476", "1", "5", "4", "7", "1", "4", "1", "7", "7", "1", "436", "1", "7", "1", "2", "1", "1", "7", "2", "457", "4", "2", "3", "2", "2", "2", "2", "2", "482", "4", "2", "1", "3", "1", "1", "2", "2", "467", "1", "6", "1", "3", "2", "1", "8", "420", "2", "9", "1", "1", "1", "7", "1", "7", "459", "2", "8", "1", "1", "2", "5", "488", "1", "8", "1", "8", "3", "3", "2", "3", "1", "444", "2", "1", "2", "3", "1", "7", "3", "33833", "419", "2", "1", "2", "2", "2", "6", "1", "1", "1", "7", "452", "1", "2", "3", "1", "2", "2", "3", "427", "1", "1", "1", "2", "5", "2", "1", "1", "1", "1", "7", "458", "1", "4", "1", "4", "2", "1", "2", "8", "400", "8", "1", "2", "1", "7", "2", "474", "1", "7", "4", "1", "1", "2", "1", "2", "450", "2", "1", "2", "2", "1", "2", "6", "1", "1", "448", "1", "2", "5", "2", "7", "2", "473", "1", "1", "2", "1", "1", "2", "1", "2", "444", "3", "1", "4", "2", "1", "1", "7", "8", "714752", "33468", "468", "1", "2", "2", "2", "8", "1", "1", "1", "401", "1", "2", "1", "1", "2", "1", "2", "2", "422", "2", "2", "3", "7", "7", "7", "1", "8", "7", "457", "7", "1", "1", "1", "2", "1", "8", "1", "1", "7", "2", "1", "443"};
		String[] str2 = {"2", "3", "6", "1", "3", "1", "6", "599", "1", "5", "3", "3", "4", "3", "2", "1", "1", "1", "5", "596", "3", "1", "3", "1", "1", "1", "3", "2", "1", "1", "542", "3", "1", "1", "3", "3", "2", "1", "3", "2", "2", "510", "1", "1", "1", "2", "2", "1", "3", "2", "557", "3", "2", "3", "2", "1", "3", "3", "5", "3", "2", "595", "1", "1", "4", "3", "2", "1", "2", "6", "1", "563", "2", "1", "3", "2", "2", "2", "3", "1", "569", "3", "1", "1", "1", "2", "3", "3", "538", "3", "2", "2", "3", "2", "2", "3", "1", "1", "4", "40239", "502", "5", "7", "1", "1", "1", "1", "1", "1", "568", "1", "2", "1", "1", "3", "1", "2", "3", "1", "2", "501", "1", "1", "3", "2", "1", "2", "1", "1", "1", "2", "509", "2", "2", "1", "1", "2", "2", "3", "1", "2", "541", "2", "2", "1", "4", "1", "2", "2", "2", "3", "525", "2", "3", "1", "1", "3", "2", "2", "1", "1", "479", "2", "2", "1", "4", "2", "2", "2", "2", "2", "2", "503", "2", "3", "1", "3", "2", "1", "2", "1", "4", "1", "511", "1", "2", "3", "3", "2", "3", "3", "3", "3", "498", "1", "1", "2", "2", "2", "2", "1", "1", "38998", "525", "3", "3", "1", "1", "2", "1", "1", "2", "2", "2", "1", "453", "5", "3", "4", "2", "4", "5", "1", "2", "1", "519", "5", "1", "4", "2", "1", "1", "1", "4", "536", "2", "3", "3", "1", "2", "5", "1", "2", "1", "4", "3", "1", "525", "4", "3", "2", "2", "2", "2", "1", "1", "482", "1", "2", "2", "2", "483", "3", "1", "1", "2", "2", "1", "1", "3", "3", "500", "3", "2", "1", "3", "2", "6", "3", "1", "4", "516", "3", "1", "2", "2", "1", "2", "1", "487", "1", "1", "2", "2", "2", "1", "1", "1", "2", "37944", "469", "1", "1", "2", "2", "1", "1", "1", "1", "2", "474", "3", "2", "2", "2", "2", "3", "1", "4", "2", "467", "2", "2", "2", "3", "2", "1", "1", "3", "1", "2", "431", "3", "1", "1", "3", "1", "2", "446", "3", "3", "3", "2", "1", "1", "2", "7", "3", "474", "1", "1", "3", "1", "1", "1", "1", "2", "2", "466", "1", "3", "3", "1", "1", "1", "2", "487", "1", "1", "1", "1", "2", "1", "1", "485", "1", "1", "1", "1", "6", "2", "1", "1", "447", "2", "1", "2", "1", "4", "5", "2", "37086", "491", "6", "6", "1", "2", "2", "2", "1", "3", "1", "484", "2", "3", "1", "1", "1", "1", "1", "2", "3", "463", "4", "1", "1", "3", "2", "2", "3", "2", "491", "3", "4", "4", "1", "1", "2", "3", "2", "1", "485", "3", "1", "6", "2", "2", "1", "1", "1", "2", "1", "1", "462", "1", "4", "1", "2", "2", "3", "1", "2", "1", "2", "473", "4", "1", "1", "2", "1", "5", "3", "2", "446", "1", "1", "2", "2", "1", "2", "1", "2", "486", "3", "2", "5", "1", "1", "3", "1", "2", "1", "437", "1", "1", "1", "2", "1", "2", "3", "4", "36838", "488", "2", "1", "2", "2", "3", "3", "1", "2", "1", "1", "456", "2", "6", "2", "2", "2", "2", "2", "2", "2", "2", "481", "2", "1", "1", "1", "1", "2", "2", "2", "5", "463", "3", "1", "3", "3", "1", "2", "1", "442", "1", "3", "4", "2", "1", "1", "3", "2", "458", "2", "4", "1", "1", "3", "438", "1", "2", "1", "1", "4", "1", "3", "1", "1", "1", "2", "440", "2", "2", "2", "1", "2", "5", "3", "1", "1", "458", "3", "1", "1", "5", "2", "6", "427", "3", "1", "1", "1", "1", "4", "1", "1", "35610", "482", "1", "1", "2", "3", "1", "2", "2", "3", "449", "2", "1", "1", "2", "1", "4", "2", "2", "2", "1", "443", "3", "1", "1", "1", "1", "4", "454", "2", "1", "1", "2", "1", "1", "1", "457", "1", "1", "2", "2", "2", "1", "3", "2", "3", "484", "2", "1", "5", "1", "3", "1", "1", "5", "506", "2", "1", "1", "2", "4", "1", "2", "3", "2", "470", "1", "3", "1", "4", "1", "2", "458", "1", "1", "1", "5", "1", "3", "461", "1", "3", "1", "1", "2", "3", "1", "2", "1", "35215", "442", "1", "1", "1", "1", "1", "4", "1", "1", "1", "475", "2", "1", "2", "4", "3", "2", "2", "3", "3", "2", "1", "465", "1", "1", "2", "1", "1", "2", "2", "2", "4", "460", "2", "3", "1", "1", "1", "1", "437", "1", "1", "1", "1", "1", "2", "2", "1", "2", "4", "441", "2", "1", "3", "1", "1", "1", "1", "1", "1", "467", "3", "2", "2", "2", "1", "2", "3", "2", "494", "2", "1", "1", "2", "1", "2", "1", "450", "2", "4", "4", "1", "2", "4", "2", "2", "3", "1", "427", "1", "2", "2", "2", "1", "1", "1", "2", "1", "34429", "460", "1", "1", "3", "1", "4", "1", "1", "1", "3", "476", "1", "2", "4", "3", "1", "4", "1", "3", "3", "1", "436", "1", "3", "1", "2", "1", "1", "3", "2", "457", "1", "2", "2", "2", "2", "2", "2", "2", "482", "4", "2", "1", "1", "1", "1", "2", "2", "467", "1", "1", "1", "1", "2", "1", "4", "420", "2", "7", "1", "1", "1", "3", "1", "1", "459", "2", "4", "1", "1", "2", "5", "488", "1", "2", "1", "2", "3", "3", "2", "3", "1", "444", "2", "1", "2", "3", "1", "3", "3", "33833", "419", "2", "1", "2", "2", "2", "2", "1", "1", "1", "3", "452", "1", "2", "3", "1", "2", "2", "2", "427", "1", "1", "1", "2", "5", "2", "1", "1", "1", "1", "3", "458", "1", "1", "1", "2", "2", "1", "2", "4", "400", "4", "1", "2", "1", "3", "2", "474", "1", "3", "2", "1", "1", "2", "1", "2", "450", "2", "1", "2", "2", "1", "2", "1", "1", "1", "448", "1", "2", "2", "2", "3", "2", "473", "1", "1", "2", "1", "1", "2", "1", "1", "444", "3", "1", "1", "2", "1", "1", "1", "4", "714752", "33468", "468", "1", "2", "2", "2", "4", "1", "1", "1", "401", "1", "2", "1", "1", "2", "1", "2", "2", "422", "2", "2", "1", "3", "3", "3", "1", "4", "3", "457", "1", "1", "1", "1", "2", "1", "4", "1", "1", "2", "2", "1", "443"};
		double data1[] = new double[str1.length];
		double data2[] = new double[str2.length];
		double occurrences1[] = new double[9];
		double occurrences2[] = new double[9];
		double p1[] = new double[9];
		double p2[] = new double[9];

		//Change string arrays to int arrays
		for (int i = 0; i < str1.length; i++) 
		    data1[i]=Integer.parseInt(str1[i]);

		for (int i = 0; i < str2.length; i++) 
		    data2[i]=Integer.valueOf(str2[i]);
		
		
		//Change int arrays to single digit int arrays
		for(int i = 0; i < data1.length; i++){
			if(data1[i] >= 10.00 && data1[i] <= 99.00)
				data1[i] /= 10.00;
			else if(data1[i] >= 100.00 && data1[i] <= 999.00)
				data1[i] /= 100.00;
			else{}
		}
		for(int i = 0; i < data2.length; i++){
			if(data2[i] >= 10.00 && data2[i] <= 99.00)
				data2[i] /= 10.00;
			else if(data2[i] >= 100.00 && data2[i] <= 999.00)
				data2[i] /= 100.00;
			else{}
		}
		
		
		//Log occurrences of numbers 1-9 into an array
		for(int i = 0; i < data1.length; i++) {
			if(data1[i] == 1.00)
				occurrences1[0] += data1[i];
			else if(data1[i] == 2.00)
				occurrences1[1] += data1[i];
			else if(data1[i] == 3.00)
				occurrences1[2] += data1[i];
			else if(data1[i] == 4.00)
				occurrences1[3] += data1[i];
			else if(data1[i] == 5.00)
				occurrences1[4] += data1[i];
			else if(data1[i] == 6.00)
				occurrences1[5] += data1[i];
			else if(data1[i] == 7.00)
				occurrences1[6] += data1[i];
			else if(data1[i] == 8.00)
				occurrences1[7] += data1[i];
			else if(data1[i] == 9.00)
				occurrences1[8] += data1[i];
		}
		for(int i = 0; i < data2.length; i++) {
			if(data2[i] == 1.00)
				occurrences2[0] += data2[i];
			else if(data2[i] == 2.00)
				occurrences2[1] += data2[i];
			else if(data2[i] == 3.00)
				occurrences2[2] += data2[i];
			else if(data2[i] == 4.00)
				occurrences2[3] += data2[i];
			else if(data2[i] == 5.00)
				occurrences2[4] += data2[i];
			else if(data2[i] == 6.00)
				occurrences2[5] += data2[i];
			else if(data2[i] == 7.00)
				occurrences2[6] += data2[i];
			else if(data2[i] == 8.00)
				occurrences2[7] += data2[i];
			else if(data2[i] == 9.00)
				occurrences2[8] += data2[i];
		}
		
		
		//Set probability of numbers 1-9 in an array
		for(int i = 0; i < occurrences1.length; i++) {
			p1[i] = occurrences1[i] / data1.length;
		}
		for(int i = 0; i < occurrences2.length; i++) {
			p2[i] = occurrences2[i] / data2.length;
		}

		
		//Show all probabilities
		System.out.println("Benford's data set probabilities: 1's: 30.1%  2's: 17.6%  3's: 12.5%  4's: 9.7%  5's: 7.9%  6's: 6.7%  7's: 5.8%  8's: 5.1%  9's: 4.6%");
		
		DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.print("Data set 1:			  ");
		for(int i = 0; i < p1.length; i++)
			System.out.print((i+1) + "'s: " + df.format(p1[i] * 100) + "%  ");
		
		System.out.print("\nData set 2:			  ");
		for(int i = 0; i < p2.length; i++)
			System.out.print((i+1) + "'s: " + df.format(p2[i] * 100) + "%  ");
		
	}

}
