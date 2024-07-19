package Problem.medium;

public class Product {

    private String name;
    private double price;

    // 기본 생성자
    public Product() {
    }

    // 모든 필드를 초기화하는 생성자
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
