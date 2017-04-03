package rules;
import DAO.MySQLAccess;
import DAO.*;
/**
 * 
 * @author hegde
 *
 */
public class PaymentRule {
	
	MySQLAccess mySQLAccess=new MySQLAccess();
	
	public double getRule1(){
		
		double pricePerHour=mySQLAccess.getCarFare();
		
		return pricePerHour;
	}
	
	public double getRule2(){
		
		double pricePerMile=mySQLAccess.getParkingFare();
		
		return pricePerMile;
	}	

}
