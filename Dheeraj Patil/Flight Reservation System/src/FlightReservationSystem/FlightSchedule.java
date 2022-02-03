package FlightReservationSystem;

import java.util.Date;
import java.util.List;

public class FlightSchedule {
    Flight flight;
    private Date departureTime;
    private String gate;
    private FlightStatus status;

    private List<FlightSeat> fseats;

	public Date getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	public String getGate() {
		return gate;
	}

	public void setGate(String gate) {
		this.gate = gate;
	}

	public FlightStatus getStatus() {
		return status;
	}

	public void setStatus(FlightStatus status) {
		this.status = status;
	}

	public List<FlightSeat> getFseats() {
		return fseats;
	}

	public void setFseats(List<FlightSeat> fseats) {
		this.fseats = fseats;
	}
}
