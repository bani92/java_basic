package Collection;

import java.util.Objects;

public class Building {

    private String name;
    private String addr;

    public Building(String name, String addr) {
        this.name = name;
        this.addr = addr;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("객체가 equals() 호출");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return Objects.equals(name, building.name) && Objects.equals(addr, building.addr);
        // return super.equals(o);
    }

    @Override
    public int hashCode() {
        System.out.println("객체가 hashCode() 호출");
        return Objects.hash(name, addr);
      //  return super.hashCode();
    }
}
