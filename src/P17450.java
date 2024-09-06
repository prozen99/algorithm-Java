import java.util.Scanner;

public class P17450 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] s={scanner.nextInt(),scanner.nextInt()};//가격 무게 순서
        int[] n={scanner.nextInt(),scanner.nextInt()};
        int[] u={scanner.nextInt(),scanner.nextInt()};
        double sweight;
        double nweight;
        double uweight;
        if(s[0]*10>=5000)
        {
            sweight=(s[1]*10.0)/(s[0]*10-500);
        }else{
            sweight=(s[1]*10.0)/(s[0]*10);
        }
        if(n[0]*10>=5000){
            nweight=(n[1]*10.0)/(n[0]*10-500);
        }else{
            nweight=(n[1]*10.0)/(n[0]*10);
        }
        if(u[0]*10>=5000)
        {
            uweight=(u[1]*10.0)/(u[0]*10-500);
        }else{
            uweight=(u[1]*10.0)/(u[0]*10);
        }


        if(sweight>nweight&&sweight>uweight)
        {
            System.out.println("S");
        }
        if(nweight>sweight&&nweight>uweight)
        {
            System.out.println("N");
        }
        if(uweight>sweight&&uweight>nweight)
        {
            System.out.println("U");
        }

    }
}
