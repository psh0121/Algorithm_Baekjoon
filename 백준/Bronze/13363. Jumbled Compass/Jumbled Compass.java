import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		int rightDirect = (n2 - n1 + 360) % 360;	// 정방향
		int reverseDirect = (n1 - n2 + 360) % 360;	// 역방향
		
		if(rightDirect <= reverseDirect) {
			System.out.println(rightDirect);
		}
		else {
			System.out.println(-reverseDirect);
		}


		sc.close();
    }
}