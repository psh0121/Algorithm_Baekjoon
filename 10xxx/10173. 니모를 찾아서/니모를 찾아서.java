import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		while (true) {
			String str = sc.nextLine();
			if(str.equals("EOI")) break;
			str = str.toLowerCase();

			System.out.println(str.contains("nemo") ? "Found" : "Missing");
		}
		sc.close();
    }
}
