import java.util.Scanner;
import java.util.Stack;

public class P9012_괄호 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();
        for (int t = 0; t < T; t++) {
            Stack<Character> stack = new Stack<>();
            String s = scanner.next();


            for (char c : s.toCharArray()) {
                if (c == '(') {
                    stack.push(c);
                } else if (c == ')') {
                    if (stack.isEmpty()) {
                        stack.push(c);
                        break;
                    }
                    stack.pop();
                }
            }

            if (  stack.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}