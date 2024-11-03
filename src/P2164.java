import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class P2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        Queue<Integer> queue=new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.offer(i+1);
        }//
        while(true)
        {
            if(queue.size()==1)//마지막 남는원소
            {
                break;
            }
            queue.poll();//n=4라면 234 남고
            int pollvalue=queue.poll();
            queue.offer(pollvalue);
        }
        System.out.println(queue.peek());


    }
}
