package Test1;

public class Room {
	private int roomNumber;
	private int capacity;
	private double pricePerNight;
	private String checkIn=null;;
	private String checkOut=null;
	
	@Override
	public String toString() {
		return "Room [roomNumber=" + roomNumber + ", capacity=" + capacity + ", pricePerNight=" + pricePerNight
				+ ", checkIn=" + checkIn + ", checkOut=" + checkOut + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	public Room(int roomNumber, int capacity, double pricePerNight) {
		this.roomNumber = roomNumber;
		this.capacity = capacity;
		this.pricePerNight = pricePerNight;
	}
	public boolean checkAvailability(int persons)
	{
		if(capacity<persons)
		{
			return false;
		}
		return true;
	}
	public void reservation(int persons)
	{
		if(checkAvailability(persons)==true)
		{
			System.out.println("Room is available");
		}
		else
		{
			System.out.println("Room is not available");
		}
	}
	public void reservation(int persons,String checkIn,String checkOut)
	{
		if(checkAvailability(persons)==true)
		{
			System.out.println("Room "+roomNumber+ " is available");
		}
		else
		{
			System.out.println("Room "+roomNumber+ " is not available");
		}
	}
	public static void main(String[] args)
	{
		Room r=new Room(1,4,3000);
		r.reservation(3, "17-08-2023", "18-08-2023");
		Room r1=new Room(2,4,3000);
		r1.reservation(5, "18-08-2023", "19-08-2023");
	}

}
