import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt() - 1;

		double x = sc.nextDouble();
		double y = sc.nextDouble();

		for(int i = 0; i < n; i++) {
			String location = sc.next();
			double value = sc.nextDouble();

			if(location.equals("E")) x += value;
			else if(location.equals("W")) x -= value;
			else if(location.equals("S")) y -= value;
			else if(location.equals("N")) y += value;
			else if(location.equals("NE")) {
				x += value * (Math.sqrt((double)2) / 2);
				y += value * (Math.sqrt((double)2) / 2);
			}
			else if(location.equals("SE")) {
				x += value * (Math.sqrt((double)2) / 2);
				y -= value * (Math.sqrt((double)2) / 2);
			}
			else if(location.equals("SW")) {
				x -= value * (Math.sqrt((double)2) / 2);
				y -= value * (Math.sqrt((double)2) / 2);
			}
			else if(location.equals("NW")) {
				x -= value * (Math.sqrt((double)2) / 2);
				y += value * (Math.sqrt((double)2) / 2);
			}
		}

		System.out.println(x + " " + y);
		sc.close();
    }
}
