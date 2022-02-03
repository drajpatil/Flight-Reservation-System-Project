package FlightReservationSystem;

import javax.xml.crypto.Data;

public class Notification {
    private int notificationId;
    Data CreatedOn;
    private String content;
    boolean send() {
		return false;
	}
	public int getNotificationId() {
		return notificationId;
	}
	public void setNotificationId(int notificationId) {
		this.notificationId = notificationId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
