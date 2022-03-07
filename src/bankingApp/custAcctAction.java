package bankingApp;

import java.util.ArrayList;
import java.util.Scanner;

public class custAcctAction {


	
	public static void main(String args[]) throws Exception {

		UsrMain admin = new UsrMain("admin","admin",1000000000.00,"admin","n/a");
		UsrMain employee = new UsrMain("employee","employee",0.00,"employee","n/a");
		
		Scanner a=new Scanner(System.in);
		
		ArrayList <String> inputs =new ArrayList<String>();
		ArrayList <String> inputs2 =new ArrayList<String>();
		
		
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

			
			String inputAcctType=a.nextLine();
		
			
				inputs.add(inputAcctType);
				
			System.out.println("account pending approval");
			System.out.println("");
			System.out.println("Would you like to Setup a new user account?");
			
			String again= a.nextLine();
			
		//new user object with parmeters: String usr, String pwd, Double bal, String typ, String opn
			UsrMain usr1 = new UsrMain(inputUsrNm,inputPwd,inputDep,inputAcctType , "pending");
			System.out.println(usr1);
			//System.out.println(usr1);
			System.out.println(inputs);
//usr2----------------------------------------------------------------------------------------------------------------------------			
			if (again.equals("yes")) {
			System.out.println("");
			}
			else {
				System.out.println("");
			//switch to bypass	
			}
				
			
	
				System.out.println("set user name");
				String inputUsrNm2=a.nextLine();
				inputs2.add(inputUsrNm2);
				//save iteratively, map instead of array.. do while loop
				
				System.out.println("set password");
				String inputPwd2=a.nextLine();
				inputs2.add(inputPwd2);
				
				
				System.out.println("How much would you like to deposit?");
				String inputD2=a.nextLine();
				double inputDep2 = Double.parseDouble(inputD2);
				inputs2.add(inputD2);
						
				System.out.println("Are you opening joint or individual acct?");

					
				String inputAcctType2=a.nextLine();
				
					
				inputs2.add(inputAcctType2);
						
				System.out.println("account pending approval");
				
				UsrMain usr2 = new UsrMain(inputUsrNm2,inputPwd2,inputDep2,inputAcctType2, "pending");
				System.out.println(usr2);
				//System.out.println(usr1);
				System.out.println(inputs2);
					
			
//returning user------------------------------------------------------------------------------------------------------------

		System.out.println("Welcome returning user");
		System.out.println("");
		System.out.println("enter user name");
		String tryUsrNm=a.nextLine();
		if (tryUsrNm.equals(inputUsrNm) || tryUsrNm.equals(inputUsrNm2)){
		System.out.println("success");
		}
		else {
			throw new Exception("input name does not match records");
		}
		
		System.out.println("enter password");
		String tryPwd=a.nextLine();
		//check tryPwd to inputPwd
		if (tryPwd.equals(inputPwd) || tryPwd.equals(inputPwd2)){
		System.out.println("success");
		}
		else {
			throw new Exception("input name does not match records");
		}
		
	 	
		System.out.println("which account; joint or individual?");
		String tryAcctType=a.nextLine();
		if (tryAcctType.equals(inputAcctType) || tryAcctType.equals(inputAcctType2)){
		System.out.println("success");
		}
		else {
			throw new Exception("input name does not match records");
		}
//money movement actions-----------------------------------------------------------------------------------------------------	
		if(tryUsrNm.equals(inputUsrNm)) {
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
			Main wdl = new Main(inputDep,amnt1);
			System.out.println(wdl.withdrawl());
		}
		else if (acctAction.equals("deposit")) {
			Main dep = new Main(inputDep,amnt1);
			System.out.println(dep.deposit());
		}
		else if (acctAction.equals("transfer")) {
			Main trn = new Main(inputDep,amnt1);
			System.out.println(trn.withdrawl());
			System.out.println(amnt1+" transferred");
			
		}
		}
		else {
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
				Main wdl = new Main(inputDep2,amnt1);
				System.out.println(wdl.withdrawl());
			}
			else if (acctAction.equals("deposit")) {
				Main dep = new Main(inputDep2,amnt1);
				System.out.println(dep.deposit());
			}
			else if (acctAction.equals("transfer")) {
				Main trn = new Main(inputDep2,amnt1);
				System.out.println(trn.withdrawl());
				System.out.println(amnt1+" transferred");
		}
			
		}
//employee-----------------------------------------------------------------------------------------------------------	
		
		System.out.println("would you like to login to employee or admin?");
		String empAction=a.nextLine();
		
		if (empAction.equals("employee")) {
		System.out.println("Welcome employee");
		System.out.println("");
		System.out.println("enter user name");
		String tryUsrNm1=a.nextLine();
		if (tryUsrNm1.equals("employee")){
		System.out.println("success");
		}
		else {
			throw new Exception("input name does not match records");
		}
		
		System.out.println("enter password");
		String tryPwd1=a.nextLine();
		//check tryPwd to inputPwd
		if (tryPwd1.equals("employee")){
		System.out.println("success");
		}
		else {
			throw new Exception("input name does not match records");
		}
		
		
		System.out.println("would you like to approve/deny accts?");
		String empAction2=a.nextLine();
		
		if(empAction2.equals("yes")) {
			System.out.println("customer"+inputs);
			System.out.println("approve or deny?");
			String empAction3=a.nextLine();
			usr1.setOpn(empAction3);
			System.out.println("customer"+inputs+empAction3);
			
			System.out.println("customer"+inputs2);
			System.out.println("approve or deny?");
			String empAction4=a.nextLine();
			usr2.setOpn(empAction4);
			System.out.println("customer"+inputs2+empAction4);
		}
		
		else {
			System.out.println("");
		}
		
		}
		else {System.out.println("");
			
		}
	
//admin menu------------------------------------------------------------------------------------------------------------
	//"would you like to: (withdrawl, transfer, or deposit funds?), view all accounts, approve/deny accounts, delete accts, or view transactions?"
	System.out.println("Welcome admin");
	System.out.println("");
	System.out.println("enter user name");
	String tryUsrNm1=a.nextLine();
	if (tryUsrNm1.equals("admin")){
	System.out.println("success");
	}
	else {
		throw new Exception("input name does not match records");
	}
	
	System.out.println("enter password");
	String tryPwd1=a.nextLine();
	//check tryPwd to inputPwd
	if (tryPwd1.equals("admin")){
	System.out.println("success");
	}
	else {
		throw new Exception("input name does not match records");
	}
//view all accts-----------------------------------------------------------------------------------------------------------		
	System.out.println("would you like to view all accounts?");
	String adminAction=a.nextLine();
	if(adminAction.equals("yes")) {
		System.out.println("customer"+inputs);
		System.out.println("customer"+inputs2);
		System.out.println("admin"+admin);
		System.out.println("employee"+employee);
	}
	else {
		System.out.println("");
	}
//approve/deny------------------------------------------------------------------------------------------------------------
	System.out.println("would you like to approve/deny accts?");
	String adminAction2=a.nextLine();
	
	if(adminAction2.equals("yes")) {
		System.out.println("customer"+inputs);
		System.out.println("approve or deny?");
		String adminAction3=a.nextLine();
		usr1.setOpn(adminAction3);
		System.out.println("customer"+inputs+adminAction3);
		
		System.out.println("customer"+inputs2);
		System.out.println("approve or deny?");
		String adminAction4=a.nextLine();
		usr2.setOpn(adminAction4);
		System.out.println("customer"+inputs2+adminAction4);
	}
	
	else {
		System.out.println("");
	}
//delete accts--------------------------------------------------------------------------------------------------------
	System.out.println("would you like to delete accts?");
	String adminAction5=a.nextLine();
	
	if(adminAction5.equals("yes")) {
		System.out.println("customer"+inputs);
		System.out.println("delete?");
		String adminAction6=a.nextLine();
		if (adminAction6.equals("yes")) {
			usr1=null;
		}
		else {
			System.out.println("");
		}
		
		System.out.println("customer"+inputs2);
		System.out.println("delete?");
		String adminAction7=a.nextLine();
		if (adminAction7.equals("yes")) {
			usr2=null;
	}
	
	else {
		System.out.println("");
		}
	}
		else {
			System.out.println("");
		}
	
//view transactions---------------------------------------------------------------------------------------------------------------------------
	System.out.println("would you like to view transactions?");
	String adminAction8=a.nextLine();
	
	if(adminAction8.equals("yes")) {
	System.out.println("transactions");
	}
	else {
		System.out.println("");	
	}
//admin cash move---------------------------------------------------------------------------------------------------------------------------------	
	System.out.println("would you like to deposit, withdrawl, or transfer?");
	String adminAction9=a.nextLine();
	System.out.println("amount?");
	String amnt0=a.nextLine();
	double amnt1 = Double.parseDouble(amnt0);
	if(amnt1 > 0.00) {
		System.out.println("your new balance is:");
	}
	else
		throw new Exception("enter non-negative amount");
		
	if (adminAction9.equals("withdrawl")) {
		Main wdl = new Main(300000,amnt1);
		System.out.println(wdl.withdrawl());
	}
	else if (adminAction9.equals("deposit")) {
		Main dep = new Main(300000,amnt1);
		System.out.println(dep.deposit());
	}
	else if (adminAction9.equals("transfer")) {
		Main trn = new Main(300000,amnt1);
		System.out.println(trn.withdrawl());
		System.out.println(amnt1+" transferred");
	
	}
	

}
}
