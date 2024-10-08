import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<Integer, Integer> map = new HashMap<>();

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 10; j++) {
				for(int k = 0; k < 5; k++) {
					int num = sc.nextInt();
					
					if(!map.containsKey(num)) {
						map.put(num, 1);
					}
					else {
						map.put(num, map.get(num) + 1);
					}
				}
			}
		}

		ArrayList<Integer> list = new ArrayList<>();

		for(Integer key : map.keySet()) {
			if(map.get(key) > 2 * n) {
				list.add(key);
			}
		}

		if(list.size() == 0) {
			System.out.println(-1);
		}
		else {
			Collections.sort(list);

			for(int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i));

				if(i != list.size() - 1) System.out.print(" ");
			}
		}
		sc.close();
    }
}
