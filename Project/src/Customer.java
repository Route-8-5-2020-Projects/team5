import java.util.Vector;

public class Customer {
private String customer_mobile,username,password;private int block_num;private Vector<Notification>notifications;
private Vector<Order>orders;

    public String getCustomer_mobile() {
        return customer_mobile;
    }

    public void setCustomer_mobile(String customer_mobile) {
        this.customer_mobile = customer_mobile;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBlock_num() {
        return block_num;
    }

    public void setBlock_num(int block_num) {
        this.block_num = block_num;
    }

    public Vector<Notification> getNotifications() {
        return notifications;
    }

    public void setNotifications(Vector<Notification> notifications) {
        this.notifications = notifications;
    }

    public Vector<Order> getOrders() {
        return orders;
    }

    public void setOrders(Vector<Order> orders) {
        this.orders = orders;
    }

    public Customer(String customer_mobile, String username, String password, int block_num) {
        this.customer_mobile = customer_mobile;
        this.username = username;
        this.password = password;
        this.block_num = block_num;
        notifications=new Vector<Notification>();
        orders=new Vector<Order>();

    }
}
