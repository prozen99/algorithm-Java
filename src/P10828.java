import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P10828 {
    private final Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) throws IOException {
        P10828 p = new P10828();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine().trim());

        for (int i = 0; i < n; i++) {
            String command = br.readLine().trim();
            String[] parts = command.split(" ");

            switch (parts[0]) {
                case "push":
                    p.pushX(Integer.parseInt(parts[1]));
                    break;
                case "pop":
                    sb.append(p.pop()).append('\n');
                    break;
                case "size":
                    sb.append(p.size()).append('\n');
                    break;
                case "empty":
                    sb.append(p.empty()).append('\n');
                    break;
                case "top":
                    sb.append(p.top()).append('\n');
                    break;
            }
        }

        // 모든 출력을 한 번에 처리합니다.
        System.out.print(sb.toString());
    }

    public void pushX(int X) {
        stack.push(X);
    }

    public int pop() {
        if (stack.isEmpty()) {
            return -1;
        } else {
            return stack.pop();
        }
    }

    public int size() {
        return stack.size();
    }

    public int empty() {
        return stack.isEmpty() ? 1 : 0;
    }

    public int top() {
        if (stack.isEmpty()) {
            return -1;
        } else {
            return stack.peek();
        }
    }
}
