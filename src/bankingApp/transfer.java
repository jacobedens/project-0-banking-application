package bankingApp;

public class transfer {

	public static void main(String[] args) {
		
	double acctFrom = 12345.67;
	double acctTo = 12345.67;
	double amount = 0.00;
	
double fromBal = acctFrom - amount;
double toBal = acctTo + amount;

System.out.println(amount + " has beent transfered." +" Remaining balance is " + fromBal);

	}

}
