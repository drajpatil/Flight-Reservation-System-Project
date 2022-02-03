package FlightReservationSystem;

import java.util.Date;

public class Paypal {
    private String name;
    private String cardNumber;
    private Date expires;
    public boolean pay(double amount) {
		return false;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getExpires() {
		return expires;
	}
	public void setExpires(Date expires) {
		this.expires = expires;
	}
}
