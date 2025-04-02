import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		String maxSubstr = "";

		for(int i = 0; i < str.length(); i++) {
			String curSubstr = str.substring(i);

			if(curSubstr.compareTo(maxSubstr) > 0) {
				maxSubstr = curSubstr;
			}
		}

		System.out.println(maxSubstr);
		sc.close();
    }
}
