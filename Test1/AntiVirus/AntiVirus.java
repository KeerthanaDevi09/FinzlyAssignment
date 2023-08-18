package Test1.Antivirus;

public class AntiVirus {
	private final String productKey;
	private boolean isActivate;
	public AntiVirus() {
		this.productKey = null;
		System.out.println("You are using free version. Please upgrade!!!");
		
	}
	public AntiVirus(String productKey) {
		this.productKey = productKey;
		this.isActivate=false;
		System.out.println("Please make a payment to approve product key");
	}
	public void statusOfAntiVirus(Transaction t) {
		if(t.makePayment()) {
			isActivate=true;
			System.out.println("Anti-Virus Activation is successful");
		}
		else
		{
			System.out.println("Payment Not done. Please make transaction to approve anti virus");
		}
	}
}


