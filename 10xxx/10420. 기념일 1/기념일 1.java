import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int y = 2014;
    int m = 4;
    int d = 2;

    LocalDate startDate = LocalDate.of(y, m, d);
    LocalDate resultDate = startDate.plusDays(n - 1);

    System.out.println(resultDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));

		sc.close();
    }
}
