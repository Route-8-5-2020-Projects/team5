public class Order {
    private static int orders_count=1;
    private int order_id,product_id,storehouse_id;

    public int getOrder_id() {
        return order_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public int getStorehouse_id() {
        return storehouse_id;
    }

    public Order(int product_id, int storehouse_id) {
       this.order_id=orders_count;
       orders_count++;
        this.product_id = product_id;
        this.storehouse_id = storehouse_id;
    }
}
