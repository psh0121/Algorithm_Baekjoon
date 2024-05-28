import java.util.Scanner;

public class Main {

	public static int sumValue(int num) {
		String strNum = Integer.toString(num);
		int result = 0;

		for(int i = 0; i < strNum.length(); i++) {
			result += Integer.parseInt(Character.toString(strNum.charAt(i)));
		}
		
		return result;
	}
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int d = sc.nextInt();
		int x = sc.nextInt();

		for(int i = l; i <= d; i++) {
			if(sumValue(i) == x) {
				System.out.println(i);
				break;
			}
		}

		for(int i = d; i >= l; i--) {
			if(sumValue(i) == x) {
				System.out.println(i);
				break;
			}
		}

    	sc.close();
    }
}