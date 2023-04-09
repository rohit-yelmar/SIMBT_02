package atm;
import java.util.*;

public class Account {
    private int customerNumber;
    private int pinNumber;
    private double Balance = 0;
    

    Scanner input = new Scanner (System.in);

    public int setno(int customerNumber) {
    this.customerNumber = customerNumber;
    return customerNumber;
    }

    public int getno ( ) {
    return customerNumber;

    }

    public int setpin (int pinNumber) {
    this.pinNumber = pinNumber;
    return pinNumber;

    }

    public int getpin () {
    return pinNumber;
    }
    public double getBalance(){
        return Balance;
    }
    public double calcWithdraw(double amount) {
        Balance = (Balance - amount);
        return Balance;
        
        }
        
        public double calcDeposit(double amount) {
        Balance = (Balance + amount);
        return Balance;
        }

        public void getWithdraw() {
            System.out.println("Account Balance: " + Balance);
            System.out.print("Amount you want to withdraw from Account: ");
            double amount = input.nextDouble ();
            
            if ((Balance - amount) >= 0) {
            calcWithdraw(amount);
            System.out.println("New Account Balance: " + Balance);
            } else {
            
            System.out.println ("Balance Cannot be Negative." + "\n");
            
            }}
            public void getDeposit() {
                System.out.println("Account Balance: " + Balance);
                System.out.print("Amount you want to Deposit from Checking Account: ");
                double amount = input.nextDouble();
                if ((Balance + amount) >= 0) {
                calcDeposit(amount);
                System.out.println("New Checking Account Balance: " + Balance);
                } else {
                System.out.println("Balance Cannot be Negative." + "\n");
                }
                }
            }

