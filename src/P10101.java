import java.util.Scanner;

public class P10101 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int []arr=new int[3];
        int sum=0;
        for (int i = 0; i < 3; i++) {
            arr[i]=scanner.nextInt();
            sum=sum+arr[i];
        }
        if(sum!=180)
        {
            System.out.println("Error");
        }else if(arr[0]==60&&arr[1]==60&&arr[2]==60)//모든각이 같은경우가 아니면
        {
            System.out.println("Equilateral");
        }else if(arr[0]==arr[1]||arr[0]==arr[2]||arr[1]==arr[2]){
//어차피 모든각이 같은경우를 제외했으니까 두각은 같은거임.  (최소 두각은 같음)
            System.out.println("Isosceles");
        }else
        {
            System.out.println("Scalene");
        }

    }
}
