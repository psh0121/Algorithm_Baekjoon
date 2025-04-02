import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {
			ArrayList<Integer> list = new ArrayList<>();		
			String number = sc.next();

			for(int j = 0; j < number.length(); j++) {
				int letter = (int)number.charAt(j);

				if(!list.contains(letter)) list.add(letter);
			}

			System.out.println(list.size());
		}
		sc.close();
    }
}
