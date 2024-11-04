import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String jVH = sc.next();
		String jKey = sc.next();
		String iVH = sc.next();
		String iKey = sc.next();

		String result = "";

		for(int i = 0; i < n; i++) {
			char jValue = jVH.charAt(i);
			char iValue = iVH.charAt(i);

			if(jValue == iValue) {
				char jLetter = jKey.charAt(i);
				char iLetter = iKey.charAt(i);

				if(jLetter == iLetter) {
					result += jLetter;
				}
				else {
					System.out.println("htg!");
					return;
				}
			}
		}

		System.out.println(result);
		sc.close();
    }
}
