import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int S1 = sc.nextInt();
		int S2 = sc.nextInt();
		int S3 = sc.nextInt();

		HashMap<Integer, Integer> map = new HashMap<>();

		for(int i = 1; i <= S1; i++) {
			for(int j = 1; j <= S2; j++) {
				for(int k = 1; k <= S3; k++) {
					int sum = i + j + k;

					if(!map.containsKey(sum)) map.put(sum, 1);
					else map.put(sum, map.get(sum) + 1);
				}
			}
		}

		int result = 0;
		int cnt = 0;

		for(Integer key : map.keySet()) {
			Integer value = map.get(key);

			if(value > cnt) {
				result = key;
				cnt = value;
			}
			else if(value == cnt && Math.min(result, key) == key) {
				result = key;
			}
		}

		System.out.println(result);
		sc.close();
    }
}
