package Program;
import java.util.Scanner;
public class ATM 
{
	 static double t_amount = 0;

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        do {
	            System.out.println();
	            System.out.println("Press 1 For Withdraw..");
	            System.out.println("Press 2 For Deposite..");
	            System.out.println("Press 3 For Check Balance..");
	            System.out.println("Press 4 for Exit..");
	            System.out.println();
	            System.out.println("-----------------------------------------------------");
	            System.out.println();
	            System.out.print("Enter the Number: ");
	            int n = sc.nextInt();

	            switch (n) {
	                case 1:
	                    System.out.println("You are selected for Withdraw...");
	                    withdrawAmount();
	                    break;

	                case 2:
	                    System.out.println("Your are Selected to Deposite...");
	                    depositeAmount();
	                    break;

	                case 3:
	                    System.out.println("You are seleted to check Balance...");
	                    checkBalance();
	                    break;

	                case 4:
	                    char ch = Logout();
	                    if (ch == 'Y') {
	                        System.out.println("Exit... thank You.!!");
	                        System.exit(0);
	                    } else {
	                        continue;
	                    }

	                default:
	                    System.out.println("invalid choice....");
	            }

	        } while (true);

	    }

	    public static void withdrawAmount() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println();
	        System.out.print("Enter the withrawal amount: ");
	        int amount = sc.nextInt();
	        if (amount > t_amount) {
	            System.out.println("Invalid Amount..");
	        } else {
	            t_amount = t_amount - amount;
	            System.out.println("Transcation Successfully...");
	            System.out.println("Avilable Balance : " + t_amount);
	            // System.out.println("Thank You");
	        }
	    }

	    public static void depositeAmount() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println();
	        System.out.println("Enter the Deposite Amount: ");
	        int amount = sc.nextInt();
	        if (amount > 0) {
	            t_amount = t_amount + amount;
	            System.out.println("Transcation Successfully...");
	            System.out.println("Avilable Balance : " + t_amount);
	        } else {
	            System.out.println("Invalid Amount..");
	        }
	    }

	    public static void checkBalance() {
	        System.out.println("Avilable Balance: " + t_amount);
	    }

	    public static char Logout() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Are you sure to Logout..(Y/N):");
	        char ch = sc.next().charAt(0);

	        if (ch == 'Y') {
	            return 'Y';
	        }

	        return 'N';
	    }
}
