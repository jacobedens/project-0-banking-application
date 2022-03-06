package bankingApp;

public class Main {	
	
private double acctBal;
private double amount;

public Main() {
	acctBal = 3000.00;
	amount = 0.00;
}
	
public Main(double acctBal, double amount) {
	this.acctBal = acctBal;
	this.amount = amount;
}
	
public double withdrawl() {
	return acctBal - amount;
	}
	
public double deposit() {
	return acctBal + amount;
}

//transfer here

public void setNum(double acctBal, double amount) {
	this.acctBal = acctBal;
	this.amount = amount;
}
}

