package notification;

public class SMS extends Message {

	public SMS() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void customerNotification(String message) {
		System.out.println("SMS Notification to customer : " + message);
	}

	@Override
	public void driverNotification(String message) {
		System.out.println("SMS Notification to driver : " + message);
	}	

}
