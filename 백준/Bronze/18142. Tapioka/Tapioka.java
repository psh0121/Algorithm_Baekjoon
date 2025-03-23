import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // \\b(bubble|tapioka)\\b: 단어가 bubble, tapioka로 이루어져 있다면
        // \\s+ 하나이상의 공백(띄어쓰기, 탭, 줄바꿈)이 있다면
        String result = str.replaceAll("\\b(bubble|tapioka)\\b", "");
        result = result.replaceAll("\\s+", " ").trim();

        System.out.println(result.isEmpty() ? "nothing" : result);
        sc.close();
    }
}