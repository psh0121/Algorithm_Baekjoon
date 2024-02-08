import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		while(sc.hasNext()) {
			// 인치 -> 피트 -> 마일 
			double r = sc.nextDouble() / 2 / 12 / 5280;
			int cnt = sc.nextInt();
			
			// 초 -> 분 -> 시간 
			double time = sc.nextDouble() / 60 / 60;
			double pi = 3.1415927;
			
			num++;
			
			if(cnt == 0) continue;
			
			double moveDistance = 2 * pi * r * cnt;
			double avgSpeed = moveDistance / time;
			
			System.out.println("Trip #" + num + ": " + String.format("%.2f", moveDistance) + " " + String.format("%.2f", avgSpeed));
		}
	}
}

