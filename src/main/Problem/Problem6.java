package Problem;

import java.util.*;
import java.util.stream.Collectors;

public class Problem6 {

    /**
     * 주어진 정수 리스트의 각 요소를 문자열로 변환하여 새로운 리스트를 반환합니다.
     *
     * @param numbers 정수 리스트
     * @return 변환된 문자열 리스트
     */
    public static List<String> convertToStringList(List<Integer> numbers) {
        // 여기에 코드 작성
        // return  numbers.stream().map(number -> number.toString()).toList();
        return numbers.stream().map(Object::toString).toList();
    }

    /**
     * 주어진 문자열 리스트의 각 요소를 대문자로 변환하여 새로운 리스트를 반환합니다.
     *
     * @param strings 문자열 리스트
     * @return 대문자로 변환된 문자열 리스트
     */
    public static List<String> convertToUpperCase(List<String> strings) {

        // 여기에 코드 작성
        // return strings.stream().map(number -> number.toUpperCase()).toList();
        return strings.stream().map(String::toUpperCase).toList();
    }

    /**
     * 주어진 문자열 리스트의 각 요소의 길이를 계산하여 새로운 리스트를 반환합니다.
     *
     * @param strings 문자열 리스트
     * @return 각 문자열의 길이 리스트
     */
    public static List<Integer> calculateStringLengths(List<String> strings) {
        // 여기에 코드 작성

        // return strings.stream().map(string -> string.length()).toList();
        return strings.stream().map(String::length).toList();
    }

}
