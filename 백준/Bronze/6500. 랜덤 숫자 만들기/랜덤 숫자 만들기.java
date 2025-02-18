import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int a0 = sc.nextInt();
            if(a0 == 0) break;

            Set<Integer> seenNumbers = new HashSet<>(); // 중복 확인용
            int current = a0;

            while (!seenNumbers.contains(current)) {
                seenNumbers.add(current);

                // 숫자 제곱하고 가운데 4자리를 추출한다
                int calCurrent = current * current;
                // 수를 0을 포함해 8자리로 만들도록한다
                String calCurrentStr = String.format("%08d", calCurrent);
                current = Integer.parseInt(calCurrentStr.substring(2, 6));
            }

            System.out.println(seenNumbers.size());
        }
        sc.close();
    }
}
