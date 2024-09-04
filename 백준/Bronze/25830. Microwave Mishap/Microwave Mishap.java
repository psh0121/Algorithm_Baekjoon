import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		String[] value = sc.next().split(":");

		int mmss = Integer.parseInt(value[0]) * 60 + Integer.parseInt(value[1]);
		int hhmm = Integer.parseInt(value[0]) * 3600 + Integer.parseInt(value[1]) * 60;

		int calSecond = hhmm - mmss;

		int hh = calSecond / 3600;
		calSecond %= 3600;

		int mm = calSecond / 60;
		calSecond %= 60;

		int ss = calSecond;

		System.out.printf("%02d:%02d:%02d", hh, mm, ss);
		
		sc.close();
    }
}
