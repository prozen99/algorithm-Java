import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class P3052 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> set=new HashSet<>();
        for (int i = 0; i <10; i++) {
            set.add(scanner.nextInt()%42);
        }
        System.out.println(set.size());
    }
}
