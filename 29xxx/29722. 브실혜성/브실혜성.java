import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = sc.next().split("-");
		int year = Integer.parseInt(arr[0]);
		int month = Integer.parseInt(arr[1]);
		int day = Integer.parseInt(arr[2]);

		int plusDay = sc.nextInt();

		day += plusDay;

		while (day > 30) {
			day -= 30;
			month++;
		}

		while (month > 12) {
			month -= 12;
			year++;
		}

		System.out.print(year + "-");
		System.out.print(month < 10 ? "0" + month + "-" : month + "-");
		System.out.println(day < 10 ? "0" + day : day);
		sc.close();
    }
}