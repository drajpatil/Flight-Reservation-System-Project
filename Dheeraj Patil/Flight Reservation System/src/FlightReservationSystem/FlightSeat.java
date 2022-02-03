package FlightReservationSystem;

public class FlightSeat extends Seat{
    private int fare;
    public enum FlightStatus {
        ACTIVE,
        SCHEDULED,
        DELAYED,
        DEPARTED
    }
	public int getFare() {
		return fare;
	}
	public void setFare(int fare) {
		this.fare = fare;
	}

}
