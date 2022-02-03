package FlightReservationSystem;

import java.util.Date;

public class MobileTransaction {
    private String serviceProvider;
    private int mobileNumber;
    private Date expires;
    public  boolean pay(double amount) {
		return false;
	}
	public int getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getServiceProvider() {
		return serviceProvider;
	}
	public void setServiceProvider(String serviceProvider) {
		this.serviceProvider = serviceProvider;
	}
	public Date getExpires() {
		return expires;
	}
	public void setExpires(Date expires) {
		this.expires = expires;
	}
}
