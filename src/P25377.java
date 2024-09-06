import java.util.ArrayList;
import java.util.Scanner;

public class P25377 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();//가게수 입력받기
        int [][]arr=new int[n][2];//n행 2열개 입력받기
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j]=scanner.nextInt();
            }
        }
        ArrayList<Integer> arrayList=new ArrayList<>();
        //A<B에 해당하는 행의 인덱스들만 저장하기 위한 자료구조
        for (int i = 0; i <n ; i++) {
            if(arr[i][0]<arr[i][1])//A <B 인경우 빵을 살수 있음
            {
                arrayList.add(i);
            }else if(arr[i][0]>arr[i][1])//빵을 살수 없는 경우
            {

            }
        }
        //최솟값 인덱스는 arrayList에 저장했으니까 이제 [1]열에
        // 있는 녀석들중에 최솟값 뽑으면 됨
        int min=arr[0][1];//최솟값 변수
        for (int x:arrayList) {
            if(arr[x][1]<min)
            {
                min=arr[x][1];
            }
        }
        if(arrayList.isEmpty())
        {
            System.out.println(-1);
        }else{
            System.out.println(min);
        }


    }
}
