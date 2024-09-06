import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for(int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int c = sc.nextInt();

			int r = sc.nextInt();
			int g = sc.nextInt();
			int b = sc.nextInt();

			long val1 = 1l * a * ((r+1) * (r+1) + g * g + b * b) + c * Math.min(Math.min(r+1, g), b);
			long val2 = 1l * a * (r * r + (g+1) * (g+1) + b * b) + c * Math.min(Math.min(r, g+1), b);
			long val3 = 1l * a * (r * r + g * g + (b+1) * (b+1)) + c * Math.min(Math.min(r, g), b+1);

			long maxVal = Math.max(Math.max(val1, val2), val3);

			if(maxVal == val1) System.out.println("RED");
			else if(maxVal == val2) System.out.println("GREEN");
			else System.out.println("BLUE");
		}
		sc.close();
    }
}
