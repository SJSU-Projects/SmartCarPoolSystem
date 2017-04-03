package rules;
import DAO.MySQLAccess;
/**
 * 
 * @author hegde
 *
 */
public class RideRule extends Rule {

	MySQLAccess mySQLAccess=new MySQLAccess();
	public int getRule1(){
		
		int waitingDuration=mySQLAccess.getDuration();
		return waitingDuration;
	}
	
	public int getRule2(){
		
		int MaxNumOfCustomers=mySQLAccess.getMaxNumber();
		return MaxNumOfCustomers;
	}

	
}
