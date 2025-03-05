package Style2Programming;

public class BankMainClass {
 
	public static void main(String[] args) {
		Bank bankacc1 = new Bank();
		Bank bankacc2 = new Bank();
		
		bankacc1.bankAccount("Shanker", 9876543234L, 125000, "savings", "INDB2314");
		bankacc1.displayAccountDetails();
		
		bankacc2.bankAccount("Ash", 5109864325L, 800000, "Current", "SBIG6578");
		bankacc2.displayAccountDetails();
	}
}
