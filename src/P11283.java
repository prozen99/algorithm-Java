import java.util.Scanner;

public class P11283 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char hangul=scanner.nextLine().charAt(0);
        //첫번째 글자
        System.out.println((int)hangul-44031);
        //UTF-8 인코딩에서 한글 구하는법
        // 약간 배경지식 같은 느낌 !  44031을 뺴주면됨
    }
}
