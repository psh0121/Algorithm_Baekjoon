import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		String[][] value = {
			{"black", "1"},
			{"brown", "10"},
			{"red", "100"},
			{"orange", "1000"},
			{"yellow", "10000"},
			{"green", "100000"},
			{"blue", "1000000"},
			{"violet", "10000000"},
			{"grey", "100000000"},
			{"white", "1000000000"},
		};

		String color1 = sc.next();
		String color2 = sc.next();
		String color3 = sc.next();

		int cValue1 = 0;
		int cValue2 = 0;
		int cValue3 = 0;

		for(int i = 0; i < value.length; i++) {
			String color = value[i][0];

			if(color1.equals(color)) cValue1 = i;
			if(color2.equals(color)) cValue2 = i;
			if(color3.equals(color)) cValue3 = i;
		}

		int calValue = cValue1 * 10 + cValue2;

		System.out.println(new BigInteger(value[cValue3][1]).multiply(BigInteger.valueOf(calValue)));
		sc.close();
    }
}
