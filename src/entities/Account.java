package entities;

public class Account {
	
	private Integer number; //numero
	private String holder; //titular
	
	/*com protected esse atributo pode ser acessado em subclasses e classes do mesmo pacote*/
	protected Double balance; //saldo
	
	public Account() {}

	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}
	
	//saque
	public void withdraw(double amount) {
		balance -= amount;
	} 
	
	//deposito
	public void deposit(double amount) {
		balance += amount;
	}
}
