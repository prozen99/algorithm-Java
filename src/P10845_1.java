import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class P10845_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> queue=new LinkedList<>();
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(br.readLine());
        for (int i = 0; i <n ; i++) {
            String s=br.readLine();
            String []input=s.split(" ");
            String cmd=input[0];
            switch (cmd)
            {
                case "push":
                    int value=Integer.parseInt(input[1]);
                    queue.offer(value);
                    break;
                case "pop":
                    if(queue.isEmpty())
                    {
                        sb.append(-1).append('\n');
                    }else{
                        sb.append(queue.poll()).append('\n');
                    }
                    break;
                case "size":
                    sb.append(queue.size()).append('\n');
                    break;
                case "empty":
                    if(queue.isEmpty())
                    {
                        sb.append(1).append('\n');
                    }else{
                        sb.append(0).append('\n');
                    }
                    break;
                case "front":
                    if(queue.isEmpty())
                    {
                        sb.append(-1).append('\n');
                    }else{
                        sb.append(queue.peek()).append('\n');
                    }
                    break;
                case "back":
                    if(queue.isEmpty())
                    {
                        sb.append(-1).append('\n');
                    }else{
                        sb.append(queue.getLast()).append('\n');
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}
