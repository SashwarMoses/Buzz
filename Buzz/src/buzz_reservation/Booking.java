package buzz_reservation;

import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Booking {
	String passengerName;
	int busNo;
	LocalDate d = null;

	Booking() {
		System.out.println("Enter Your Name :");
		Scanner s = new Scanner(System.in);
		passengerName = s.nextLine();
		System.out.println("Enter the bus Number :");
		busNo = s.nextInt();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println("Enter the Date :");
		while (d == null) {
			String dateInput = s.nextLine();
			try {
				d = LocalDate.parse(dateInput, dtf);
			} catch (DateTimeParseException e) {
				System.out.println("Be sure to enter this format (In dd-MM-yyyy)");
				continue;
			}
		}

	}

	public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
		int capacity = 0;
		int booked = 0;
		for (Bus bus : buses) {
			if (bus.getBusNo() == busNo) {
				capacity = bus.getCapacity();
			}
		}
		for (Booking bkng : bookings) {
			if (bkng.busNo == busNo && bkng.d.equals(d)) {
				booked++;
			}
		}
		return booked < capacity ? true : false;
	}
}
