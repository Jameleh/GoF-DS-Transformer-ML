import java.util.Iterator;

public class FlightIterator implements Iterator{
	
	private Flight[] flights;
	private int position;

	/**
	 * Initializes an array of flights
	 * @param flights
	 */
	public FlightIterator(Flight[] flights) {
		this.flights = flights;
		this.position = 0;
	}

	/**
	 * determines if there is another flight in the array
	 * @return boolean if there is a flight
	 */
	public boolean hasNext() {
		return position < flights.length && flights[position] != null;
	}
	
	/**
	 * Creates a new flight for every item in the array, calls 
	 * hasNex() to determine if there is another flight
	 * @return Flight: specific flight in array
	 */
	public Flight next() {
		if(!hasNext()) {
			return null;
		}
		Flight flight = flights[position];
		position = position + 1;
		return flight;
	}
}
