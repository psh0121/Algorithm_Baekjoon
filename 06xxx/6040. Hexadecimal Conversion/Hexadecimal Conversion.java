import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static String changeNum8(String s) {
        StringBuilder sb = new StringBuilder();

        // 8진수는 3자리씩 묶어야하기 대문에 없는 만큼 0을 붙여준다
        while (s.length() % 3 != 0) {
            s = "0" + s;
        }

        // 3개씩 묶어서 8진수로 변환한다
        for(int i = 0; i < s.length(); i += 3) {
            int calValue = (s.charAt(i) - '0') * 4 +
                            (s.charAt(i+1) - '0') * 2 +
                            (s.charAt(i+2) - '0') * 1;
            sb.append(calValue);
        }

        return sb.toString();
    }

    public static String changeNum2(char c) {
        Map<Character, String> map = new HashMap<>();
        
        map.put('0', "0000");
        map.put('1', "0001");
        map.put('2', "0010");
        map.put('3', "0011");
        map.put('4', "0100");
        map.put('5', "0101");
        map.put('6', "0110");
        map.put('7', "0111");
        map.put('8', "1000");
        map.put('9', "1001");
        map.put('A', "1010");
        map.put('B', "1011");
        map.put('C', "1100");
        map.put('D', "1101");
        map.put('E', "1110");
        map.put('F', "1111");

        return map.get(c);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num16 = br.readLine().trim();    // 16진수

        // 16진수가 0이면 그냥 0을 출력한다
        if(num16.equals("0")) {
            System.out.println("0");
            return;
        }

        // 16진수를 2진수로 바꿔준다
        StringBuilder num2 = new StringBuilder();
        for(char c : num16.toCharArray()) {
            num2.append(changeNum2(c));
        }

        // 2진수를 8진수로 바꿔준다
        String num8 = changeNum8(num2.toString());

        // 앞쪽에 불필요한 0으로 제거한다
        System.out.println(num8.replaceFirst("^0+", ""));
    }
}