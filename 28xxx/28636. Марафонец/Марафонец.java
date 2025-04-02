import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int hh = 0;
		int mm = 0;
		int ss = 0;

		for(int i = 0; i < n; i++) {
			String[] songLen = sc.next().split(":");

			mm += Integer.parseInt(songLen[0]);
			ss += Integer.parseInt(songLen[1]);
		}

		mm += ss / 60;
		ss %= 60;

		hh += mm / 60;
		mm %= 60;

		System.out.printf("%02d:%02d:%02d", hh, mm, ss);
		sc.close();
    }
}
