import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String before = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z";
		String after = "D E F G H I J K L M N O P Q R S T U V W X Y Z A B C";

		String str = sc.next();
		String result = "";

		for(int i = 0; i < str.length(); i++) {
			int idx = after.indexOf(str.charAt(i));
			result += before.charAt(idx);
		}

		System.out.println(result);
		sc.close();
    }
}
