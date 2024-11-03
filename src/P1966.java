import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class P1966 {
    static class Document {
        int index;
        int priority;

        Document(int index, int priority) {
            this.index = index;
            this.priority = priority;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());  // 테스트케이스 수
        for (int i = 0; i < t; i++) {
            String[] s1 = br.readLine().split(" ");
            int n = Integer.parseInt(s1[0]);//문서의 개수
            int m = Integer.parseInt(s1[1]);//목표 문서의 위치
            String[] s2 = br.readLine().split(" ");//4 2 1 3 이라고하면
            //문서의 개수 만큼 => 우선순위가 있을테니까 j만큼 돌면된다
            Queue<Document> queue = new LinkedList<>();
            for (int j = 0; j < n; j++) {
                queue.offer(new Document(j, Integer.parseInt(s2[j])));
            }
            int printOrder = 0;
            while (!queue.isEmpty()) {
                Document current = queue.poll();//우선순위가 1 2 3 4 라하면
                //(0,1) (1,2) (2,3) (3,4) 이렇게 queue에 들어가있음 이 예시에서는 (0,1)이나옴
                boolean hasHigherPriority = false;
                //현재 문서보다 높은 중요도를 가진 문서가 있는지 확인
                for (Document doc : queue) {
                    if (doc.priority > current.priority) {
                        hasHigherPriority = true;
                        break;
                    }
                }
                if(hasHigherPriority)
                {
                    queue.offer(current);//중요도가 높은 문서가 있으면 현재 문서를 뒤로 넣음
                }else{
                    printOrder++;
                    if(current.index==m)
                    {
                        System.out.println(printOrder);
                        break;
                    }
                }


            }
        }

    }
}