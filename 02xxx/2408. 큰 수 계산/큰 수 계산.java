import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
  public static BigInteger customDivide(BigInteger num1, BigInteger num2) {
    BigInteger result = num1.divide(num2);
    BigInteger remainder = num1.remainder(num2);

    // 나머지가 있으면 내림처리
    if(remainder.signum() != 0) {
      if(
        (num1.signum() < 0 && num2.signum() > 0) ||
        (num1.signum() > 0 && num2.signum() < 0)
      ) {
        result = result.subtract(BigInteger.ONE);
      }
    }

    return result;
  }
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    Stack<BigInteger> numbers = new Stack<>();
    Stack<String> operators = new Stack<>();

    numbers.push(sc.nextBigInteger());

    for(int i = 1; i < n; i++) {
      String operator = sc.next();
      BigInteger num = sc.nextBigInteger();

      BigInteger popNum = BigInteger.ZERO;
      
      if(operator.equals("*")) {
        popNum = numbers.pop();
        numbers.push(popNum.multiply(num));
      }
      else if(operator.equals("/")) {
        popNum = numbers.pop();
        numbers.push(customDivide(popNum, num));
      }
      else {
        numbers.push(num);
        operators.push(operator);
      }
    }

    ArrayList<BigInteger> numList = new ArrayList<>();
    ArrayList<String> operatorList = new ArrayList<>();

    while (!numbers.isEmpty()) {
      numList.add(0, numbers.pop());
    }
    while (!operators.isEmpty()) {
      operatorList.add(0, operators.pop());
    }

    BigInteger result = numList.get(0);

    for(int i = 0; i < operatorList.size(); i++) {
      BigInteger calNum = numList.get(i+1);
      String op = operatorList.get(i);

      if(op.equals("+")) {
        result = result.add(calNum);
      }
      else {
        result = result.subtract(calNum);
      }
    }

    System.out.println(result);
		sc.close();
    }
}
