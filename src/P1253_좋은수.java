import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
    좋은수 구하기 :
 */
public class P1253_좋은수 {
    public static void main(String[] args) throws NumberFormatException , IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(bf.readLine());
        int Result=0;
        long A[]=new long[N];
        StringTokenizer st=new StringTokenizer(bf.readLine());
        for (int i = 0; i < N; i++) {
            A[i]=Long.parseLong(st.nextToken());
        }
        Arrays.sort(A);
        for (int k = 0; k < N; k++) {
            long find=A[k];
            int i=0;
            int j=N-1;
            while(i<j)
            {

                if(A[i]+A[j]==find)
                {
                    if(i!=k && j!=k)// 포인터가 시작에서 오거나 끝부분에서 올수 있기때문에 같은경우 제거
                    {
                        Result++;
                        break;
                    }else if(i==k)
                    {
                        i++;
                    }else if(j==k)
                    {
                        j--;
                    }
                }else if (A[i]+A[j]<find)
                {
                    i++;
                }else{
                    j--;
                }

            }
        }
        System.out.println(Result);
        bf.close();
    }
    }
