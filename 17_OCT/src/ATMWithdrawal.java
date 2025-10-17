
import java.util.Scanner;

public class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Initialize balance
        double balance = 10000.00;

        System.out.println("🏧 Welcome to the ATM!");
        System.out.println("Your current balance: ₹" + balance);

        // Step 2: Take user input
        System.out.print("Enter amount to withdraw: ₹");
        double withdrawAmount = sc.nextDouble();

        // Step 3: Check conditions
        if (withdrawAmount <= 0) {
            System.out.println("❌ Invalid amount! Please enter an amount greater than ₹0.");
        }
        else if (withdrawAmount % 100 != 0) {
            System.out.println("⚠️ Amount should be a multiple of ₹100.");
        }
        else if (withdrawAmount > balance) {
            System.out.println("❌ Insufficient balance!");
        }
        else {
            // Step 4: Deduct amount
            balance -= withdrawAmount;
            System.out.println("✅ Withdrawal successful!");
            System.out.println("💵 You withdrew: ₹" + withdrawAmount);
            System.out.println("🏦 Remaining balance: ₹" + balance);
        }

        sc.close();
    }
}
