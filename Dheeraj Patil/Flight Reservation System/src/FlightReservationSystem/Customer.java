package FlightReservationSystem;

public class Customer {
    private String name;
    private Address email;
    private String MbNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getEmail() {
		return email;
	}
	public void setEmail(Address email) {
		this.email = email;
	}
	public String getMbNo() {
		return MbNo;
	}
	public void setMbNo(String mbNo) {
		MbNo = mbNo;
	}
}
