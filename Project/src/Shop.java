import javax.management.ValueExp;
import java.util.Vector;

public class Shop {

private Vector<Customer>customers;private Vector<Store>stores;

private int find_customer(String customer_mobile){

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

    public Shop() {
        customers=new Vector<Customer>();stores=new Vector<Store>();
    }
}
