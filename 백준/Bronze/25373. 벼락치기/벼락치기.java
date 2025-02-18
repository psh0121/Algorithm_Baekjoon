import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long result = 0;
        
        // 일주일을 다 채워도 되지 않는 경우를 예외조건으로 생각할 것
        // (1+2+3+4+5+6+7) = 28 미만인 경우
        if(n == 1) result = 1;
        else if(n <= 3) result = 2;
        else if(n <= 6) result = 3;
        else if(n <= 10) result = 4;
        else if(n <= 15) result = 5;
        else if(n <= 21) result = 6;
        
        // 일주일을 다 사용해야하는 경우
        // n을 1로 더해가며 7의 배수가 나올때까지 반복문을 돌린후 +3을해서 결과값을 출력한다
        else {
            long i = n;
            while (true) {
                if(i % 7 == 0) {
                    result = i / 7 + 3;
                    break;
                }
                i++;
            }
        }

        System.out.println(result);
        sc.close();
    }
}
