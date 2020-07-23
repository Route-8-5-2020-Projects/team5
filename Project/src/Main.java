import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
Shop shopA=new Shop();
        Scanner scan=new Scanner(System.in);int sign=1;
        while(sign==1) {
            System.out.println("for Customer->>>press 1 \nfor Store->>>press2");
            int choice = scan.nextInt();
            if (choice == 1) {
                System.out.println("press 1 for customer login\npress 2 for customer registeration");
                choice = scan.nextInt();
                if (choice == 1) {
                    System.out.println("please enter your mobile number");
                    String mobile = scan.next();
                    System.out.println("please enter your password");
                    String password = scan.next();
                    shopA.login_forcustomer(mobile, password);
                    if (shopA.login_forcustomer(mobile, password) == -1) {
                        System.out.println("wrong pass or try registering ");
                    }
                    else{
                        System.out.println("OK the customer exists");
                    }

                }
                else if (choice == 2) {

                    System.out.println("please enter your mobile number ");
                    String customer_mobile = scan.next();
                    System.out.println("please enter your name ");
                    String customer_name = scan.next();
                    System.out.println("please enter your password ");
                    String customer_pass = scan.next();
                    System.out.println("please enter your block number ");
                    int customer_blocknum = scan.nextInt();
                    Customer customer = new Customer(customer_mobile, customer_name, customer_pass, customer_blocknum);
                    if(shopA.add_customer(customer)!=true){
                        System.out.println("the mobile number already exists try to log in ");
                    }
                    else{
                        shopA.add_customer(customer);
                        System.out.println("customer has been added ");
                    }

                }
                System.out.println("to continue press 1 otherwise press 0 ");sign=scan.nextInt();

            }


        }







    }
}
