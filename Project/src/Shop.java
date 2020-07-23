import javax.management.ValueExp;
import java.util.Vector;

public class Shop {

private Vector<Customer>customers;private Vector<Store>stores;

public int find_customer(String customer_mobile){

    for(int i=0;i<customers.size();i++){
        if(customers.elementAt(i).getCustomer_mobile().equals(customer_mobile)) {
            return i;
        }

    }
    return -1;
}
public boolean add_customer(Customer customer){
        if(find_customer(customer.getCustomer_mobile())!=-1){

            return false;
        }
        customers.add(customer);
        return true;

}

public int login_forcustomer(String customer_mobile,String password){
    if(find_customer(customer_mobile)!=-1) {
        if (customers.elementAt(find_customer(customer_mobile)).getPassword().equals(password)) {
            return find_customer(customer_mobile);

        }
    }
        return -1;

}

public int find_store(String username){
    for(int i=0;i<stores.size();i++) {
        if (stores.elementAt(i).getUsername().equals(username)) {
            return i;
        }
    }
    return -1;

}

public boolean add_store(Store store){
if(find_store(store.getUsername())!=-1){
    return false;
}
stores.add(store);
return true;
}

public int login_forstore(String username,String password){
if(find_store(username)!=-1){
    if(stores.elementAt(find_store(username)).getPassword().equals(password)){
        return find_store(username);
    }
}
return -1;


}

    public Shop() {
        customers=new Vector<Customer>();stores=new Vector<Store>();
    }
}
