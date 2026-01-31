class Product{
    private String productName;
    private double price;
    private int stock;
     public Product(String productName, double price, int stock) {
     this.productName = productName;
     this.price=price;
     this.stock=stock;
    }

    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }  
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("Stock cannot be negative");
        }
        this.stock = stock;
    }
        public void productInfo() {
        System.out.println("Product Information:-");
        System.out.println("Product Name  : " + productName);
        System.out.println("Price : " + price+" Rupees");
        System.out.println("Stock : " + stock);
        System.out.println();
    }
}
public class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 125000, 10);
        Product p2 = new Product("Smartphone", 50000, 25);
        Product p3 = new Product("Headphones", 4000, 50);
        p1.productInfo();
        p2.productInfo();
        p3.productInfo();
    }
}
