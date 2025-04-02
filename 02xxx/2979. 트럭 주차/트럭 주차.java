import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int[] truck1 = {sc.nextInt(), sc.nextInt()};
		int[] truck2 = {sc.nextInt(), sc.nextInt()};
		int[] truck3 = {sc.nextInt(), sc.nextInt()};

		int minNum = Math.min(truck1[0], Math.min(truck2[0], truck3[0]));
		int maxNum = Math.max(truck1[1], Math.max(truck2[1], truck3[1]));

		int fee = 0;

		for(int i = minNum; i <= maxNum; i++) {
			int cnt = 0;

			if(i > truck1[0] && i <= truck1[1]) cnt++;
			if(i > truck2[0] && i <= truck2[1]) cnt++;
			if(i > truck3[0] && i <= truck3[1]) cnt++;

			if(cnt == 1) fee += a;
			else if(cnt == 2) fee += b*2;
			else if(cnt == 3) fee += c*3;
		}

		System.out.println(fee);

		sc.close();
    }
}
