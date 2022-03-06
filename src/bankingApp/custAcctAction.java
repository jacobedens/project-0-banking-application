package bankingApp;

import java.util.ArrayList;
import java.util.Scanner;

public class custAcctAction {

	static String ur1 = "asdf";
	static String usr2 = "jkl";
	static String pwd1 = "asdf";
	static String pwd2 = "fdsa";
	static String typ1 = "joint";
	static String typ2 = "indv";
	static String individual ="individual";
	static String joint ="joint";
	
	
	
	public static void main(String args[]) throws Exception {
		
		Scanner a=new Scanner(System.in);
		
		ArrayList <String> inputs =new ArrayList<String>();
		
		
//new user setup------------------------------------------------------------------------------------------------------	
		System.out.println("set user name");
		String inputUsrNm=a.nextLine();
		inputs.add(inputUsrNm);
		//save iteratively, map instead of array.. do while loop
		
		System.out.println("set password");
		String inputPwd=a.nextLine();
		inputs.add(inputPwd);
		
		
		System.out.println("How much would you like to deposit?");
		String inputD=a.nextLine();
		 double inputDep = Double.parseDouble(inputD);
		inputs.add(inputD);
				
		System.out.println("Are you opening joint or individual acct?");

			try {
			String inputAcctType=a.nextLine();
		
			if (inputAcctType.equals("individual") || inputAcctType.equals("joint")){
				inputs.add(inputAcctType);
				
			System.out.println("account pending approval");
			}
			else {
				throw new Exception("type only joint or individual");
			}
			}
			finally {
			a.nextLine();
			}
			
			
		//new user object with parmeters: String usr, String pwd, Double bal, String typ, String opn
			UsrMain usr1 = new UsrMain(inputUsrNm,inputPwd,inputDep,"joint", "opn");
			System.out.println(usr1);
			//System.out.println(usr1);
			System.out.println(inputs);
			//run lines 15 to 42 one more time. will save new values in string array.
//returning user------------------------------------------------------------------------------------------------------------

			
		
		System.out.println("enter user name");
		String tryUsrNm=a.nextLine();
		if (tryUsrNm.equals(ur1) || tryUsrNm.equals(usr2)){
		System.out.println("success");
		}
		else {
			throw new Exception("input name does not match records");
		}
		
		System.out.println("enter password");
		String tryPwd=a.nextLine();
		//check tryPwd to inputPwd
		if (tryPwd.equals(pwd1) || tryPwd.equals(pwd2)){
		System.out.println("success");
		}
		else {
			throw new Exception("input name does not match records");
		}
		
	 	
		System.out.println("which account; joint or individual?");
		String tryAcctType=a.nextLine();
		if (tryAcctType.equals(typ1) || tryAcctType.equals(typ2)){
		System.out.println("success");
		}
		else {
			throw new Exception("input name does not match records");
		}
//money movement actions-----------------------------------------------------------------------------------------------------	
		System.out.println("would you like to withdrawl, transfer, or deposit funds?");
		String acctAction=a.nextLine();
		//define these three methods with exception handling. Make private. Admin will get.
		// define wd trns dp fun here. save output through do while in collection
		 	
		System.out.println("amount?");
		String amnt=a.nextLine();
		double amnt1 = Double.parseDouble(amnt);
		if(amnt1 > 0.00) {
			System.out.println("your new balance is:");
		}
		else
			throw new Exception("enter non-negative amount");
			
		if (acctAction.equals("withdrawl")) {
			Main wdl = new Main(3000,amnt1);
			System.out.println(wdl.withdrawl());
		}
		else if (acctAction.equals("deposit")) {
			Main dep = new Main(3000,amnt1);
			System.out.println(dep.deposit());
		}
		else if (acctAction.equals("transfer")) {
			Main trn = new Main(3000,amnt1);
			System.out.println(trn.withdrawl());
			System.out.println(amnt1+" transferred");
			
		}

	
	

	
//admin menu------------------------------------------------------------------------------------------------------------
	
	System.out.println("would you like to: (withdrawl, transfer, or deposit funds?), view all accounts, approve/deny accounts, or view transactions?");
	String adminAction=a.nextLine();
	//define these three methods with exception handling. Make private. Admin will get.
	// define wd trns dp fun here. save output through do while in collection
	 
	//if then or switch statements for options
	
	
	
		
	}
	
}
}
