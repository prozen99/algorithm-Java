import java.util.Arrays;
import java.util.Scanner;

public class P11651 {
    public static class sort implements Comparable<sort> {
        private int x;//x좌표
        private int y;//y좌표

        public sort(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(sort o) {
            if(this.y==o.y)
            {
                return this.x-o.x;
            }else{
                return this.y-o.y;
            }

        }

        @Override
        public String toString() {
            return x+" "+y;
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        sort [] srt=new sort[n];
        for (int i = 0; i <n ; i++) {
         srt[i]=new sort(scanner.nextInt(),scanner.nextInt());
        }
        Arrays.sort(srt);
        for (sort s :srt)
        {
            System.out.println(s);
        }
    }
}
