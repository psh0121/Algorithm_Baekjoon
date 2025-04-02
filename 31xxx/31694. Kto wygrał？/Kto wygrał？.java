import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] algosia = new int[18];
		int[] bajtek = new int[18];

		for(int i = 0; i < 18; i++) algosia[i] = sc.nextInt();
		for(int i = 0; i < 18; i++) bajtek[i] = sc.nextInt();

		int algosiaSum = 0;
		int bajtekSum = 0;

		for(int i = 0; i < 18; i++) {
			algosiaSum += algosia[i];
			bajtekSum += bajtek[i];
		}

		if(algosiaSum > bajtekSum) System.out.println("Algosia");
		else if(algosiaSum < bajtekSum) System.out.println("Bajtek");
		else {
			String result = "remis";

			for(int i = 10; i > 0; i--) {
				int algosiaCnt = 0;
				int bajtekCnt = 0;

				for(int j = 0; j < 18; j++) {
					if(algosia[j] == i) algosiaCnt++;
					if(bajtek[j] == i) bajtekCnt++;
				}

				if(algosiaCnt > bajtekCnt) {
					System.out.println("Algosia");
					return;
				}
				else if(algosiaCnt < bajtekCnt) {
					System.out.println("Bajtek");
					return;
				}

			}

			System.out.println(result);
		}
		sc.close();
    }
}
