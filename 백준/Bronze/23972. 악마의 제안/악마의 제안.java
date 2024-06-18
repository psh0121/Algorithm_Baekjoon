import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		Long k = sc.nextLong();	// 악마한테 줄돈
		Long n = sc.nextLong(); // 악마가 제안한 배수

		if(n == 1) System.out.println(-1);
		else {
			long multiplyNK = n * k;
			long minusn1 = n - 1;

			long minMoney = multiplyNK / minusn1;

			if(multiplyNK % minusn1 != 0) minMoney++;

			System.out.println(minMoney);
		}
		sc.close();
    }
}