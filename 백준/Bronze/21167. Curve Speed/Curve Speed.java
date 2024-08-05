import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// v - 마일 당 시간으로 나타낸 최대 속도
		// r - 피트 단위의 곡선 반경
		// s - 횡단경사

		while (sc.hasNext()) {
			double r = sc.nextDouble();
			double s = sc.nextDouble();

			double v = Math.sqrt((r * (s + 0.16)) / 0.067);

			System.out.println(Math.round(v));
		}
		sc.close(); 
    }
}
