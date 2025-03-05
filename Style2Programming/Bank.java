package Style2Programming;

public class Bank {
	private String accHolderName;
	private long accNum;
	private double accBal;
	private String accType;
	private String ifscCode;
	
	public void bankAccount(String accHolderName,long accNum,double accBal,String accType,String ifscCode)
	{
		if (BankValidation.accHolderNameValidation(accHolderName)) 
			this.accHolderName = accHolderName;
		else
			System.err.println("Invalid name of the account holder..");
		
		if (BankValidation.accNumValidation(accNum))
			this.accNum = accNum;
		else 
			System.err.println("Invalid account number..");
		
		if (BankValidation.accBalValidation(accBal)) 
			this.accBal = accBal;
		else
			System.err.println("Invalid Account balance limit...");
		
		if (BankValidation.accTypeValidation(accType))
			this.accType = accType;
		else
			System.err.println("Invalid account type...");
		
		if (BankValidation.ifscCodeValidation(ifscCode))
			this.ifscCode = ifscCode;
	}
	
	public double calcInterest() {
		double interest=0 ;
		if (loanEligibilty().equals("Yes")) {
			if (accType.equalsIgnoreCase("Savings"))
				interest = 0.05*accBal;
			else if (accType.equalsIgnoreCase("Current"))
				interest = 0.02*accBal;
		}
		return interest;
	}
	
	public String loanEligibilty() {
		if (accBal>=50000) 
			return "Yes";
		else
			return "No";
	}
	
	public void displayAccountDetails() {
		System.out.println("-----------Account details---------------");
		System.out.println("Account holder name : "+accHolderName);
		System.out.println("Account number      : "+accNum);
		System.out.println("Account Balance     : "+accBal);
		System.out.println("Account Type        : "+accType);
		System.out.println("Bank IFSC code      : "+ifscCode);
		if (loanEligibilty().equals("Yes")) {
			System.out.println("Eligibile for loan  : "+loanEligibilty());
			System.out.println("Interest amount     : "+calcInterest());
		}
		else {
			System.out.println("Not eligible for the loan..");
		}	
	}

}
