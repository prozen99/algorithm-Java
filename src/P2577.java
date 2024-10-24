import java.util.Scanner;

public class P2577 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        String s=String.valueOf(a*b*c);//결과값 문자열로 변환
        int [] result=new int[10]; // 0~9 니까 10개
        for (int i = 0; i <s.length() ; i++) {
            int index=s.charAt(i)-'0';//ex 17037300이라면
            result[index]+=1;//위치를 조작하는 방법 ! index값으로
        }
        for (int j : result) {
            System.out.println(j);
        }

    }
}
