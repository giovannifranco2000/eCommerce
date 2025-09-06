package models;

public class PagamentoPaypal extends Pagamento {
	
	private String email;
	private String password;
	private int OTP;
	
	public PagamentoPaypal(String name, String lastName, String email, String password) {
		super(name, lastName);
		this.email = email;
		this.password = password;
	}
	
	public void generateOTP() {
		// TODO randomly generate a 6 digit number
		// print the number in console and set the value of this.OTP
		// the user will input the number they see on screen in the insertPaypalCredentials method
	}
	
	public void insertPaypalCredentials(String email, String password, int OTP) {
		if(email.equals(this.email) && 
		   password.equals(this.password) && 
		   OTP == this.OTP) setAccepted(true);
		else setAccepted(false);
	}

	@Override
	public void paga(double importo) {
		// TODO input email and password
		// show OTP on screen
		// insertPaypalCredentials(cardNumber, pinCode);
		
		if(isAccepted()) System.out.println("Payment by card successful");
		else System.out.println("Payment failed. Try again");
	}
	
}
