package Problem;

import java.util.List;

public class Problem7 {

    /** 24
     * 주어진 정수 리스트에 특정 요소가 존재하는지 확인합니다.
     *
     * @param numbers 정수 리스트
     * @param number 찾고자 하는 정수
     * @return 주어진 정수가 리스트에 존재하면 true, 그렇지 않으면 false
     */
    public static boolean containsNumber(List<Integer> numbers, int number) {
        // 여기에 코드 작성
        return numbers.stream().anyMatch(num -> num.equals(number));
    }

    /**
     * 주어진 정수 리스트의 모든 요소가 짝수인지 확인합니다.
     *
     * @param numbers 정수 리스트
     * @return 모든 요소가 짝수이면 true, 그렇지 않으면 false
     */
    public static boolean areAllEven(List<Integer> numbers) {
        // 여기에 코드 작성
        return numbers.stream().allMatch(num -> num % 2 == 0);
    }
}
