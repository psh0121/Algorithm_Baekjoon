import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer[] aArr = new Integer[n];
		Integer[] bArr = new Integer[n];

		for(int i = 0; i < n; i++) aArr[i] = sc.nextInt();
		for(int i = 0; i < n; i++) bArr[i] = sc.nextInt();

		int cnt = 0;

		for(int i = 0; i < n; i++) {
			if(aArr[i] > bArr[i]) cnt += aArr[i] - bArr[i];
		}

		System.out.println(cnt);

		sc.close();
    }
}