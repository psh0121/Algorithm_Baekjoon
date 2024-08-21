import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] arr = sc.nextLine().split(" ");
		int beforeCnt = 0;
		int curCnt = 0;
		int cnt = 0;

		for(int i = 0; i < n; i++) {
			if(i == 0) {
				beforeCnt = Integer.parseInt(arr[i]);
				continue;
			}

			curCnt = Integer.parseInt(arr[i]);

			if(curCnt > beforeCnt) {
				cnt++;
			}

			beforeCnt = curCnt;
		}

		System.out.println(cnt);
		sc.close();
    }
}
