package app;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.00);
		
		//UPCASTING
		Account acc1 = bacc; //objeto da super classe recebe um objeto da sub classe, uma conta empresarial também é uma conta
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 500.00);
		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
		
		//DOWNCASTING
		BusinessAccount acc4 = (BusinessAccount)acc2; //objeto da subclasse recebe um objeto da super classe, Conta empresarial (sub classe) recebe uma conta (super classe)
	
		//BusinessAccount acc5 = (BusinessAccount)acc3; //acc3 é do tipo SavingsAccount e ao executar o código vamos ter um erro
		
		if(acc3 instanceof BusinessAccount) { //verifica se acc3 é do tipo BusinessAccount
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.00);
			System.out.println("Loan");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update");
		}
	}

}
