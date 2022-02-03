package FlightReservationSystem;

import java.util.List;

public class Airport {
    private String name;
    private Address address;
    private String code;
    public List<Flight> flightList;
    public List<Flight> getFlightList;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
}
