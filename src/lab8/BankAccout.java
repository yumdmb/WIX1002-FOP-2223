//L8Q2

package lab8;

public class BankAccout {
    public String fullname,ic;
    public double amount;

    public BankAccout(String f, String i,double a) {
        fullname=f;
        ic=i;
        amount=a;
    }

    public void deposit(double a) {
        amount+=a;
        System.out.println("Deposit" + a + "succesfully");
    }

    public void withdraw(double a) {
        if(a>amount) {
            System.out.println("You withdraw more than your balance");
        }
        else {
            amount-=a;
            System.out.println("Withdraw" + a + "succesfully");
        }
    }    

    public void output() {
        System.out.println("The current balance" + amount);
    }    

    }


