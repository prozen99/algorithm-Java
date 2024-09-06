import java.util.Arrays;
import java.util.Scanner;

public class P3181 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] ignoreWords = {"i", "pa", "te", "ni", "niti", "a", "ali", "nego", "no", "ili"};
        String s=scanner.nextLine().toLowerCase(); // 공백 들어가면 nextLine써줘야함.
        String [] s1=s.split(" ");
        boolean isfirst=true;// 첫번째 글자가 맞는지 check 하는 부분
        for(String word:s1)
        {
            if(isfirst||!Arrays.asList(ignoreWords).contains(word))
            {
                System.out.print(Character.toUpperCase(word.charAt(0)));
            }
            isfirst=false;
        }

    }
}
