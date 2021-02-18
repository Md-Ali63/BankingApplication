package bankingApp;

import java.util.Scanner;

public class BankingApp {

	public static void main(String[] args) {
		Account obj = new Account("XYZ", "AC001");
		obj.show();

	}

}


class Account{
	
	double balance, prevBalance;
	String userName, userId;
	private Scanner sc;
	
	
	
	public Account(String uName, String uId) {
		//super();
		userName = uName;
		userId = uId;
	}
	void deposit(double amount) {
		if(amount != 0) {
			balance = balance + amount;
			prevBalance = amount;
		}
	}
	void withDraw(double amount) {
		if(amount!=0) {
			balance = balance - amount;
			prevBalance = -amount;
		}
	}
	
	void getPrevBalance() {
		if(prevBalance > 0)
			System.out.println("Deposit: "+ prevBalance);
		
		if(prevBalance < 0)
			System.out.println("Withdrawn: "+ Math.abs(prevBalance));
		
		else System.out.println("No transaction");
	}
	
	void show() {
		
		char option = '\0';
		sc = new Scanner(System.in);
		
		System.out.println("Welcome "+userName);
		System.out.println("Your name id "+userId);
		System.out.println("\n");
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previous trasaction");
		System.out.println("E. Exit");
	
	do {
		System.out.println("----------------");
		System.out.println("Enter an option");
		System.out.println("----------------");
		option = sc.next().charAt(0);
		System.out.println("\n");
		
		switch(option) {
			
		case 'A':
			System.out.println("---------");
			System.out.println("Balance: "+balance);
			System.out.println("---------");
			System.out.println("\n");
			break;
			
		case 'B':
			System.out.println("--------");
			System.out.println("Enter an amount to deposit: ");
			System.out.println("--------");
			System.out.println("\n");
			double amount = sc.nextDouble();
			deposit(amount);
			System.out.println("\n");
			break;
			
		case 'C':
			System.out.println("--------");
			System.out.println("Enter an amount to withdraw: ");
			System.out.println("--------");
			System.out.println("\n");
			double wamount = sc.nextDouble();
			withDraw(wamount);
			System.out.println("\n");
			break;
			
		case 'D':
			System.out.println("--------");
			getPrevBalance();
			System.out.println("--------");
			System.out.println("\n");
			break;
			
		case 'E':
			System.out.println("--------------");
			break;
			
		default:
			System.out.println("Invalid Option. Please try again");
			break;
		}
		}while(option != 'E');
		System.out.println("Thank you...!!!");
	}
	
}
