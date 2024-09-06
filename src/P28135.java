import java.util.Scanner;

public class P28135 {
    public static void main(String[] args) {
        //50 = > 50번째인데
        //52 = > 53번쨰에 등장하는거임 50이들어가면 한번더 세니까
        // = > 50이 들어가면 한번더 count를 하는거지
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int extraCount = 0;

        for (int i = 1; i < n; i++) {
            if (String.valueOf(i).contains("50")) {
                extraCount++;
            }
        }

        int result = n + extraCount;
        System.out.println(result);
}
}
