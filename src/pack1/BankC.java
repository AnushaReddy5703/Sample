package pack1;

public class BankC extends Bank {
	int getBalance=200;
    void getBalance() {
    	System.out.println("BankC balance : $" +getBalance);
		
	}
    public static void main(String[] args) {
    	BankA bankA = new BankA();
    	bankA.getBalance();
    	BankB bankB = new BankB();
    	bankB.getBalance();
    	BankC bankC = new BankC();
    	bankC.getBalance();
    	
    }

}
