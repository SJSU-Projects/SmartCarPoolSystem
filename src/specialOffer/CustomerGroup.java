package specialOffer;

import java.util.ArrayList;

import com.mysql.fabric.xmlrpc.base.Member;

import membership.Customer;
import membership.Driver;
import notification.CustomerNotification;
import notification.EmailNotification;
import notification.Message;
import notification.NotificationCenter;
import payment.EstimatePayment;
import rules.RideRule;

public class CustomerGroup implements iUserGroup{
	
	ArrayList<Customer> customer;
	String name;
	Customer temp_cust;
	
	
	public CustomerGroup(String i_name)
	{
		this.name = i_name;
	}
	
	@Override
	public void update(double discount) {
		
		NotificationCenter notify;
		Message message;
		message = new EmailNotification();
		
		notify = new CustomerNotification(message,
				"Dear "+ name + ", You have recieved discount on your next ride of % :" + discount);
		notify.memberNotification();		
	}
}
