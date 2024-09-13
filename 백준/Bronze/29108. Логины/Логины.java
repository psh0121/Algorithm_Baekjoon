import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String id = sc.next();

		if(id.length() < 3) {
			System.out.println("Incorrect");
			return;
		}

		if(id.substring(0, 2).equals("io")) {
			// 뒤에 값들이 숫자로 이루어져있는지 확인
			boolean isNumber = true;

			for(int i = 2; i < id.length(); i++) {
				if(!Character.isDigit(id.charAt(i))) {
					isNumber = false;
					break;
				}
			}

			if(isNumber) System.out.println("Correct");
			else System.out.println("Incorrect");
		}
		else System.out.println("Incorrect");
		sc.close();
    }
}
