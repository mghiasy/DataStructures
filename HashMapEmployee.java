package DataStructure;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapEmployee {
	private String firstName;
	private String lastName;
	private HashMap<String, Double> salaryRecord;
	
	
	public HashMapEmployee() {
		salaryRecord= new HashMap<>();
	}
	
	//This method inserts into the hashtable a paycheck amount matched with a particular date
	public void addEntry(String date, double salary) {
		salaryRecord.put(date, salary);
	}
	
	//Jim Jones was paid 3085.0 on 3/15/2006 
	//or Jim Jones did not receive a paycheck on 5/15/2005
	public void printPaymentAmount(String date) {
		
		String ret ;
		if(salaryRecord.containsKey(date)) {
			double salary =salaryRecord.get(date);			
			ret =this.getFirstName() + " "+ this.getLastName() +" was paid "+ salary + " on " +date;
		}
		else {
			ret = this.getFirstName() + " "+ this.getLastName() + " did not receive a paycheck on " +date;
		}
		System.out.println(ret);
	}
	
	//Average paycheck for Jim Jones was 3097.5
	public void printAveragePaycheck() {
		double totalReceive=0;
		for (Entry<String,Double> salaryRec : salaryRecord.entrySet()) {
			totalReceive += salaryRec.getValue();
		}
		double avaragePay= totalReceive / salaryRecord.size();
		System.out.println("Avarage paycheck for " + this.getFirstName() +" " + this.getLastName()+ " was "+ avaragePay);
	}
	
	public static void main(String[] args) {
		
		HashMapEmployee e = new HashMapEmployee();
		e.setFirstName("Jim");
		e.setLastName("Jones");
		for(int i = 0; i < 12; ++i) {
			e.addEntry(i+"/15/2011", 3070+5*i);
		}
		e.printPaymentAmount("3/15/2011");
		e.printPaymentAmount("5/15/2010");
		e.printAveragePaycheck();
		
	
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
