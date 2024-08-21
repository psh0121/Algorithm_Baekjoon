import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] possibleCnt = new int[5];

		for(int i = 0; i < n; i++) {
			String value = sc.next();

			for(int j = 0; j < 5; j++) {
				if(value.charAt(j) == 'Y') possibleCnt[j]++;
			}
		}

		// max value find
		int maxCnt = 0;
		for(int i = 0; i < possibleCnt.length; i++) {
			if(possibleCnt[i] > maxCnt) maxCnt = possibleCnt[i];
		}

		String result = "";

		for(int i = 0; i < possibleCnt.length; i++) {
			if(possibleCnt[i] == maxCnt) {
				if(result.length() == 0) {
					result += (i+1);
				}
				else {
					result += "," + (i+1);
				}
			}
		}

		System.out.println(result);
		sc.close();
    }
}
