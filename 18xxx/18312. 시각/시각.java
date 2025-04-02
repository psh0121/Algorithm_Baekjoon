import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		int cnt = 0;

		for(int h = 0; h <= n; h++) {
			for(int m = 0; m <= 59; m++) {
				for(int s = 0; s <= 59; s++) {
					String strTime = "";
					if(h < 10) strTime += "0" + h;
					else strTime += h;

					if(m < 10) strTime += "0" + m;
					else strTime += m;

					if(s < 10) strTime += "0" + s;
					else strTime += s;

					if(strTime.contains(Integer.toString(k))) cnt++;
				}
			}
		}

		System.out.println(cnt);
		sc.close();
    }
}
