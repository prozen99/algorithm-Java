import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P7568 {
    public static class Person {
        int height;//키
        int weight;//몸무게

        public Person(int height, int weight) {
            this.height = height;
            this.weight = weight;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Person[] person = new Person[n];
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int weight = Integer.parseInt(input[0]);
            int height = Integer.parseInt(input[1]);
            person[i] = new Person(height, weight);
        }
        int[] ranks = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 1;// A B C D E가 있을때 A 보다 덩치가 큰사람의 카운팅을 위한 변수
            for (int j = 0; j < n; j++) {
                if (i != j && person[i].weight < person[j].weight && person[i].height < person[j].height) {
                    count++;//카운트가 증가한다는건 등수가 밀린다는거임
                }
            }
            ranks[i] = count;

        }
        StringBuilder sb = new StringBuilder();
        for (int rank : ranks) {
            sb.append(rank).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
