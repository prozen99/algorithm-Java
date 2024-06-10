import java.security.Key;
import java.util.*;

public class P2108 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int []arr=new int[n];
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i <n ; i++) {
            arr[i]=scanner.nextInt();
        }
        Arrays.sort(arr);
        //1. 산술평균
        double sum1=0.0;
        for (int i = 0; i <n ; i++) {
            sum1+=arr[i];
        }
        System.out.println(Math.round(sum1/n));
        //2.중앙값 => 증가하는 순서에서  그 중앙에 위치하는 값
        // -2 1 2 3 8  홀수니까 5/2 =2 의 인덱스값이 중앙값
        //1 2 3 4 5 6
        if(n%2==0)
        {
            System.out.println(arr[n/2]);
        }else{
            System.out.println(arr[n/2]);
        }
        //3. 최빈값 구하기
        //N개의 수중 가장 많이 나타나는값.
        // lt=>1 2 3 5 5라고하면 최빈값
        int maxcount=0;
        for (int num:arr)//키중에 제일 많이 발견된 최빈값 찾기
        {
            map.put(num,map.getOrDefault(num,0)+1);//빈도수 찾기
        }
        for(int key:map.values())//map의 값을 뽑아냄
        {
            maxcount=Math.max(maxcount,key);
        }
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int key: map.keySet())
        {
            if(map.get(key)==maxcount)
            {
                arrayList.add(key);// key값 넘기는거임 Map 자료 구조에서
            }
        }
        int mode=0;
        Collections.sort(arrayList);
        if(arrayList.size()>=2)
        {
            mode=arrayList.get(1);
        }
        else{
            mode=arrayList.get(0);
        }
        System.out.println(mode);



        //4.범위 N개의 수들 중 최댓값과 최솟값의 차이
        //-2 1 2 3 8
        int max=arr[0];
        int min=arr[0];
        for (int i = 0; i <n ; i++) {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            if(arr[i]<min)
            {
                min=arr[i];
            }

        }

        System.out.println(max-min);



    }
}
