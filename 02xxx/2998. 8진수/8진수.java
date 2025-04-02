import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String[] octalArr = {"000", "001", "010", "011", "100", "101", "110", "111"};
		String binaryString = sc.next();
		binaryString = "0".repeat(binaryString.length() % 3 == 0 ? 0 : 3 - (binaryString.length() % 3)) + binaryString;

		String octalString = "";

		for(int i = 0; i <= binaryString.length() - 3; i+=3) {
			String subStr = binaryString.substring(i, i+3);

			for(int j = 0; j < octalArr.length; j++) {
				if(octalArr[j].equals(subStr)) {
					octalString += j;
					break;
				}
			}
		}

		System.out.println(octalString);

		sc.close();
    }
}
