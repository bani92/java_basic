package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Final {
    public static void main(String[] args) {

        /**
         * 스트림에서 요소 찾기
         * filter() 메서드를 사용하여 조건에 맞는 요소를 찾기
         * findFirst() 메서드를 사용하여 첫번째 요소를 찾기. Optional 인스턴스를 반환
         * isPresent() 메서드로 결과가 존재하는지 확인후 get() 메서드롤 결과를 가져옴
         */
        List<String> list = Arrays.asList("apple","banana","cherry");
        Optional<String> result = list.stream().filter(s -> s.startsWith("a")).findFirst();
        if(result.isPresent()) {
            System.out.println(result.get());
        }

        /**
         * collect() 메서드를 사용하여 스트림에서 추출한 요소를 컬렉션으로 수집합니다.
         * COllectros.toList() 메서드를 사용하여 리스트로 수집
         */
        List<String> list2 = Arrays.asList("apple","banana","cherry");
        List<String> result2 = list2.stream().filter(s -> s.startsWith("a")).collect(Collectors.toList());
        System.out.println(result2);


        /**
         * reduce() 메서드를 사용하여 list 스트림에서 모든 요소의 합을 계산
         * 메서드의 첫번째 인자는 초기값을 나타내며 두번째 인자는 각 요소를 처리하는 람다식
         */
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        int sum = numbers.stream().reduce(0,Integer::sum);
        System.out.println(sum);

        List<Integer> list3 = Arrays.asList(1,2,3,4,5);
        int sum2 = list3.stream().reduce(0, (a,b) -> a+b);
        System.out.println(sum2);


        /**
         * groupingBy() 메서드를 사용하여 요소를 그룹화
         * Person 클래스에서 나이를 가져오는 getAge() 메서드를 사용하여 그룹화를 수행
         */
        List<Person> people = Arrays.asList(
                new Person("John",25),
                new Person("Jane",30),
                new Person("Bob",25),
                new Person("Alice",30)
        );

        Map<Integer, List<Person>> result3 = people.stream().collect(Collectors.groupingBy(Person::getAge));
        System.out.println(result3);

        /**
         * parallelStream() 메서드를 사용하여 스트림을 병렬처리
         * 대용량 데이터를 빠르게 처리가능
         */
        List<String> list5 = Arrays.asList("apple", "abanana", "cherry", "date", "eggfruit");
        long count = list5.parallelStream().filter(s -> s.startsWith("a")).count();
        System.out.println(count);


    }
}
