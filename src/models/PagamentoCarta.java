package models;

import java.time.Month;

public class PagamentoCarta extends Pagamento {
	
	private String cardNumber;
	private int pinCode;
	// expiration date
	private Month month;
	private int day;

	public PagamentoCarta(String name, String lastName, String cardNumber, int pinCode, Month month, int day) {
		super(name, lastName);
		this.cardNumber = cardNumber;
		this.pinCode = pinCode;
		this.month = month;
		this.day = day;
	}
	
	public void insertCardDetails(String cardNumber, int pinCode, Month month, int day) {
		if(cardNumber.equals(this.cardNumber) && 
		   pinCode == this.pinCode && 
		   month == this.month && 
		   day == this.day) setAccepted(true);
		else setAccepted(false);
	}

	@Override
	public void paga(double importo) {
		// TODO input cardNumber and pinCode
		// insertCardDetails(cardNumber, pinCode);
		
		if(isAccepted()) System.out.println("Payment by card successful");
		else System.out.println("Payment failed. Try again");
	}
	
}
