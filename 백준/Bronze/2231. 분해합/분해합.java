import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 1; i <= n; i++) {
			String[] seperStrArr = Integer.toString(i).split("");
			int[] seperArr = new int[seperStrArr.length];
			int sum = i;

			for(int j = 0; j < seperArr.length; j++) {
				sum += Integer.parseInt(seperStrArr[j]);
			}

			if(sum == n) {
				System.out.println(i);
				return;
			}
		}

		System.out.println(0);
		sc.close();
    }
}
