import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<Integer> set = new HashSet<>();
        int n = read();
        while (n-- > 0) {
            read();
            set.add(read());
        }

        bw.write(String.valueOf(set.size()));
        bw.flush();
    }

    // 정수를 초고속으로 입력받기 위함
    private static int read() throws IOException {
        // System.in.read() - 1바이트(char)로 정수를 읽어옴
        // &15 - 숫자문자의 실제 숫자값을 얻을 수 있다
        int c, n = System.in.read() & 15;

        // 공백과 줄바꿈은 32이하이며 그 전까지는 값을 읽어드린다는 뜻
        while ((c = System.in.read()) > 32) {
            // n<<3 - n*8
            // n<<1 - n*2
            // n*10 + digit를 빠르게 계산하는 방식
            n = (n << 3) + (n << 1) + (c & 15);
        };

        return n;
    }

}