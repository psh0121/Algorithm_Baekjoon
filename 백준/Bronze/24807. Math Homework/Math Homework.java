import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int leg = sc.nextInt();

		boolean istype = false;

		for(int i = 0; i <= leg / b; i++) {
			for(int j = 0; j <= leg / c; j++) {
				for(int k = 0; k <= leg / d; k++) {
					if((i*b) + (j*c) + (k*d) == leg) {
						istype = true;
						System.out.println(i + " " + j + " " + k);
					}
				}
			}
		}

		if(!istype) System.out.println("impossible");
        sc.close();
    }
}
