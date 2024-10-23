import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class P1340 {
    public static void main(String[] args) throws ParseException {
       Scanner scanner=new Scanner(System.in);

       String monthStr=scanner.next();
       int day= scanner.nextInt();
       scanner.next();
       int year= scanner.nextInt();
       String time=scanner.next();
       scanner.close();
       //날짜 문자열 생성
       String dateStr=monthStr+" "+day+", "+year+" "+time;
       //날짜 파싱
        SimpleDateFormat sdf=new SimpleDateFormat("MMMM d, yyyy HH:mm", Locale.US);
        Date date=sdf.parse(dateStr);
        String startStr = "January 1, " + year + " 00:00";
        String endStr = "January 1, " + (year + 1) + " 00:00";

        Date startDate=sdf.parse(startStr);
        Date endDate = sdf.parse(endStr);

        // 전체 시간 계산
        long totalTime = endDate.getTime() - startDate.getTime();
        long passedTime = date.getTime() - startDate.getTime();

        // 퍼센트 계산
        double percentage = (double) passedTime / totalTime * 100.0;

        System.out.printf("%.15f", percentage);

    }
}
