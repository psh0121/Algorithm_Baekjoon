import java.util.Scanner;

public class Main {

	public static double company1Cost(int km) {
		double cost = 0.0;

		if (km <= 5) {
			cost += 4;
		}
		else if (km > 5 && km <= 10) {
			cost += 7;
		}
		else if (km > 10 && km <= 20) {
			cost += 12;
		}
		else if (km > 20 && km <= 30) {
			cost += 17;
		}
		else {
			cost += (km * 0.57);
		}

		return cost;
	}

	public static double company2Cost(int km) {
		double cost = 0.0;

		if (km <= 2) {
			cost += 0.90;
			cost += km * 0.90;
		}
		else if (km > 2 && km <= 5) {
			cost += 1.00;
			cost += km * 0.85;
		}
		else if (km > 5 && km <= 20) {
			cost += 1.25;
			cost += km * 0.80;
		}
		else if (km > 20 && km <= 40) {
			cost += 3.25;
			cost += km * 0.70;
		}
		else {
			cost += 9.25;
			cost += km * 0.55;
		}

		return cost;
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int post1 = sc.nextInt() / 1000;
		int post2 = sc.nextInt() / 1000;

		// 1+1
		double cost1 = 0.0;

		cost1 += company1Cost(post1);
		cost1 += company1Cost(post2);

		// 2+2
		double cost2 = 0.0;

		cost2 += company2Cost(post1);
		cost2 += company2Cost(post2);

		// 1+2
		double cost3 = 0.0;

		cost3 += company1Cost(post1);
		cost3 += company2Cost(post2);

		// 2+1
		double cost4 = 0.0;

		cost4 += company2Cost(post1);
		cost4 += company1Cost(post2);

		double minValue = Math.min(Math.min(cost1, cost2), Math.min(cost3, cost4));

		System.out.printf("%.2f",minValue);
        sc.close();
    }
}
