import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n < 18) {
			System.out.println("NIE");
			return;
		}

		HashMap<String, Integer> map = new HashMap<>();
		for(int i = 1; i <= 5; i++) {
			map.put(i + "A", 0);
			map.put(i + "B", 0);
			map.put(i + "C", 0);
		}

		for(int i = 0; i < n; i++) {
			String value = sc.next();
			map.put(value, map.get(value) + 1);
		}

		// 검토
		for(int i = 1; i <= 4; i++) {
			if(map.get(i + "A") < 1 || 
			map.get(i + "B") < 1 || 
			map.get(i + "C") < 1) {
				System.out.println("NIE");
				return;
			}
		}

		if(map.get("5A") < 2 || 
			map.get("5B") < 2 || 
			map.get("5C") < 2) {
				System.out.println("NIE");
				return;
		}

		System.out.println("TAK");
		sc.close();
    }
}
