import java.util.Scanner;

public class P2884 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int h=scanner.nextInt();
        int m=scanner.nextInt();
        //10 10 = > 10시 10분이니까 45분 일찍 빼면 9시 25분
        //0 30 = >
        if(m-45>=0)
        {
            m=m-45;
            System.out.println(h+" "+m);
        }else{

            h=h-1;
            m=60+m-45;
            if(h<0)
            {
                h=23;
            }
            System.out.println(h+" "+m);
        }
    }
}
