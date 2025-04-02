import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		HashMap<Integer, Integer> map = new HashMap<>();

		// 회사, 거리
		for(int i = 1; i <= n; i++) {
			map.put(i, sc.nextInt());
		}

		for(int i = 0; i < q; i++) {
			int type = sc.nextInt();

			if(type == 1) {
				int c = sc.nextInt();
				int x = sc.nextInt();

				map.put(c, x);
			}
			else {
				int a = sc.nextInt();
				int b = sc.nextInt();

				System.out.println(Math.abs(map.get(a) - map.get(b)));
			}
		}
		sc.close();
    }
}
