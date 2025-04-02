import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] sizeArr = new int[6];
		for(int i = 0; i < 6; i++) sizeArr[i] = sc.nextInt();

		int t = sc.nextInt();
		int p = sc.nextInt();

		int tshirtCnt = 0;
		int penCnt = 0;
		int onePenCnt = 0;

		// 티셔츠 묶음개수 파악하기 
		for(int i = 0; i < 6; i++) {
			tshirtCnt += Math.ceil((double)sizeArr[i] / t);
		}

		penCnt = n / p;
		onePenCnt = n % p;

		System.out.printf("%d\n%d %d", tshirtCnt, penCnt, onePenCnt);
		
		sc.close();
    }
}