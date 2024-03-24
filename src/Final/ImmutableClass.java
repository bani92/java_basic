package Final;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ImmutableClass {
    /**
     * 1. 클래스를 final로 선언하라
     * 2. 모든 클래스 변수를 private와 final로 선언하라
     * 3. 객체를 생성하기 위한 생성자 또는 정적 팩토리 메소드를 추가하라
     * 4. 참조에 의해 변경가능성이 있는 경우 방어적 복사를 이용하여 전달하라
     */

    private final int age;
    private final String name;
    private final List<String> list;

    public ImmutableClass(int age, String name) {
        this.age = age;
        this.name = name;
        this.list = new ArrayList<>();
    }

    public static ImmutableClass of(int age , String name) {
        return new ImmutableClass(age, name);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public List<String> getList() {
        return Collections.unmodifiableList(list);
    }
}
