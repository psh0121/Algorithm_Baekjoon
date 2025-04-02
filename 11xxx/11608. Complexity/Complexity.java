import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);

            if(!map.containsKey(letter)) map.put(letter, 1);
            else map.put(letter, map.get(letter) + 1);
        }

        if(map.size() <= 2) {
            System.out.println(0);
            return;
        }

        // hashMap 정렬 - list로 변환하고 Comparator를 사용해 value 기준 정렬
        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort(Map.Entry.comparingByValue());

        int cnt = 0;

        for(int i = 0; i < entryList.size() - 2; i++) {
            cnt += entryList.get(i).getValue();
        }

        System.out.println(cnt);
        sc.close();
    }
}
