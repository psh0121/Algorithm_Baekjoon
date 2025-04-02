import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for(int i = 0; i < t; i++) {
			int distance = sc.nextInt();
			int recharge = sc.nextInt();
			int food = sc.nextInt();

			ArrayList<Integer> list = new ArrayList<>();

			for(int j = recharge; j < distance; j += recharge) {
				list.add(j);
			}

			for(int j = food; j < distance; j += food) {
				if(!list.contains(j)) list.add(j);
			}

			System.out.printf("%d %d %d\n", distance, recharge, food);
			System.out.println(list.size());
		}
		sc.close();
    }
}
