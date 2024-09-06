import java.util.Scanner;

public class P9366 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int []arr=new int[n];
        for (int i = 0; i <n ; i++) {
           int a=scanner.nextInt();
           int b=scanner.nextInt();
           int c=scanner.nextInt();
            if (a + b <= c || a + c <= b || b + c <= a) // 삼각형의 조건 두 각을 더했을 때 한 각보다 작으면 삼각형이 아님
            {
                System.out.printf("Case #%d: invalid!\n", i + 1);
                continue;
            }
            if (a == b && b == c) // 세 변의 길이가 같다면
            {
                System.out.printf("Case #%d: equilateral\n", i + 1);
            } else if (a == b || b == c || a == c) {
                System.out.printf("Case #%d: isosceles\n", i + 1);
            } else // scalene triangle
            {
                System.out.printf("Case #%d: scalene\n", i + 1);
            }
        }
    }
}
