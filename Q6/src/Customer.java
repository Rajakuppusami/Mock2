import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;



public class Customer{

    private Integer id;
    private String name;
    private String email;
    private String state;
    private String country;

    public Customer(){}

   
    
    public Customer(Integer id, String name, String email, String state, String country) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.state = state;
		this.country = country;
	}

	//Generate getters and setters.

    //fill code here.
    
    public static List<Customer> customerList = new ArrayList<>();
  
    public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public static List<Customer> getCustomerList() {
		return customerList;
	}



	public static void setCustomerList(List<Customer> customerList) {
		Customer.customerList = customerList;
	}



	public static Map<String, Integer> convertCsvToMap(List<String> csvDetails)
    {
        //fill code here.
		for(String value:csvDetails){
			
		}
    }
 
    public static List<Customer> getCustomerListFromMap(Map<String, Integer> customerMap)
    {
        //fill code here.
    	List<Customer> li=new ArrayList<Customer>();
    	for(Map.Entry<String, Integer> entry : customerMap.entrySet()){
    		
    	}
    }
    
}
