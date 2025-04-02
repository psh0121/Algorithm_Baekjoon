import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int minTime = Integer.MAX_VALUE;
		int maxTime = Integer.MIN_VALUE;
		
		for(int i = 0; i < 3; i++) {
			int startTime = sc.nextInt()*60 + sc.nextInt();
			int endTime = sc.nextInt()*60 + sc.nextInt();
			
			if(endTime < startTime) endTime += (24*60);
			
			int resultTime = endTime - startTime;
			
			minTime = minTime < resultTime ? minTime : resultTime;
			maxTime = maxTime > resultTime ? maxTime : resultTime;
		}
		
		System.out.print(minTime / 60 + ":");
		
		if(minTime % 60 < 10) System.out.println("0" + minTime % 60);
		else System.out.println(minTime % 60);
		
		System.out.print(maxTime / 60 + ":");
		
		if(maxTime % 60 < 10) System.out.println("0" + maxTime % 60);
		else System.out.println(maxTime % 60);
	}
}

