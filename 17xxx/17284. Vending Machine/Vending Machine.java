import java.util.Scanner;

public class Main {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		String[] arr = sc.nextLine().split(" ");

		int money = 5000;

		for(int i = 0; i < arr.length; i++) {
			switch (arr[i]) {
				case "1":
					money -= 500;
					break;
				case "2":
					money -= 800;
					break;
				default:
					money -= 1000;
					break;
			}
		}

		System.out.println(money);
		sc.close();
    }
}