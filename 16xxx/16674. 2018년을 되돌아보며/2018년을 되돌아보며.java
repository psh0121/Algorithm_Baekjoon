import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    String num = sc.next();

    // 0 - 관련없는
    // 1 - 관련 있는 수 이지만 밀접한 수가 아닌
    // 2 - 밀접한 수 이지만 묶여있는 수가 아닌
    // 8 - 묶여있는 
    int two = 0;
    int zero = 0;
    int one = 0;
    int eight = 0;

    for(int i = 0; i < num.length(); i++) {
      char letter = num.charAt(i);

      if(letter == '2') two++;
      else if(letter == '0') zero++;
      else if(letter == '1') one++;
      else if(letter == '8') eight++;
    }

    if(two+zero+one+eight != num.length()) System.out.println(0);
    else if(two == zero && zero == one && one == eight && eight == two) System.out.println(8);
    else if(two != 0 && zero != 0 && one != 0 && eight != 0) System.out.println(2);
    else System.out.println(1);

		sc.close();
    }
}
