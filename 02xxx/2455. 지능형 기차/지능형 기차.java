import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int curInTrain = 0;
		int maxInTrain = Integer.MIN_VALUE;
		
		while(true) {
			int out = sc.nextInt();
			int in = sc.nextInt();
			
			curInTrain  = curInTrain - out + in;
			maxInTrain = maxInTrain > curInTrain ? maxInTrain : curInTrain;
					
			if(in == 0) break;		
		}
		
		System.out.println(maxInTrain);
	}
}

