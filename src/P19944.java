import java.sql.SQLOutput;
import java.util.Scanner;

public class P19944 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        if(m==1||m==2)
        {
            System.out.println("NEWBIE!");
        }else if(m<=n){
            System.out.println("OLDBIE!");
        }else{
            System.out.println("TLE!");
        }
    }
}
