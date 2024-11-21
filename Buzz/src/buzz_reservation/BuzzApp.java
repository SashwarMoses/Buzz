package buzz_reservation;

import java.util.ArrayList;
import java.util.Scanner;

public class BuzzApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Bus> buses = new ArrayList<Bus>(); 
		buses.add(new Bus(1,"A",2));
		buses.add(new Bus(2,"N/A",45));
		buses.add(new Bus(3,"A",48));
		
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		
		for(Bus b: buses) {
			b.displayBusInfo();
		}
		int bookOpt =1;
		while (bookOpt == 1){
			System.out.println("Enter 1 to book and 2 to exit");
			Scanner s = new Scanner(System.in);
			bookOpt = s.nextInt();
			if(bookOpt == 1) {
				Booking bkg = new Booking();
				if(bkg.isAvailable(bookings,buses)) {
					bookings.add(bkg);
					System.out.println("Your Booking is confirmed!");
				}
				else {
					System.out.println("Sorry, the bus is full, Try another bus or date...");
				}
			}
			}
		if(bookOpt == 2) {
			System.out.println("Thanks for using our service! Safe travels from Buzz...");
		}
	}

}
