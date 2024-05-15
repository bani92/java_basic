package Collection;

import java.util.HashSet;

public class SetTest {
    public static void main(String[] args) {

        /**
         * 객체 생성시 equals, hashCode를 오버라이딩해서 중복된 객체를 제거하는것
         */
        HashSet<Building> buildingSet = new HashSet<Building>();

        buildingSet.add(new Building("아레나빌딩","서울 마포구 666"));
        buildingSet.add(new Building("신빌딩","서울 동작구 123"));
        buildingSet.add(new Building("아레나빌딩","서울 마포구 666"));

        for(Building building : buildingSet) {
         //   System.out.println(building);
        }

    }
}
