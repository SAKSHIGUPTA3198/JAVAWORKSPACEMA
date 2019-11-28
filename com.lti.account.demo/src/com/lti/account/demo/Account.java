package com.lti.account.demo;

public class Account {

	double balAmt;
		double minBal;
		
		                                                              

		public Account(double balAmt, double minBal) {
			super();
			this.balAmt = balAmt;
			this.minBal = minBal;
		}

		public Account() {
			super();
		}
		@Override
		public String toString() {
			return "Account [balAmt=" + balAmt + ", minBal=" + minBal + "]";
		}

		
		
		

		
		
		

		
	
}
