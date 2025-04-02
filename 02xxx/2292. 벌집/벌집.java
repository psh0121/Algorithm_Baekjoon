import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cnt = 1;
		int roomCnt = 1;

		while (num > roomCnt) {
			roomCnt += (6 * cnt);
			cnt++;
		}

		System.out.println(cnt);
		sc.close();
    }
}
