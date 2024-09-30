import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] round1 = sc.next().split(":");
		String[] round2 = sc.next().split(":");
		int a1 = Integer.parseInt(round1[0]);
		int b1 = Integer.parseInt(round1[1]);
		int a2 = Integer.parseInt(round2[1]);
		int b2 = Integer.parseInt(round2[0]);

		if(b2 <= a1 && a2 <= b1) System.out.println("YES");
		else System.out.println("NO");
		sc.close();
    }
}
