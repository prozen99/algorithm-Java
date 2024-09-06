import java.util.Scanner;

public class P1032 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        String s[]=new String[n];
        for (int i = 0; i <n ; i++) {
            s[i]=scanner.next();
        }
        //전체 순회해서 뭐가 비었는지 확인 !
       //파일 이름의 길이는 모두  같다
        //그래서 어차피 s[0].length만큼 돌려도 상관없음
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 0; i <s[0].length() ; i++) {
            char init=s[0].charAt(i);
            boolean allsame=true;
            for (int j = 1; j <n ; j++) {
                if(s[j].charAt(i)!=init)
                {
                    allsame=false;
                    break;
            }
        }
            if(allsame)
            {
                stringBuilder.append(init);
            } else {
                stringBuilder.append('?');
            }

        }
        System.out.println(stringBuilder.toString());



    }
}
