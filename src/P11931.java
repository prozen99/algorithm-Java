import java.io.*;
import java.util.*;

public class P11931 {


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(bufferedReader.readLine());
        Integer []arr=new Integer[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=Integer.parseInt(bufferedReader.readLine());
        }
        Arrays.sort(arr,new Comparator<Integer>()
        {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        for (int x:arr)
        {
            bufferedWriter.write(x+"\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();



    }
}
