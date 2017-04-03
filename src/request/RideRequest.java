package request;
/**
 * 
 * @author VidyaKhadsare
 */
import java.io.BufferedReader;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class RideRequest extends Request {

	private Location srcLocation;
	private Location destLocation;
	private Date dateTime;
	private int customerID;
	private int driverID;
	private String userName;
	private double fare;
	private BufferedReader reader;
	int driverRating;

	enum carType {
		fiveSeater, eightSeater
	};

	carType carTyp;

	/**
	 * Getter and setters for all members
	 */
	public RideRequest() {
	}

	public Location getSource() {
		return srcLocation;
	}

	public Location getDestination() {
		return destLocation;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public Date setDateTime(Date date) {
		return this.dateTime = date;
	}

	public void setCustomerID(int id) {
		this.customerID = id;
	}

	public void setDriverID(int id) {
		this.driverID = id;
	}

	public int getCustomerID() {
		return this.customerID;
	}

	public int getDriverID() {
		return this.driverID;
	}

	public String getCarType() {
		return this.carTyp.toString();
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	public double getFare() {
		return this.fare;
	}

	public int getDriverRating() {
		return driverRating;
	}

	public void setDriverRating(int rating) {
		this.driverRating = rating;
	}

	/**
	 * Accept Source Co-Ordinates (X,Y)
	 */
	public void acceptSource() {
		System.out.println("Source Co-Ordinates (X,Y) : ");
		input = keyboard.nextLine();
		numbersStr = input.split(",");
		srcLocation = new Location(Integer.parseInt(numbersStr[0]), Integer.parseInt(numbersStr[1]));
	}

	/**
	 * Accept Destination Co-Ordinates (X,Y)
	 */
	public void acceptDestination() {
		System.out.println("Destination Co-Ordinates (X,Y) : ");
		input = keyboard.nextLine();
		numbersStr = input.split(",");
		destLocation = new Location(Integer.parseInt(numbersStr[0]), Integer.parseInt(numbersStr[1]));
	}

	/**
	 * Accept Driver Rating
	 */
	public void acceptDriverRating() {
		System.out.println("Enter driver rating (0 - 5) : ");
		input = keyboard.nextLine();
		setDriverRating(Integer.parseInt(input));
	}

	/**
	 * Accept User Name
	 */
	public void acceptUserName() {
		System.out.println("User Name : ");
		input = keyboard.nextLine();
		userName = input;
	}

	/**
	 * Accept Car Type
	 */
	public void acceptCarType() {
		System.out.println("Enter the type of a car :");
		System.out.println("1.Five seater");
		System.out.println("2.Eight seater");
		input = keyboard.nextLine();

		if (input.equals("1")) {
			carTyp = carType.fiveSeater;
		} else if (input.equals("2")) {
			carTyp = carType.eightSeater;
		} else {
			System.out.println("Invalid Input!");
		}
	}

	/**
	 * Accept booking date
	 */
	public java.sql.Date getInputBookingDate() {
		try {
			System.out.println("Booking Date[MM/dd/yyyy hh:mm]: ");

			SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy hh:mm");
			input = keyboard.nextLine();
			java.util.Date parsed = (java.util.Date) format.parse(input);
			dateTime = new java.sql.Date(parsed.getTime());
			return dateTime;
		} catch (Exception e) {
		}
		return null;
	}

	/**
	 * Display
	 */
	@Override
	public void display() {
		Location loc;
		System.out.println("\nRequest generated for a new Ride!!!");
		System.out.println("Request Details: ");
		loc = getSource();
		System.out.println("Source: " + loc.getX() + "," + loc.getY());
		loc = getDestination();
		System.out.println("Destination: " + loc.getX() + "," + loc.getY());
		System.out.println("Date and Time: " + getDateTime());
	}

}
