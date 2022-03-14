import java.util.Scanner;
class AtmBankingProcess
{
    private int amount,otp,pin;
    public
    AtmBankingProcess()//let us intialize with default pin and amount(for example)
    {
        amount=2000000;
        pin=2468;
    }
    void printBalance()//printd account balance
    {
        System.out.println("Current Balance is "+amount);
    }
    int checkPin(int p)//checks whether entered pin is correct or wrong
    {
        if(p==pin)return 1;
        else return 0;
    }
    void withdrawn(int cash)//withdraws cah from account
    {
        if(amount - cash < 0 )System.out.println("Insufficient Balance");
        else
        {
        amount = amount-cash;
        printBalance();
        }
    }
    void deposit(int cash)//function to deposit cash
    {
        
        amount = amount+cash;
        printBalance();
    }
    void changePin(int npin)//function to change pin
    {
        pin = npin;
    }
    
}
public class AtmCodeJava
{
	public static void main(String[] args) {//main method
	    int pin_no;
	    Scanner sc = new Scanner(System.in);
	    AtmBankingProcess atm = new AtmBankingProcess();//object ,used to call methods in AtmBankingProcess class
		System.out.println("\t\t\t\t\tWelcome to XYZ bank..");
		System.out.println("Please enter your pin");
		pin_no = sc.nextInt();
		if(atm.checkPin(pin_no) == 1)
		{
		    
		    while(true)
		    {
		    System.out.println("\n1.WITHDRAW                  2.DEPOSIT \n3.CHECH BALANCE             4.CHANGE PIN\n5.Exit\n");
		    System.out.println("Select any option ..");
		    int choice = sc.nextInt();
		    int cash;
		    switch(choice)
		    {
		        case 1:System.out.println("Enter money to be withdrawn : ");
		                cash = sc.nextInt();
		               atm.withdrawn(cash);
		               break;
		        case 2:System.out.println("Enter money to be deposited : ");
		                cash = sc.nextInt();
		               atm.deposit(cash);
		               break;
		        case 3:atm.printBalance();
		               break;
		        case 4:System.out.println("Enter old pin ");
		               int p = sc.nextInt();
		               if(atm.checkPin(p) == 1)
		               {
		                   System.out.println("Enter new pin number");
		                   int new_pin = sc.nextInt();
		                   atm.changePin(new_pin);
		                   System.out.println("Pin Changed Successfully");
		               }
		               else
		               {
		                   System.out.println("Entered pin is incorrect");
		               }
		               break;
		      case 5:return;
		      default:System.out.print("Enter correct choice ");
		      
		    }
		    }
		}
		else{
		    System.out.println("Entered pin is incorrect ");
		}
	}
}
