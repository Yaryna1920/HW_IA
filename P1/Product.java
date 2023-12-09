package P1;

import java.util.Arrays;
import java.util.List;

class Product {
    private String name;
    private String color;
    private double price;

    public Product(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Product 1", "Red", 10.0),
                new Product("Product 2", "Green", 20.0),
                new Product("Product 3", "Blue", 30.0),
                new Product("Product 4", "Red", 40.0),
                new Product("Product 5", "Green", 50.0)
        );

        System.out.println("All products:");
        products.stream()
                .forEach(System.out::println);
    }
}
