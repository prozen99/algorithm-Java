import java.util.Scanner;
import java.util.Stack;

public class P1874 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack=new Stack<>();
        StringBuilder stringBuilder=new StringBuilder();
        boolean possible=true;
        int t=scanner.nextInt();//테스트 케이스
        int num=1;// 스택에 넣을값을 추적하기 위한 변수
        for (int i = 0; i <t ; i++) {
            int k=scanner.nextInt();//4 3 6 8 7 5 2 1 같은 수를 입력받음
            while(num<=k)
            {
                stack.push(num++);//1 2 3 4 푸시함 후위 연산자가 중요한 부분임 !
                stringBuilder.append("+\n");
            }
            if(stack.peek()==k)//목표값이랑 뺄 값이 같으면
            {
                stack.pop();
                stringBuilder.append("-\n");
            }else{ //목표값이랑 뺄값이 다르면
                System.out.println("NO");
                possible=false;
                break;
            }
        }
        if(possible)
        {
            System.out.println(stringBuilder);
        }


    }
}
