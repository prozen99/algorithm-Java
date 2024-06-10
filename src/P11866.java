import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P11866 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        Queue<Integer> queue=new LinkedList<>();
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            queue.offer(i+1);//queue에 그럼 1 2 3 4 5 6 7 이 들어가있음.
        }
        while(!queue.isEmpty())//queue 안비어있을때까지.
        {
            for (int i = 0; i <k-1 ; i++) {
                queue.offer(queue.poll());
            }

            arrayList.add(queue.poll());

        }
        System.out.print("<");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i));//값을 하나씩 출력
            if(i<arrayList.size()-1)//크기가 하나작을때까지 . 출력
            {
                System.out.print(","+" ");
            }
        }
        System.out.print(">");

    }
}
