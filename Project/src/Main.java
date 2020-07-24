import java.util.Scanner;
import java.util.Vector;

public class Main {

    public static boolean pass_check(char pass[]){
boolean alphabits=false,nums=false;
    if(pass.length>6){
        for(int i=0;i<pass.length;i++){
            if((pass[i]>='a' && pass[i]<='z')  || (pass[i]>='A' && pass[i]<='Z'))
            {
                alphabits=true;
            }
            else if(pass[i]>='0' && pass[i]<='9'){
                nums=true;
            }

            if(alphabits==true && nums==true){
                return true;
            }
        }

    }

        return false;


}





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
                    if (shopA.find_customer(mobile) != -1) {
                        if(shopA.login_forcustomer(mobile,password)==-1){
                            System.out.println("wrong pass");
                        }
                        else{
                            System.out.println("OK the customer exists");
                        }

                    }
                    else{
                        System.out.println("customer doesn't exist try to register");
                    }

                }
                else if (choice == 2) {

                    System.out.println("please enter your mobile number ");
                    String customer_mobile = scan.next();
                    System.out.println("please enter your name ");
                    String customer_name = scan.next();
                   inner:
                   {
                       System.out.println("please enter your password ");
                       String customer_pass = scan.next();
                       if (pass_check(customer_pass.toCharArray())==false) {
                           System.out.println("please enter a pass with length>6 and has alphabits....try again");
                          break inner;
                       }
                       System.out.println("please enter your block number ");
                       int customer_blocknum = scan.nextInt();
                       Customer customer = new Customer(customer_mobile, customer_name, customer_pass, customer_blocknum);
                       if (shopA.add_customer(customer) != true) {
                           System.out.println("the mobile number already exists try to login ");
                       } else {
                           shopA.add_customer(customer);
                           System.out.println("customer has been added ");
                       }
                   }
                }
            }


            else if(choice==2){
                System.out.println("press 1 for store login\npress 2 for store registeration");
                choice = scan.nextInt();
                if (choice == 1) {
                    System.out.println("please enter your username");
                    String username = scan.next();
                    System.out.println("please enter your password");
                    String password = scan.next();
                    shopA.login_forstore(username, password);

                    if (shopA.find_store(username)!=-1)
                    {  if(shopA.login_forstore(username,password)==-1){
                        System.out.println("wrong password ");}
                        else{
                        System.out.println("OK the store exists");
                           }

                    }
                    else if(shopA.find_store(username)==-1){
                        System.out.println("store doesn't exist try to register ");

                    }}

                else if(choice==2){
                        System.out.println("please enter your username ");
                        String store_username = scan.next();
                        inner:{
                            System.out.println("please enter your password ");
                        String store_pass = scan.next();
                        if(pass_check(store_pass.toCharArray())!=true){
                            System.out.println("please enter a pass with length>6 and has alphabits....try again");
                            break inner;
                        }
                        Store store=new Store(new Vector<>(),new Vector<>(),store_username,store_pass);
                        if(shopA.add_store(store)==false){

                            System.out.println("the store username already exists try to login ");
                        }
                        else {

                            shopA.add_store(store);
                            System.out.println("store has been added ");
                        }
                    }
                }


            }
            System.out.println("to continue press 1 otherwise press 0 ");sign=scan.nextInt();

        }







    }
}
