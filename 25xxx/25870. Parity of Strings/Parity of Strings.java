import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		// 중복을 제외한 str 배열을 만든다.
		String pureStr = "";

		for(int i = 0; i < str.length(); i++) {
			if(!pureStr.contains(Character.toString(str.charAt(i)))) {
				pureStr += Character.toString(str.charAt(i));
			}
		}

		String[] pureStrArr = pureStr.split("");

		// 해당 문자들의 개수를 파악하는 배열을 만든다.
		int[] cntArr = new int[pureStrArr.length];

		for(int i = 0; i < pureStrArr.length; i++) {
			for(int j = 0; j < str.length(); j++) {
				if(pureStrArr[i].equals(Character.toString(str.charAt(j)))) {
					cntArr[i]++;
				}
			}
		}

		// 모두 짝수인지, 홀수인지, 아닌지를 파악해 결과를 내보낸다.
		String value = "";

		for(int i = 0; i < cntArr.length; i++) {
			if(i == 0) {
				if(cntArr[i] % 2 == 1) value = "odd";
				else value = "even";

				continue;
			}

			if(cntArr[i] % 2 == 1) {
				if(value.equals("odd")) continue;
				else {
					value = "strange";
					break;
				}
			}
			else {
				if(value.equals("even")) continue;
				else {
					value = "strange";
					break;
				}
			}
		}

		if(value.equals("odd")) System.out.println(1);
		else if(value.equals("even")) System.out.println(0);
		else System.out.println(2);

		sc.close(); 
    }
}
