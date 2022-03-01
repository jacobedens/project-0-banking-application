package bankingApp;

import java.util.Scanner;

public class custAcctAction {

	public static void main(String args[]) {
		
Scanner a=new Scanner(System.in);
		
		System.out.println("enter user name");
		String tryUsrnmm=a.nextLine();
		//check tryUsr to inputUsr
		
		System.out.println("enter password");
		String tryPwd=a.nextLine();
		//check tryPwd to inputPwd
		
		System.out.println("which account?");
		String tryAcctType=a.nextLine();
	
		System.out.println("would you like to withdrawl, transfer, or deposit funds?");
		String acctAction=a.nextLine();
		//define these three methods with exception handling. Make private. Admin will get.
		//if functionality required include value update operations and destination accts (with value update operations)
		
		
		System.out.print("amount?");
		
		try {
			String inputAcctType=d.nextLine();
			{
			if !inputAcctType.equals("individual") || !inputAcctType.equals("joint");
			}
			throw new acctTypeError("type only joint or individual");
			{
			else ("account pending approval");
			}
			}
		}
		
	}

}
