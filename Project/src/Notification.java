public class Notification {
    private String store_name,product_name,dateof_buying;


    public String getStore_name() {
        return store_name;
    }

    public void setStore_name(String store_name) {
        this.store_name = store_name;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }



    public String getDateof_buying() {
        return dateof_buying;
    }

    public void setDateof_buying(String dateof_buying) {
        this.dateof_buying = dateof_buying;



    }
    public Notification(String store_name, String product_name, String dateof_buying) {
        this.store_name = store_name;
        this.product_name = product_name;
        this.dateof_buying = dateof_buying;
    }
}
