package bankingApp;

public class UsrMain {

	
	private String usr;
	private String pwd;
	private Double bal;
	private String typ;
	private String opn;
	private double acctBal;
	private double amount;
	//transaction and target account variables
	 
	
	public UsrMain() {
		usr = "";
		pwd="";
		bal=0.00;
		typ="";//admin and emp will go under type (ind, joint, enp, admin)
		opn="pending";
		
	}
	
	public UsrMain(String usr, String pwd, Double bal, String typ, String opn) {
		this.usr = usr;
		this.pwd = pwd;
		this.bal = bal;
		this.typ = typ;
		this.opn = opn;
		
		
		
	}
			
	    public String getUsr() {
	        return usr;
	    }
	    
	    public String getPwd() {
	        return pwd;
	    }
	    public double getBal() {
	        return bal;
	    }
	    public String getTyp() {
	        return typ;
	    }
	    public String getOpn() {
	        return opn;
	    }

	    public void setUsr(String h) {
	        usr = h;
	    }
	    public void setPwd(String m) {
	        pwd = m;
	    }
	    public void setBal(Double f) {
	        bal = f;
	    }
	    public void setTyp(String s) {
	        typ = s;
	    }
	    public void setOpn(String d) {
		     opn = d;
		}
	  
	   
}
