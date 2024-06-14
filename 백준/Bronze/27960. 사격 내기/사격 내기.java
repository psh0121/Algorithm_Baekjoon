import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		int[] targetGrade = {512, 256, 128, 64, 32, 16, 8, 4, 2, 1};
		
		int[] aTarget = new int[targetGrade.length];
		int[] bTarget = new int[targetGrade.length];

		int aGrade = sc.nextInt();
		int bGrade = sc.nextInt();

		// 내가 쏜 점수 과녁에 표시하기
		for(int i = 0; i < targetGrade.length; i++) {
			if(aGrade >= targetGrade[i]) {
				aTarget[i] = 1;
				aGrade -= targetGrade[i];
			}

			if(bGrade >= targetGrade[i]) {
				bTarget[i] = 1;
				bGrade -= targetGrade[i];
			}
		}

		int cGrade = 0;

		// a, b의 점수를 확인하여 c의 점수 파악하기
		for(int i = 0; i < aTarget.length; i++) {
			if((aTarget[i] == 1 && bTarget[i] == 0) || (aTarget[i] == 0 && bTarget[i] == 1)) {
				cGrade += targetGrade[i];
			}
		}

		System.out.println(cGrade);

		sc.close();
    }
}