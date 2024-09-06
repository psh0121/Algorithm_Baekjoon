import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int divideN = n / 10;
		String str = sc.next();

		int cnt = 0;

		for(int i = 0; i < str.length(); i += divideN) {
			String cutStr = str.substring(i, i+divideN);
			if(cutStr.contains("N")) continue;
			else cnt++;
		}

		System.out.println(cnt);
		sc.close();
    }
}
