package Collection;

import java.util.HashSet;

public class SetTest {
    public static void main(String[] args) {

        HashSet<Building> buildingSet = new HashSet<Building>();

        buildingSet.add(new Building("아레나빌딩","서울 마포구 666"));
        buildingSet.add(new Building("신빌딩","서울 동작구 123"));
        buildingSet.add(new Building("아레나빌딩","서울 마포구 666"));

        for(Building building : buildingSet) {
         //   System.out.println(building);
        }

    }
}
