package pack1;

public class ICICI extends RBI {
	ICICI(Customer customer,Account account)
	{
		super(customer,account);
	}
	public static void main(String[] args) 
	{
		Customer customer=new Customer("Janu", 25);
		Account account =new Account(453638,30000.0);
		
		RBI sbi=new SBI(customer, account);
		RBI icici = new ICICI(customer, account);
		double sbiInterestRate = sbi.getInterestRate();
        double iciciWithdrawalLimit = icici.getWithdrawalLimit();

        System.out.println("SBI Interest Rate: " + sbiInterestRate);
        System.out.println("ICICI Withdrawal Limit: " + iciciWithdrawalLimit);
	}
}
