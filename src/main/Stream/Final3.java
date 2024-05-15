package Stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Final3 {
    public static void main(String[] args) {

        /**
         *  flatMap 사용하여 각 문자열을 배열로 분할
         *  해당 요소들을 포함하는 새로운 스트림 생성
         *  중복을 제거한 후 List로 생성
         */
        List<String> words = Arrays.asList("hello","world");
        List<String> uniqueCharacters = words.stream().flatMap(s -> Arrays.stream(s.split("")))
                .distinct().collect(Collectors.toList());
        System.out.println(uniqueCharacters);

        /**
         * IntSummaryStatistics - 합, 평균, 최대값, 최소값, 개수 반환
         */
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        IntSummaryStatistics statistics = list.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println(statistics);

        /**
         * count()
         */
        List<Integer> list2 = Arrays.asList(1,2,3,4,5);
        long count = list2.stream().count();
        System.out.println(count);

        /**
         * 대문자로 변환하여 List로 반환
         */
        List<String> list3 = Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig");
        List<String> transList = list3.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(transList);

    }
}
