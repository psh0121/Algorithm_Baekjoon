import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int year = sc.nextInt();
			if(year == 0) break;

			if(year < 1896) {
				System.out.println(year + " No summer games");
				continue;
			}

			if(year % 4 == 0) {
				if((year >= 1914 && year <= 1918) ||
				(year >= 1939 && year <= 1945)) {
					System.out.println(year + " Games cancelled");
				}
				else if(year > 2020) {
					System.out.println(year + " No city yet chosen");
				}
				else System.out.println(year + " Summer Olympics");
			}
			else {
				System.out.println(year + " No summer games");
			}
		}
		sc.close();
    }
}
