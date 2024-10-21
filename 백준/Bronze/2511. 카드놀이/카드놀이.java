import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		int[] b = new int[10];

		for(int i = 0; i < 10; i++) a[i] = sc.nextInt();
		for(int i = 0; i < 10; i++) b[i] = sc.nextInt();

		int pointA = 0;
		int pointB = 0;

		String lastWin = "D";

		for(int i = 0; i < 10; i++) {
			if(a[i] > b[i]){
				pointA += 3;
				lastWin = "A";
			}
			else if(a[i] == b[i]) {
				pointA += 1;
				pointB += 1;
			}
			else {
				pointB += 3;
				lastWin = "B";
			}
		}

		System.out.println(pointA + " " + pointB);
		
		if(pointA > pointB) System.out.println("A");
		else if(pointA == pointB) System.out.println(lastWin);
		else System.out.println("B");
		sc.close();
    }
}
