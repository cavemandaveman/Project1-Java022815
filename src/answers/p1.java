package answers;

public class p1 {

	public static void main(String[] args) {

		int newNum = 0;
		
		for(int i = newNum; i < 1000; i++) {
			if(i % 3 == 0 || i % 5 == 0)
				newNum += i;
			else {}
		}
		
		System.out.println(newNum);
		
	}

}