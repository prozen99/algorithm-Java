import java.util.ArrayList;
import java.util.Scanner;

public class P1259 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            String s=scanner.next();
            boolean solution=true;
            if(s.equals("0"))
            {
                break;
            }
            char c[]=s.toCharArray();// 1 2 4 2 1
            for (int i = 0; i <c.length/2 ; i++) {
               if(c[i]!=c[c.length-i-1])
               {
                   solution=false;
               }

            }
            if(solution) System.out.println("yes");
            else System.out.println("no");
        }
        }


    }



