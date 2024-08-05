import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int an = Integer.parseInt(sc.nextLine());
		String[] a = sc.nextLine().split(" ");

		int bn = Integer.parseInt(sc.nextLine());
		String[] b = sc.nextLine().split(" ");

		int grade = 0;

		for(int i = 0; i < an; i++) {
			grade += Integer.parseInt(a[i]);

			for(int j = 0; j < bn; j++) {
				if(Integer.parseInt(b[j]) == grade) {
					grade = 0;
					break;
				}
			}
		}

		System.out.println(grade);
		sc.close(); 
    }
}
