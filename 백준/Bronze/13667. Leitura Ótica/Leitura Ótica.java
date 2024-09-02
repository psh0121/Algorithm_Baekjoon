import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String[] choice = {"A", "B", "C", "D", "E"};
		
		while (true) {
			int n = Integer.parseInt(sc.nextLine());
			if(n == 0) break;

			for(int i = 0; i < n; i++) {
				String[] value = sc.nextLine().split(" ");
				int blackCnt = 0;
				String result = "";

				for(int j = 0; j < value.length; j++) {
					if(Integer.parseInt(value[j]) <= 127) {
						blackCnt++;
						result += choice[j];
					}
				}

				if(blackCnt == 0 || blackCnt >= 2) System.out.println("*");
				else System.out.println(result);
			}
		}
        sc.close();
    }
}
