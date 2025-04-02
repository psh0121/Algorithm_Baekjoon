import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int mCnt = 0;
		int jCnt = 0;

		long mSum = 0;
		long jSum = 0;

		for(int i = 0; i < n; i++) {
			String letter = sc.next();

			if(letter.equals("M")) {
				mCnt++;
				mSum += sc.nextInt();
			}
			else {
				jCnt++;
				jSum += sc.nextInt();
			}
		}

		double mAvg = mCnt == 0 ? 0 : (double)mSum / mCnt;
		double jAvg = jCnt == 0 ? 0 : (double)jSum / jCnt;

		if(mAvg > jAvg) System.out.println("M");
		else if(mAvg == jAvg) System.out.println("V");
		else System.out.println("J");
		sc.close();
    }
}
