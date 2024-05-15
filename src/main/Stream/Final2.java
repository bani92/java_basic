package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Final2 {
    public static void main(String[] args) {

        /**
         * Optional 클래스는 null-safe한 연산을 수행
         * of() 메서드를 사용하여 "Hello" 문자열을 감싼 Optional 객체를 생성
         * 객체가 비어있는지 확인한 후 get() 메서드를 사용하여 출력
         */
        Optional<String> optional = Optional.of("Hello");
        if(optional.isPresent()) {
            String result = optional.get();
            System.out.println(result);
        } else {
            System.out.println("No value");
        }

        /**
         * toArray() 메서드를 사용하여 스트림을 배열로 변환
         * List -> Stream -> Array
         */
        List<String> list = Arrays.asList("apple", "banana", "cherry");
        String[] array = list.stream().toArray(String[]::new);
        System.out.println(Arrays.toString(array));

        /**
         * foreach()
         */
        List<Integer> list2 = Arrays.asList(1,2,3,4,5);
        list2.forEach(System.out::print);

        /**
         * mapToInt로 Integer -> int로 변환
         * sum() 메서드를 사용하여 합
         */
        List<Integer> list3 = Arrays.asList(1,2,3,4,5);
        int sum = list3.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        /**
         * distinct() 중복제거
         */
        List<Integer> list4 = Arrays.asList(1,2,3,4,5,5,2,1);
        List<Integer> collect = list4.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);

        /**
         *  Map 객체에 조건에 맞는 요소와 아닌 요소를 따로따로 저장
         */
        List<Integer> list5 = Arrays.asList(1,2,3,4,5);
        Map<Boolean, List<Integer>> partitioned = list5.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
        System.out.println(partitioned);

        /**
         * List -> 스트림 -> List
         */
        List<Integer> list6 = Arrays.asList(5, 3, 2, 1, 4);
        List<Integer> sorted = list6.stream().sorted().collect(Collectors.toList());;
        System.out.println(sorted);


    }
}
