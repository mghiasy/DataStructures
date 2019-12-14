package proj11_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeAdmin {
	
	/**
		Returns a list of Employees whose social security number is on the input list socSecNums
		and whose salary is > 80000. The list must be ordered by social security number,
		from lowest to highest. To sort, you must use a Collections sorting method
		and you must define your own Comparator to be used to compare Employees by ssn. 
	*/
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {

		List<Employee> emps = new ArrayList<Employee>();
		for (Map.Entry<String, Employee> t : table.entrySet()) {
			if(socSecNums.contains(t.getKey()) && t.getValue().getSalary() >80000){
				emps.add(t.getValue());
			}
		}
		//use comparable
		//Collections.sort(emps);
		
		//use comparator
		Collections.sort(emps, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getSsn().compareTo(o2.getSsn());
			}
		});
		return emps;
	}
	
	/**
		Returns a list of Employees whose social security number is not in the input list socSecNums
	*/
	public static List<Employee> findSsnIsNotInList(HashMap<String, Employee> table, List<String> socSecNums) {
		List<Employee> emps = new ArrayList<Employee>();
		for (Map.Entry<String, Employee> t : table.entrySet()) {
			if(!socSecNums.contains(t.getKey())){
				emps.add(t.getValue());
			}
		}
		
		return emps;
	}
}
