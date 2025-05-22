
public class Airline {

	private String title;
	private Flight[] flights;
	private int size;
	
	/**
	 * Creates an Airline which will hold flights for the specific airline
	 * @param title
	 */
	public Airline(String title) {
		this.title = title;
		flights = new Flight[size];
		this.size = 2;
	}

	/**
	 * Adds a flight to the array 
	 * @param flightNum
	 * @param from
	 * @param to
	 * @param duration
	 * @param transfers
	 */
	public void addFlight(String flightNum, String from, String to, int duration, int transfers) {
		Flight flight = new Flight(flightNum, from, to, duration, transfers);
		
		for(int i = 0; i < flights.length; i++) {
			if(flights[i] == null) {
				flights[i] = flight;
			}
			else {
				this.growArray(flights);
			}
		}
	}
	
	/**
	 * Return the title
	 * @return title
	 */
	public String getTitle() {
		return this.title;
	}
	
	/**
	 * Doubles the size of the array
	 * @param flights
	 * @return the same array doubled in size with the same information
	 */
	private Flight[] growArray(Flight[] flights) {
		Flight[] newFlights = new Flight[flights.length * 2];
		for(int i = 0; i < flights.length; i++) {
			newFlights[i] = flights[i];
		}
		size = size*2;
		return newFlights;
	}
	
	/**
	 * returns a flight iterator
	 * @return a new flightIterator
	 */
	public FlightIterator createIterator() {
		return new FlightIterator(flights);
	}
}
