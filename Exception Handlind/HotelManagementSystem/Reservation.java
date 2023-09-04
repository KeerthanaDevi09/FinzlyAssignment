package exception.hotelManagementSystem;

public interface Reservation {
	void makeReservation() throws InvalidReservationException;

	void cancelReservation();

}
