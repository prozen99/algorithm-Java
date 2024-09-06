import java.util.Scanner;

public class P12871 {

    // 최대 공약수 (GCD) 계산 함수
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // 최소 공배수 (LCM) 계산 함수
    public static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s=scanner.next();//ab
        String t=scanner.next();///abcde

        int slen=s.length();
        int tlen=t.length();

        int lcmlen=lcm(slen,tlen);//2 5 니까 최소공배수는 10
        int gcdlen=gcd(slen,tlen);
        System.out.println(gcdlen);

        StringBuilder repeatedS=new StringBuilder();
        StringBuilder repeatedT=new StringBuilder();

        for (int i = 0; i <lcmlen/slen ; i++) {
            repeatedS.append(s);
        }

        for (int i = 0; i <lcmlen/tlen ; i++) {
            repeatedT.append(s);
        }

        if (repeatedS.toString().equals(repeatedT.toString()))
        {
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
