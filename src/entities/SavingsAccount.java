package entities;

public class SavingsAccount extends Account {
	
	private Double interestRate; //taxa de juros
	
	public SavingsAccount() {
		super(); //chama o construtor de Account
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance); //chama o construtor de Account
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() { //atualiza o saldo com base na taxa de juros
		balance += balance * interestRate;
	}
}
