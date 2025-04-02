import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Integer> map = new HashMap<>();
		int sum = 0;
		int modeNum = 0;
		int modeCnt = 0;

		for(int i = 0; i < 10; i++) {
			int num = sc.nextInt();
			sum += num;

			if(!map.containsKey(num)) map.put(num, 1);
			else map.put(num, map.get(num) + 1);
		}

		for(Integer key : map.keySet()) {
			if(map.get(key) > modeCnt) {
				modeNum = key;
				modeCnt = map.get(key);
			}
		}

		System.out.println(sum / 10);
		System.out.println(modeNum);

		sc.close();
    }
}
