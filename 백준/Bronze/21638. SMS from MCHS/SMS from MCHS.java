import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int todayT = sc.nextInt();
		int todayV = sc.nextInt();
		int tomorrowT = sc.nextInt();
		int tomorrowV = sc.nextInt();
		
		String msg = "No message";
		
		if(tomorrowT < 0 && tomorrowV >= 10) msg = "A storm warning for tomorrow! Be careful and stay home if possible!";
		else if(tomorrowT < todayT) msg = "MCHS warns! Low temperature is expected tomorrow.";
		else if(tomorrowT >= todayT && tomorrowV > todayV) msg = "MCHS warns! Strong wind is expected tomorrow.";
		
		System.out.println(msg);
	}
}         