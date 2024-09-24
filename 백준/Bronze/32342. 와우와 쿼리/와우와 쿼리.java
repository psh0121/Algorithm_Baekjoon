import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();

		for(int i = 0; i < q; i++) {
			String s = sc.next();
			int cnt = 0;

			for(int j = 0; j < s.length() - 2; j++) {
				String cutS = s.substring(j, j+3);

				if(cutS.equals("WOW")) cnt++;
			}

			System.out.println(cnt);
		}
		sc.close();
    }
}
