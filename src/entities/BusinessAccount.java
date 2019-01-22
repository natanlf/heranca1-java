package entities;

public class BusinessAccount extends Account {
	
	private Double loanLimit;
	
	public BusinessAccount() {
		super(); //chama o construtor da super classe Account
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance); //construtor da classe Account que é a super classe
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	//emprestimo
	public void loan(double amount) {
		if(amount <= loanLimit) { //se o valor do emprestimo for menor que o limite
			balance += amount - 10.0; //balance é um atributo da classe pai (super classe), para emprestimo temos uma taxa de 10
		}
		
	}

}
