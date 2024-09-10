import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();

		// 0, 1 추가
		list.add(0);
		list.add(1);

		int n = sc.nextInt();

		while (list.size() <= n) {
			list.add(list.get(list.size() - 1) + list.get(list.size() - 2));
		}

		System.out.println(list.get(n));
		sc.close();
    }
}
