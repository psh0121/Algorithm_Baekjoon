import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();

		int nn = 0;
		int ss = 0;
		int ww = 0;
		int ee = 0;

		for(int i = 0; i < n; i++) {
			char value = str.charAt(i);

			if(value == 'N') nn++;
			else if(value == 'S') ss++;
			else if(value == 'W') ww++;
			else ee++;
		}

		System.out.println(n - Math.max(Math.max(nn, ss), Math.max(ww, ee)));
        sc.close();
    }
}
