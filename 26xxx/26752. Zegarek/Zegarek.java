import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt();

		s++;

		if(s == 60) {
			s = 0;
			m++;
		}
		if(m == 60) {
			m = 0;
			h++;
		}
		if(h == 24) {
			h = 0;
		}

		System.out.printf("%02d:%02d:%02d", h, m, s);
        sc.close();
    }
}
