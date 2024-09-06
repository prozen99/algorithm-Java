import java.math.BigInteger;
import java.util.Scanner;

public class P13277 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        BigInteger a=scanner.nextBigInteger();
        BigInteger b=scanner.nextBigInteger();
        BigInteger multiple=a.multiply(b);
        System.out.println(multiple);

    }
}
