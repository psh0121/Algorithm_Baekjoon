import java.util.Scanner;

public class Main {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		// s - 소세지 , t - 떡
		int n = sc.nextInt();
		String str = sc.next();
		int cnt = 0;

		for(int i = 0; i < n / 2; i++) {
			if(str.charAt(i) != str.charAt(n - 1 - i)) cnt++;
		}

		System.out.println(cnt);
		sc.close();
    }
}