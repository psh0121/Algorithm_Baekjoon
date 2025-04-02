import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String shooting = sc.next();
		String[] directionArr = shooting.split("\\(\\^0\\^\\)");
		int left = 0;
		int right = 0;

		if(shooting.charAt(shooting.length() - 1) == ')') {
			for(int i = 0; i < shooting.length(); i++) {
				if(shooting.charAt(i) == '@') left++;
			}
		}

		else {
			for(int i = 0; i < directionArr[0].length(); i++) {
				if(directionArr[0].charAt(i) == '@') left++;
			}
	
			for(int i = 0; i < directionArr[1].length(); i++) {
				if(directionArr[1].charAt(i) == '@') right++;
			}
		}

		System.out.println(left + " " + right);

		sc.close();
    }
}
