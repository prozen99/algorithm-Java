import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P31994_2 {
    public static void main(String[] args) {
        Map<String, Integer> seminarMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // 7개의 세미나 이름과 신청자 수를 입력받아 맵에 저장
        for (int i = 0; i < 7; i++) {
            String seminarName = scanner.next();
            int applicantCount = scanner.nextInt();
            seminarMap.put(seminarName, applicantCount);
        }

        // 대강당을 사용할 세미나 이름과 최대 신청자 수를 추적
        String maxSeminar = "";
        int maxApplicants = 0;

        // 맵을 순회하면서 최대 신청자 수를 가진 세미나를 찾음
        for (Map.Entry<String, Integer> entry : seminarMap.entrySet()) {
            if (entry.getValue() > maxApplicants) {
                maxSeminar = entry.getKey();
                maxApplicants = entry.getValue();
            }
        }

        // 최대 신청자 수를 가진 세미나 이름을 출력
        System.out.println(maxSeminar);
    }
    }

