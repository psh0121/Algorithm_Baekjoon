import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		if(!str.contains("(")) {
			System.out.println(str);
			System.out.println("-");
			return;
		}
		str = str.replace("(", "\n");
		str = str.replace(")", "");

		System.out.println(str);
		sc.close();
    }
}
