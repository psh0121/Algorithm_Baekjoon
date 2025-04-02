import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
        }

        int oddCnt = 0;
        for(Character key : map.keySet()) {
            if(map.get(key) % 2 == 1) oddCnt++;
        }

        int strLen = str.length();
        int cnt = 0;

        while (true) {
            if(
                (strLen % 2 == 0 && oddCnt == 0) || 
                (strLen % 2 == 1 && oddCnt == 1)
            ) break;

            strLen--;
            oddCnt--;
            cnt++;
        }

        System.out.println(cnt);
        sc.close();
    }
}