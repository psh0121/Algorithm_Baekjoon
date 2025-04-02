import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int speakNum = 1;
		for(int i = 0; i < n; i++) {
			String word = sc.next();

			if(word.equals("mumble")) {
				speakNum++;
				continue;
			}

			if(speakNum == Integer.parseInt(word)) {
				speakNum++;
			}
			else {
				System.out.println("something is fishy");
				return;
			}
		}

		System.out.println("makes sense");
		sc.close();
    }
}