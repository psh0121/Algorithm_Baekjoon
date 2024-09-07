import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] curTime = sc.next().split(":");
		String[] startTime = sc.next().split(":");

		int curTimeSecond = Integer.parseInt(curTime[0]) * 3600 + 
							Integer.parseInt(curTime[1]) * 60 +
							Integer.parseInt(curTime[2]);

		int startTimeSecond = Integer.parseInt(startTime[0]) * 3600 + 
							Integer.parseInt(startTime[1]) * 60 +
							Integer.parseInt(startTime[2]);
		
		int calSecond = 24 * 3600;

		if(curTimeSecond >= startTimeSecond) {
			calSecond -= (curTimeSecond - startTimeSecond);
		}
		else {
			calSecond -= (24 * 3600 - startTimeSecond) + curTimeSecond;
		}

		int hh = calSecond / 3600;
		calSecond %= 3600;

		int mm = calSecond / 60;
		calSecond %= 60;

		int ss = calSecond;

		System.out.printf("%02d:%02d:%02d", hh, mm, ss);
		sc.close();
    }
}
