import java.util.Scanner;
import java.util.Stack;

public class P10773_제로 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        Stack<Integer> stack=new Stack<>();
        int sum=0;
        for (int i = 0; i < n; i++) {
            int k=scanner.nextInt();
            if(k==0)
            {
                if(stack.isEmpty())
                {
                    break;// 정수가 0일 경우에 지울수 있는 수가 있음을 보장할 수있다.

                }
                else{
                    stack.pop();// 0을 입력받고 스택이 차있으면 값을 뺴줘야함.
                }
            }else{
                stack.push(k);
            }



        }
       while(!stack.isEmpty())
       {
           sum+=stack.pop();
       }
        System.out.println(sum);
    }
}
