import java.util.LinkedList;
import java.util.Scanner;

public class P10845 {
    static LinkedList<Integer> queue = new LinkedList<>();

    public static void push(String input) {
        queue.offer(Integer.parseInt(input));
    }

    public static void pop() {
        if(queue.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(queue.poll());
        }
    }

    public static void size() {
        System.out.println(queue.size());
    }

    public static void empty() {
        if(queue.isEmpty()) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    public static void front() {
        if(queue.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(queue.peek());
        }
    }

    public static void back() {
        if(queue.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(queue.getLast());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 소비

        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            String[] input = s.split(" ");

            switch(input[0]) {
                case "push":
                    push(input[1]);
                    break;
                case "pop":
                    pop();
                    break;
                case "size":
                    size();
                    break;
                case "empty":
                    empty();
                    break;
                case "front":
                    front();
                    break;
                case "back":
                    back();
                    break;
            }
        }
        scanner.close();
    }
}
