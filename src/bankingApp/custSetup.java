package bankingApp;

import java.util.Scanner;

public class custSetup {

	static String usr1 = "asdf";
	static String usr2 = "jkl";
	static String pwd1 = "asdf";
	static String pwd2 = "fdsa";
	static String typ1 = "joint";
	static String typ2 = "indv";
	
	public static void main(String[] args) {
		
		Scanner d=new Scanner(System.in);
		
		System.out.println("set user name");
		String inputUsrnm=d.nextLine();
		//save iteratively probably as list
	
		System.out.println("set password");
		String inputPwd=d.nextLine();
		//save iteratively probably as list		
		
		System.out.print("Are you opening joint or individual acct?");
		
			try {
			String inputAcctType=d.nextLine();
			{
			if !inputAcctType.equals("individual") || !inputAcctType.equals("joint")
			}
			throw new acctTypeError("type only joint or individual");
			{
			else 
			}
			System.out.println("account pending approval");
			}
			}
				
		}
	}

