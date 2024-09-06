import java.util.Scanner;

public class P17618 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int count=0;
        for (int i = 1; i <=n ; i++) {
            int sum=0;
           String s=String.valueOf(i);//i값을 문자열로 바꿔줌
            for (int j = 0; j <s.length() ; j++) {
                sum+=s.charAt(j)-'0';
            }
          if(i%sum==0)
          {
              count++;
          }
        }
        System.out.println(count);

    }
}
