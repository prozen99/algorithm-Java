import java.util.Scanner;

public class P10809 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next().toLowerCase();// 소문자열 입력받기
        //제일 중요한 부분부터 함
        int[] alphabet=new int[26];
        for (int i = 0; i <26; i++) {
            alphabet[i]=-1; // 배열의 값에 -1을 채움
        }
        //minsu 라고하면 m이 처음 나온 위치를 출력해야함
        for (int i = 0; i <s.length(); i++) {
            char c=s.charAt(i);//minsu라면 m이 먼저 이떄 위치 값을 알아야함
            int index=c-'a';
            if(alphabet[index]==-1)
            {
                alphabet[index]=i;
            }
        }
        for (int i = 0; i <alphabet.length ; i++) {
            System.out.print(alphabet[i]+" ");
        }

    }
    }

