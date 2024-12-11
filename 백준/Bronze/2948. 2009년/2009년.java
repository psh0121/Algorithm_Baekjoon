import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int y = 2009;
		int d = sc.nextInt();
		int m = sc.nextInt();

		LocalDate date = LocalDate.of(y, m, d);
		DayOfWeek dayofweek = date.getDayOfWeek();

		switch (dayofweek) {
			case SUNDAY:
				System.out.println("Sunday");
				break;

			case MONDAY:
				System.out.println("Monday");
				break;

			case TUESDAY:
				System.out.println("Tuesday");
				break;

			case WEDNESDAY:
				System.out.println("Wednesday");
				break;

			case THURSDAY:
				System.out.println("Thursday");
				break;
			case FRIDAY:
				System.out.println("Friday");
				break;
		
			default:
				System.out.println("Saturday");
				break;
		}

		sc.close();
    }
}
