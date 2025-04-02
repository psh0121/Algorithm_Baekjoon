import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			int caseNum = sc.nextInt();
			int value = sc.nextInt();

			if(caseNum == 1) cnt += value;
			else {
				cnt -= value;
				if(cnt < 0) {
					System.out.println("Adios");
					return;
				}
			}
		}

		System.out.println("See you next month");
		sc.close();
    }
}
