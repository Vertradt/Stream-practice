package str;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private List<Product> products;
    private LocalDateTime orderTime = LocalDateTime.now();

    public Order(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Order{" +
                "products=" + products +
                ", orderTime=" + orderTime +
                '}';
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
    }
}

