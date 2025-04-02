import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int f = sc.nextInt();

		// 1초에 몇도 돌아가는가?
		double oneSecDegree = 180 / (double)r;

		// f초 동안 총 회전한 각도
		double totalDegree = f * oneSecDegree;

		// 현재 각도
		double curDegree = totalDegree % 360;

		// 각도에 따른 위치값 출력
		if(curDegree >= 0 && curDegree < 90) System.out.println("up");
		else if(curDegree >= 90 && curDegree < 180) System.out.println("down");
		else if(curDegree >= 180 && curDegree < 270) System.out.println("down");
		else System.out.println("up");

        sc.close();
    }
}
