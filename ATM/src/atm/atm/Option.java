package atm;

import java.io.IOException;
import java.util.*;

public class Option extends Account {
    Scanner menu = new Scanner(System.in);
    HashMap<Integer,Integer> data = new HashMap<Integer,Integer>();
    public void getLogin() throws IOException{
        int x=1;
        do{
            try{
                data.put(123,456);
                data.put(789,123);
                System.out.println("Welcome to ATM");
                System.out.println("Enter  your Customer no:");
                setno(menu.nextInt());
                System.out.println("Enter your pin:");
                setpin(menu.nextInt());

            }
            catch(Exception e)
            {
                System.out.println("Invalid Characters");
                x=2;
            }
            int cn=getno();
            int pn=getpin();
            if(data.containsKey(cn)&&data.get(cn)==pn){
                getAccount();
            }
            else{
                System.out.println("Wrong Customer no or Pin no");

            }
        }while(x==1);
    }
    public void getAccount() {
        
        System.out.println("Checking Account: ");
        
        System.out.println(" Type 1 - View Balance");
        
        System.out.println(" Type 2 - Withdraw Funds");
        
        System.out.println(" Type 3 - Deposit Funds");
        
        System.out.println(" Type 4 - Exit");
        
        System.out.print("Choice: ");
        
        int selection = menu.nextInt () ;
       
        
        switch (selection) {
        case 1: System.out.println("Checking Account Balance: " + getBalance());
        
                break;
        case 2:

                getWithdraw();


                break;

        case 3: getDeposit(); 
                break;

        case 4:
        
                System.out.println("Thank You for using this ATM, bye.");
                break;

        default:
                System.out.println("In" + "Invalid Choice." + "In");
                getAccount();
        }
    }
}
   