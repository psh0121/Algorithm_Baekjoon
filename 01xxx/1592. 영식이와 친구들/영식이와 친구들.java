import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();

		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 1; i <= n; i++) map.put(i, 0);

		int cnt = 0;
		int getBallNum = 1;

		map.put(getBallNum, map.get(getBallNum) + 1);

		while (map.get(getBallNum) != m) {
			int tossCnt = map.get(getBallNum);

			if(tossCnt % 2 == 1) {
				getBallNum = (getBallNum + l - 1) % n + 1;
			}
			else {
				getBallNum = (getBallNum - l - 1 + n) % n + 1;
			}
			map.put(getBallNum, map.get(getBallNum) + 1);
			cnt++;
		}

		System.out.println(cnt);
		sc.close();
    }
}
