import java.util.Scanner;

public class P11659sum {

    /*
        구간합 구하기 .
     */
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
      int n1=scanner.nextInt();//5
      int n2=scanner.nextInt();//3
      int []a=new int[n1+1];
      int []s=new int[n1+1];
      int []t=new int[n1];//정답을 저장할 배열

      //sum=sum+a  0+3 3 3+3 6

        for (int i = 1; i <= n1; i++) { //1 2 3 4
            a[i]=scanner.nextInt(); // 값을 입력받기 5 4 3 2 1
            //a[1]=5 a[2]=4 a[3]=3 a[2]=2 a[1]=1
            s[i]=s[i-1]+a[i];//합배열 완성

        }//합배열 다구했음.

        //0 1 2 3 4      실제로 1 2 3 4 5
        for (int i = 0; i < n2; i++) {
            int k1=scanner.nextInt();//1
            int k2=scanner.nextInt();//3

            System.out.println(s[k2]-s[k1-1]); //s[3] -s[0] = a[1] a[2] a[3]
            //현재 i가 1부터 시작해서 a[1] a[2] a[3] = 5 4 3 이니까 12
            // a[0] s[0] =0인채로 남겨 두는거임

        }


            //구간합 공식 (만약 1~5까지면)S[5] =a[0] a[1] a[2] a[3] a[4] a[5]
            //          S[0]=a[0]       s[5] - s[0] = s[j] - s[i-1]


        }


    }

