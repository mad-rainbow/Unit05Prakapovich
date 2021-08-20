package lt.lhu.unit05_03.bean;

public class Train {
	
	private String destination;
	private String number;
	private String departure;
	
	public Train() {
		destination = "";
		number = "";
		departure = "";
		}
	
	public Train(String destination, String number, String departure) {
		this.destination = destination;
		this.number = number;
		this.departure = departure;
	}
	
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}

	@Override
	public String toString() {
		return "Train [destination=" + destination + ", number=" + number + ", departure=" + departure + "]";
	}
	
	

}
