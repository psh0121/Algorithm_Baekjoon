import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int sumMoney = 0;

		for(int i = 0; i < n; i++) {
			sumMoney += sc.nextInt();
		}

		System.out.println(sumMoney % 3 == 0 ? "yes" : "no");
		sc.close();
    }
}