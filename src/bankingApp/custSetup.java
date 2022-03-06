package bankingApp;

import java.util.Scanner;
import java.util.ArrayList;

public class custSetup {
			
	public static void main(String[] args) throws Exception {
		
		Scanner d=new Scanner(System.in);
		
		ArrayList <String> inputs =new ArrayList<String>();
		
		System.out.println("set user name");
		String inputUsrNm=d.nextLine();
		inputs.add(inputUsrNm);
		//save iteratively, array maybe.. do while loop
		
		System.out.println("set password");
		String inputPwd=d.nextLine();
		inputs.add(inputPwd);
		//save iteratively
		
		System.out.println("How much would you like to deposit?");
		String inputD=d.nextLine();
		 double inputDep = Double.parseDouble(inputD);
		inputs.add(inputD);
				
		System.out.println("Are you opening joint or individual acct?");

			try {
			String inputAcctType=d.nextLine();
			
			if (inputAcctType.equals("individual") || inputAcctType.equals("joint")){
				inputs.add(inputAcctType);
				
			System.out.println("account pending approval");
			}
			else {
				throw new Exception("type only joint or individual");
			}
			}
			finally {
			d.close();
			}
			
			
			//String usr, String pwd, Double bal, String typ, String opn
			UsrMain usr1 = new UsrMain(inputUsrNm,inputPwd,inputDep,"joint", "opn");
			System.out.println(usr1);
			//System.out.println(usr1);
			System.out.println(inputs);
			//run lines 15 to 42 one more time. will save new values in string array.
	}
}
		
		

