import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String[] codeArr = {"-", "\\", "(", "@", "?", ">", "&", "%", "/"};

		while (sc.hasNext()) {
			long result = 0;
			String code = sc.next();
			if(code.equals("#")) break;

			for(int i = 0; i < code.length(); i++) {
				for(int j = 0; j < codeArr.length; j++) {
					if(Character.toString(code.charAt(i)).equals(codeArr[j])) {
						int num = j;
						if(j == 8) num = -1;

						result += num * Math.pow(8, code.length() - 1 - i);
					}
				}
			}

			System.out.println(result);
		}
		sc.close();
    }
}
