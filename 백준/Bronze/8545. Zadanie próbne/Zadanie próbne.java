import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] arr = sc.next().split("");
		
		List<String> arrList = Arrays.asList(arr);
		Collections.reverse(arrList);
		
		System.out.println(String.join("", arrList));
	}
}