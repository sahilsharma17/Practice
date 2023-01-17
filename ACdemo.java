

public class ACdemo {
    public static void main(String[] args) {
        Accounts sa = new SavingsAccount(1000, 1001, "SAM", "DELHI", 12);
        sa.display();
        sa.withdrawal(700);
        sa.display();
    }
    
}
abstract class Accounts{
    float balance;
    int accountholder;
    String accountHolderName,address;

    Accounts(float bal,int acholder, String acholderName, String add){
        balance = bal;
        accountholder = acholder ;
        accountHolderName = acholderName;
        address = add;
    }

    void withdrawal(int withdrawalAmt){
        balance = balance-withdrawalAmt;
        System.out.println(withdrawalAmt+" withdrawled");
    }
    void deposit(int depositAmt){
        balance = balance+depositAmt;
        System.out.println(depositAmt+" deposited");
    }
    void display(){
        System.out.println("ACCOUNT HOLDER - "+accountholder+"\n"+"ACCOUNT HOLDER NAME - "+accountHolderName+"\n"+
        "ADDRESS - "+address+"\n"+"BALANCE - "+balance);
    }
}

class SavingsAccount extends Accounts{

    
    SavingsAccount(float bal, int acholder, String acholderName, String add, float rate) {
        super(bal, acholder, acholderName, add);
        rateofinterest = rate;
        
    }
    float rateofinterest;

    float calculateAmount(){
        float si = (balance*rateofinterest*1)/100;    //time = 1 year
        float amt = balance+si;
        return amt;
    }
    void display(){
        super.display();
        System.out.println("AMOUNT - "+calculateAmount());
    }

}