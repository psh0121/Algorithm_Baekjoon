import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);

		String maxName = "";
		int maxCnt = Integer.MIN_VALUE;
		
		while (sc.hasNext()) {
			String name = sc.next();
			int cnt = sc.nextInt();

			if(cnt > maxCnt) {
				maxName = name;
				maxCnt = cnt;
			}
		}

		System.out.println(maxName);
		sc.close();
    }
}