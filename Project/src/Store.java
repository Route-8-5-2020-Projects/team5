import java.util.Vector;

public class Store {


private static int stores_count=0;
private int store_id;private Vector<Store_house>store_houses;private Vector<Product>products;private String username,password;

    public int getStore_id() {
        return store_id;
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

    public Vector<Store_house> getStore_houses() {
        return store_houses;
    }

    public void setStore_houses(Vector<Store_house> store_houses) {
        this.store_houses = store_houses;
    }

    public Vector<Product> getProducts() {
        return products;
    }

    public void setProducts(Vector<Product> products) {
        this.products = products;
    }

    public Store(Vector<Store_house> store_houses, Vector<Product> products, String username, String password) {
        this.store_id=stores_count;
        stores_count++;
        this.store_houses = store_houses;
        this.products = products;
        this.username = username;
        this.password = password;
    }
}



