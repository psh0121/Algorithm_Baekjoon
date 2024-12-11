import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int i = 1;
		while (true) {
			String value = sc.nextLine();
			String[] arr = value.split(" ");
			if(arr[1].equals("E")) {
				break;
			}

			System.out.print("Case " + i + ": ");
			i++;

			int num1 = Integer.parseInt(arr[0]);
			int num2 = Integer.parseInt(arr[2]);

			if(arr[1].equals(">")) System.out.println(num1 > num2 ? "true" : "false");
			else if(arr[1].equals(">=")) System.out.println(num1 >= num2 ? "true" : "false");
			else if(arr[1].equals("<")) System.out.println(num1 < num2 ? "true" : "false");
			else if(arr[1].equals("<=")) System.out.println(num1 <= num2 ? "true" : "false");
			else if(arr[1].equals("==")) System.out.println(num1 == num2 ? "true" : "false");
			else System.out.println(num1 != num2 ? "true" : "false");
		}
		sc.close();
    }
}
