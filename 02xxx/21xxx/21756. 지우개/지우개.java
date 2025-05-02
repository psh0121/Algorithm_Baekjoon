import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void removeOddIdx(ArrayList<Integer> list) {
		for(int i = 0; i < list.size(); i++) {
			if(i % 2 == 0) list.set(i, 0);
		}

		list.removeAll(Arrays.asList(0));
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 1; i <= n; i++) list.add(i);

		while (list.size() > 1) {
			removeOddIdx(list);
		}
		System.out.println(list.get(0));
		sc.close();
    }
}
