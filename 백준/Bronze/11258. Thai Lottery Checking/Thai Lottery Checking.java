import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String all = sc.next();
		int allM = sc.nextInt();

		// 앞3자리
		String front1 = sc.next();
		int front1M = sc.nextInt();
		String fron2 = sc.next();
		int fron2M = sc.nextInt();

		// 뒤3자리
		String back1 = sc.next();
		int back1M = sc.nextInt();
		String back2 = sc.next();
		int back2M = sc.nextInt();

		// 뒤2자리
		String backTwo = sc.next();
		int backTwoM = sc.nextInt();

		while (true) {
			String num = sc.next();
			if(num.equals("-1")) break;
			String frontNum = num.substring(0, 3);
			String backNum = num.substring(3, 6);
			String back2Num = num.substring(4, 6);
			
			int money = 0;

			if(num.equals(all)) money += allM;

			if(frontNum.equals(front1)) money += front1M;
			else if(frontNum.equals(fron2)) money += fron2M;

			if(backNum.equals(back1)) money += back1M;
			else if(backNum.equals(back2)) money += back2M;
			
			if(back2Num.equals(backTwo)) money += backTwoM;

			System.out.println(money);

		}
        sc.close();
    }
}
