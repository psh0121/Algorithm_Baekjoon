import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Integer> manMap = new HashMap<>();
		HashMap<Integer, Integer> womanMap = new HashMap<>();

		int n = sc.nextInt();
		int k = sc.nextInt();

		for(int i = 0; i < n; i++) {
			int s = sc.nextInt();
			int y = sc.nextInt();

			if(s == 0) {
				if(!manMap.containsKey(y)) manMap.put(y, 1);
				else manMap.put(y, manMap.get(y) + 1);
			}
			else {
				if(!womanMap.containsKey(y)) womanMap.put(y, 1);
				else womanMap.put(y, womanMap.get(y) + 1);
			}
		}

		int roomCnt = 0;

		for(Integer key : manMap.keySet()) {
			roomCnt += manMap.get(key) / k;

			if(manMap.get(key) % k > 0) roomCnt++;
		}

		for(Integer key : womanMap.keySet()) {
			roomCnt += womanMap.get(key) / k;

			if(womanMap.get(key) % k > 0) roomCnt++;
		}

		System.out.println(roomCnt);
		sc.close();
    }
}
