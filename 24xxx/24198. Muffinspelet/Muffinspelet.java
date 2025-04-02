import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int muffin = sc.nextInt();
		int val1 = 0;	// 승욱
		int val2 = 0;	// 예찬

		while (muffin > 0) {
			if(muffin % 2 == 1) {
				val2 += muffin / 2 + 1;
				muffin -= muffin / 2 + 1;
			}
			else {
				val2 += muffin / 2;
				muffin -= muffin / 2;
			}

			if(muffin == 0) break;

			if(muffin % 2 == 1) {
				val1 += muffin / 2 + 1;
				muffin -= muffin / 2 + 1;
			}
			else {
				val1 += muffin / 2;
				muffin -= muffin / 2;
			}
		}

		System.out.println(val1 + " " + val2);
        sc.close();
    }
}
