import java.util.ArrayList;
import java.util.Scanner;

public class P14730 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            int c=scanner.nextInt();//계수
            int k=scanner.nextInt();//차수
            int fxresult=c*k;
            arrayList.add(fxresult);
        }
        int sum=0;
        for (int x:arrayList)
        {
            sum+=x;
        }
        System.out.println(sum);

    }
}
