package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// Upcascting
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
		
		// Downcasting
		
		if (acc3 instanceof BusinessAccount) {
			// Eu posso criar um objeto BusinessAccount a partir de um objeto SavingsAccount, mas vai dar erro 
			// durante a execução - ClassCastException.
		    BusinessAccount acc4 = (BusinessAccount) acc2;
		    acc4.loan(100.00);
		    System.out.println("Loan");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update");
		}
		
		
		
	}

}
