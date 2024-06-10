import java.lang.reflect.Array;
import java.util.*;

public class P10814 {
    static class Person implements Comparable<Person>{
        int age;
        String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public int compareTo(Person p) {
            if(this.age==p.age)
            {

            }
            return this.age-p.age;// 3 vs 5 ㅇㅇ 5가 더커요? 정렬 로직
            // 3 5  5 3  return 1 this.age 가 더크네 => 바꾼다.
            // 2
        }
    }



    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        List<Person> list=new ArrayList<>();
        int n=scanner.nextInt();
        for (int i = 0; i <n ; i++) {
            int age=scanner.nextInt();//나이
            String name=scanner.next();//이름
            list.add(new Person(age,name));
        }
        list.sort(Person::compareTo);//Person 클래스에 compareTo ::

        for(Person x:list)
        {
            System.out.println(x.age+" "+x.name);
        }



    }
}
