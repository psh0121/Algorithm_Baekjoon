import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	String binaryNum = sc.next();
    	
    	// 2진법 -> 10진법
    	BigInteger num10 = new BigInteger("0");
    	BigInteger num2 = new BigInteger("1");	// 2씩 곱할예정 
    	
    	for(int i = binaryNum.length()-1; i >= 0; i--) {
    		BigInteger gobNum = BigInteger.valueOf(Character.getNumericValue(binaryNum.charAt(i))).multiply(num2);
    		num10 = num10.add(gobNum);
    		num2 = num2.multiply(new BigInteger("2"));
    	}
    	
    	// num10에 17 곱하기 
    	num10 = num10.multiply(new BigInteger("17"));
    	
    	// num10 2진법으로 다시 변경하기 
    	String result = "";
    	
    	while(num10.compareTo(new BigInteger("1")) != 0) {
    		result = num10.remainder(new BigInteger("2")) + result;
    		num10 = num10.divide(new BigInteger("2"));
    	}
    	
    	result = "1" + result;
    	System.out.println(result);
    	sc.close();
    }
}