package specialOffer;
/* Customer Offers
 * @author = Pavani Vellal
 * Customer gets discount on each ride
*/

import java.util.ArrayList;

import com.mysql.fabric.xmlrpc.base.Member;

import membership.Customer;

public class CustomerOffers extends Offers {

	// Discount Percentage
	double discount_p;
	
	public CustomerOffers(double offer){
		discount_p = offer;		
	}
	
	public double getDiscount() {
		return discount_p;
	}

	public void setDiscount(double discount_p) {
		this.discount_p = discount_p;
		notifySubscriber(discount_p);
	}
}
