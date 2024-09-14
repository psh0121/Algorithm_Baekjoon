import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int joi = 0;
		int ioi = 0;

		for(int i = 0; i <= str.length() - 3; i++) {
			String subStr = str.substring(i, i + 3);

			if(subStr.equals("JOI")) joi++;
			else if(subStr.equals("IOI")) ioi++;
		}

		System.out.println(joi);
		System.out.println(ioi);
		sc.close();
    }
}
