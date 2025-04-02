import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();

		String[] arr1;
		String[] arr2;

		if(str1.length() < str2.length()) {
			arr1 = str2.split("");
			arr2 = str1.split("");
		}
		else {
			arr1 = str1.split("");
			arr2 = str2.split("");
		}

		long result = (long)0;

		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr2.length; j++) {
				result += 1l * Integer.parseInt(arr1[i]) * Integer.parseInt(arr2[j]);
			}
		}

		System.out.println(result);

		sc.close();
    }
}
