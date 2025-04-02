import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int nextOil = sc.nextInt();
		int curOil = sc.nextInt();
		
		int sumNextCurOil = curOil + 60;
		
		// 만약에 nextOil이 sumNextCurOil 보다 작거나 같으면  
		// nextOil에 1500 곱한 값 배출
		if(nextOil <= sumNextCurOil) System.out.println(nextOil * 1500);
		
		// 만약에 nextOil이 sumNextCurOil 보다 크면 
		// 기존 sumNextCurOil에 대한건 1500 곱하고 나머지 초과량은 3000을 곱해서 더한값을 배출 
		else System.out.println(sumNextCurOil * 1500 + (nextOil - sumNextCurOil) * 3000);
	}
}         