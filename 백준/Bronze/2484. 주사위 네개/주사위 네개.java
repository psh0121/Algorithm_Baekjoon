import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int maxMoney = 0;

		for(int i = 0; i < n; i++) {
			HashMap<Integer, Integer> map = new HashMap<>();
			int maxCnt = 0;
			int curMoney = 0;

			for(int j = 0; j < 4; j++) {
				int value = sc.nextInt();
				if(!map.containsKey(value)) {
					map.put(value, 1);
				}
				else {
					map.put(value, map.get(value) + 1);
				}

				maxCnt = Math.max(maxCnt, map.get(value));
			}

			if(maxCnt == 4) {
				int sameNum = 0;

				for(Integer key : map.keySet()) {
					if(map.get(key) == 4) {
						sameNum = key;
						break;
					}
				}

				curMoney = 50000 + (sameNum * 5000);
			}
			else if(maxCnt == 3) {
				int sameNum = 0;
				
				for(Integer key : map.keySet()) {
					if(map.get(key) == 3) {
						sameNum = key;
						break;
					}
				}

				curMoney = 10000 + (sameNum * 1000);
			}
			else if(maxCnt == 2) {
				int sameNum1 = 0;
				int sameNum2 = 0;

				for(Integer key : map.keySet()) {
					if(map.get(key) == 2) {
						if(sameNum1 == 0) sameNum1 = key;
						else sameNum2 = key;
					}
				}

				if(sameNum2 != 0) {
					curMoney = 2000 + (sameNum1 * 500) + (sameNum2 * 500);
				}
				else {
					curMoney = 1000 + (sameNum1 * 100);
				}
			}
			else {
				int maxNum = 0;

				for(Integer key : map.keySet()) {
					maxNum = Math.max(maxNum, key);
				}

				curMoney = maxNum * 100;
			}
			maxMoney = Math.max(maxMoney, curMoney);
		}

		System.out.println(maxMoney);
		sc.close();
    }
}
