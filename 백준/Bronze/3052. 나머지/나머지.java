import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();

		while (sc.hasNext()) {
			int num = sc.nextInt();
			int numMod = num % 42;

			if(!list.contains(numMod)) list.add(numMod);
		}

		System.out.println(list.size());
		sc.close();
    }
}
