import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = "";

		for(int i = 0; i < n; i++) {
			String value = sc.next();

			if(str.length() == 0) {
				str += value;
				continue;
			}

			if(value.equals("Present!")) {
				str += "Present!";
			}
			else {
				str += " " + value;
			}
		}

		String[] arr = str.split(" ");

		// 결석자가 없는경우 확인하기
		boolean noAbsences = true;

		for(int i = 0; i < arr.length; i++) {
			if(arr[i].contains("Present!")) continue;
			else {
				System.out.println(arr[i]);
				noAbsences = false;
			}
		}

		if (noAbsences) {
			System.out.println("No Absences");
		}
        sc.close();
    }
}
