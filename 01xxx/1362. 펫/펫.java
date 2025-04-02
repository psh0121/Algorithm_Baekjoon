import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int o = 0;
		int w = 0;
		boolean printResult = false;
		int i = 1;

		while (true) {
			String temp1 = sc.next();
			String temp2 = sc.next();

			// 종료
			if(temp1.equals("0") && temp2.equals("0")) break;
			// 한챕터 종료
			else if(temp1.equals("#")) {
				if(printResult) continue;
				else {
					if(w >= o * 2) System.out.println(i + " :-(");
					else if (w > (double)o / 2 && w < o * 2) System.out.println(i + " :-)");
					else System.out.println(i + " :-(");
					i++;
				}
			}
			// 새로운 챕터 시작
			else if(!temp1.equals("F") && !temp1.equals("E")) {
				o = Integer.parseInt(temp1);
				w = Integer.parseInt(temp2);
				printResult = false;
			}
			// 운동 식사
			else {
				if(temp1.equals("F")) w += Integer.parseInt(temp2);
				else {
					w -= Integer.parseInt(temp2);
					if(w <= 0) {
						System.out.println(i + " RIP");
						i++;
						printResult = true;
					}
				}
			}
		}
		sc.close();
    }
}
