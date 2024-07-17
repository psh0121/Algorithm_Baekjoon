import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] wordArr = {"he", "him", "she", "her"};

		int n = sc.nextInt();
		int cnt = 0;

		for(int i = 0; i < n; i++) {
			String word = sc.next();

			for(int j = 0; j < wordArr.length; j++) {
				if(word.equals(wordArr[j])) {
					cnt++;
					break;
				}
			}
		}

		System.out.println(cnt);
		
		sc.close();
    }
}
