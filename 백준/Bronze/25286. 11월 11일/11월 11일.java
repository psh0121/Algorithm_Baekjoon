import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		int[] maxDate = { 0,
			31, 28, 31, 30,
			31, 30, 31, 31,
			30, 31, 30, 31
		};

		for(int i = 0; i < t; i++) {
			int year = sc.nextInt();
			int month = sc.nextInt();

			int newYear = 0;
			int newMonth = 0;
			int newDay = 0;

			if(month == 1) {
				newYear = year - 1;
				newMonth = 12;
				newDay = 31;
			}
			else if (month == 3) {
				newYear = year;
				newMonth = 2;

				if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
					newDay = 29;
				}
				else newDay = 28;
			}
			else {
				newYear = year;
				newMonth = month - 1;
				newDay = maxDate[newMonth];
			}

			System.out.printf("%d %d %d\n", newYear, newMonth, newDay);
		}

		sc.close();
    }
}