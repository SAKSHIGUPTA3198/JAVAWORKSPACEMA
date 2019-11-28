package com.lti.account.demo;

public class SavingAccount extends Account {

	double wAmt;
	double dAmt;
	public SavingAccount() {
		super();
	}

	public SavingAccount(double balAmt, double minBal,double wAmt,double dAmt) {
		super(balAmt, minBal);
		this.dAmt=dAmt;
		this.wAmt=wAmt;
	}                                                          
	public SavingAccount(double balAmt, double minBal) {
		super(balAmt, minBal);
		
	}
	public void Withdraw(){
		balAmt=balAmt-wAmt;
		System.out.println("Your remaining Balance is:"+balAmt);
	}
		

	
public void Deposit(){                                                                       
	balAmt=balAmt+dAmt;                                                                                                                       
System.out.println("Your New Balance is: "+balAmt);
}


@Override
public String toString() {
	return "SavingAccount [wAmt=" + wAmt + ", dAmt=" + dAmt + ", balAmt=" + balAmt + ", minBal=" + minBal + "]";
}



}
	
	
	
	

