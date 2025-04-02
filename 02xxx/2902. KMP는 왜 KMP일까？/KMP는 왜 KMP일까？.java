import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] name = sc.next().split("-");
		String result = "";

		for(int i = 0; i < name.length; i++) {
			result += name[i].charAt(0);
		}

		System.out.println(result);
		sc.close();
    }
}
