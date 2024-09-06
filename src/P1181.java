import java.util.*;

public class P1181 {




    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        Set<String> stringSet=new HashSet<>();
        for (int i = 0; i <n ; i++) {
            stringSet.add(scanner.next());
        }
        //set에다가 일단 문자열 입력다하면 중복은 알아서 제거가 될건데
        //set의 문제점은 순서가 보장되지 않는다는 점임 따라서 list로 변환해줘야함
        ArrayList<String> arrayList=new ArrayList<>(stringSet);//stringset을 arraylist로 변환
        Collections.sort(arrayList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()==o2.length())//길이가 같으면 사전순 정렬이 필요함
                {
                    return o1.compareTo(o2);//사전순으로 정렬함
                    //s1.compareTo(s2)의 결과:
                    //s1이 s2보다 사전순으로 앞서면 음수를 반환합니다.
                    //s1이 s2보다 사전순으로 뒤에 있으면 양수를 반환합니다.
                    //s1이 s2와 동일한 경우에는 0을 반환합니다.
                }else{
                    return o1.length()-o2.length();//길이 기준으로 정렬
                }
            }
        });
        for(String  word:arrayList)
        {
            System.out.println(word);
        }


    }
}
