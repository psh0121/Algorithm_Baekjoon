import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		while (true) {
			int n = sc.nextInt();

			if(n == 0) break;
			ArrayList<Integer> list = new ArrayList<>();

			for(int i = 0; i < n; i++) {
				int num = sc.nextInt();
				if(list.size() == 0) list.add(num);
				else if(list.get(list.size() - 1) != num) list.add(num);
			}

			for(Integer value : list) {
				System.out.print(value + " ");
			}
			System.out.println("$");
		}
		sc.close();
    }
}
