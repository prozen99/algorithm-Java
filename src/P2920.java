import java.util.Scanner;

public class P2920 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArr = new int[8];
        for (int i = 0; i < 8; i++) {
            intArr[i] = scanner.nextInt();
        }
        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < 8; i++) { //1부터8까지 서칭하는동안
            if (intArr[i] != i + 1) {
                ascending = false;
            }
            if (intArr[i] != 8 - i) {
                descending = false;
            }

        }
        if(ascending)
        {
            System.out.println("ascending");
        }else if(descending)
        {
            System.out.println("descending");
        }else {
            System.out.println("mixed");
        }


    }
}
