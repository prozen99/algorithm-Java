import java.util.Arrays;
import java.util.Scanner;

public class P2475 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int []arr=new int[5];//고유번호
        for (int i = 0; i <5 ; i++) {
            arr[i]=scanner.nextInt();
        }
        int validateNumber=Arrays.stream(arr)
                        .map(n->n*n)//각 숫자를 제곱
                        .sum()%10;
        System.out.println(validateNumber);
    }
}
