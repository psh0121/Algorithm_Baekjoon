import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		String str = sc.next();

		for(int i = 1; i < str.length(); i++) {
			String str1 = str.substring(0, i);
			String str2 = str.substring(i, str.length());

			StringBuilder sbStr1 = new StringBuilder(str1);
			StringBuilder sbStr2 = new StringBuilder(str2);

			String reverseStr1 = sbStr1.reverse().toString();
			String reverseStr2 = sbStr2.reverse().toString();

			if (str1.equals(reverseStr1) && str2.equals(reverseStr2)) {
				System.out.println(str1 + " " + str2);
				return;
			}
		}

		System.out.println("NO");
		sc.close();
    }
}
