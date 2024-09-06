import java.util.Scanner;

public class P3028 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        //컵3개에서 공위치 찾기
        Boolean []arr={true,false,false};//공이 있는 위치가 true
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)=='A')//
            {
                boolean tmp=arr[0];
                arr[0]=arr[1];
                arr[1]=tmp;
            }
            if(s.charAt(i)=='B')
            {
                boolean tmp=arr[1];
                arr[1]=arr[2];
                arr[2]=tmp;
            }
            if(s.charAt(i)=='C')
            {
                boolean tmp=arr[0];
                arr[0]=arr[2];
                arr[2]=tmp;
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i])
            {
                System.out.println(i+1);
                return;
            }
        }
    }
}
