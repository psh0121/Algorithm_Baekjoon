import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int result = a * b * c;
		String strResult = Integer.toString(result);

		Map<String, Integer> map = new HashMap<>();
		for(int i = 0; i <= 9; i++) {
			map.put(Integer.toString(i), 0);
		}

		for(int i = 0; i < strResult.length(); i++) {
			char num = strResult.charAt(i);
			map.put(Character.toString(num), map.get(Character.toString(num)) + 1);
		}

		for(int i = 0; i <= 9; i++) {
			System.out.println(map.get(Integer.toString(i)));
		}
		sc.close();
    }
}
