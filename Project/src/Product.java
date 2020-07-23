public class Product {

private static int products_count=0;
private int product_id;private String product_name;private float product_price;private String product_status;

    public int getProduct_id() {
        return product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public float getProduct_price() {
        return product_price;
    }

    public void setProduct_price(float product_price) {
        this.product_price = product_price;
    }

    public String getProduct_status() {
        return product_status;
    }

    public void setProduct_status(String product_status) {
        this.product_status = product_status;
    }

    public Product(String product_name, float product_price, String product_status) {
       this.product_id=products_count;
       products_count++;
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_status = product_status;
    }
}
