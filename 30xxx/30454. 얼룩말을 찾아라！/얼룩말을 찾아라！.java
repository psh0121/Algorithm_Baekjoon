import java.util.Scanner;

public class Main {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		// 0-w, 1-b
		int n = sc.nextInt();
		int l = sc.nextInt();

		int maxLine = 0;
		int cnt = 0;

		for(int i = 0; i < n; i++) {
			String[] body = sc.next().split("0");
			int line = 0;

			for(int j = 0; j < body.length; j++) {
				if(body[j].contains("1")) line++;
			}

			if(maxLine == line) {
				cnt++;
			}
			else if (line > maxLine) {
				maxLine = line;
				cnt = 1;
			}
		}

		System.out.println(maxLine + " " + cnt);

		sc.close();
    }
}