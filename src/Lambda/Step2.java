package Lambda;

@FunctionalInterface
interface MyFunction {
    int calc(int x, int y);
}
public class Step2 {

    public Step2() {
        MyFunction f1 = (x , y) -> { return x + y;};
        System.out.println(f1.calc(20,30));

        MyFunction f2 = (x, y) -> {return x-y;};
        System.out.println(f2.calc(10, 10));
    }

    public static void main(String[] args) {
        new Step2();
    }

}
