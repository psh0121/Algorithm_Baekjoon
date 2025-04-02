import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String before = sc.next();
		String after = sc.next();

		if(n % 2 == 0) {
			System.out.println(before.equals(after) ? "Deletion succeeded" : "Deletion failed");
		}
		else {
			String changeBefore = "";
			
			for(int i = 0; i < before.length(); i++) {
				char letter = before.charAt(i);
				changeBefore += letter == '0' ? '1' : '0';
			}

			System.out.println(changeBefore.equals(after) ? "Deletion succeeded" : "Deletion failed");
		}

		sc.close();
    }
}
