package buzz_reservation;

public class Bus {

	private int busNo;
	private String ac;
	private int capacity;

	Bus(int busNo, String ac, int capacity) {
		this.busNo = busNo;
		this.ac = ac;
		this.capacity = capacity;
	}

	public int getBusNo() {
		return busNo;
	}

	public String getAc() {
		return ac;
	}

	public void setAc(String ac) {
		ac = ac;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		capacity = capacity;
	}
	public void displayBusInfo() {
		System.out.println("Bus No.: "+busNo+"   A/c: "+ac+"   Capacity: "+capacity+"\n");
	}

}
