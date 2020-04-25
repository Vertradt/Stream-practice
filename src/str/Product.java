package str;

enum Country {
    POLAND,
    CHINA,
    USA,
    JAPAN;
}

public class Product {
    private String name;
    private int amount;
    private double price;
    private Country country;

    public Product(String name, int amount, double price, Country country) {
        this.name = name;
        this.amount = amount;
        this.price = price;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                ", country=" + country +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
