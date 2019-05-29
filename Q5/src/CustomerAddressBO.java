import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
public class CustomerAddressBO {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    public List<Customer> populateCustomers(List<String> csvList) throws Exception
    {
    	List<Customer> li=new ArrayList<Customer>();
    	for(String value:csvList){
    		String[] strArr =value.split(",");
    		Customer c=new Customer(Long.parseLong(strArr[0]), strArr[1], strArr[2].charAt(0), strArr[3], strArr[4], sdf.parse(strArr[5]));
    		li.add(c);
    	}
    	return li;
        //fill code here.
    }
    public List<Customer> findCustomerNameFromList(List<Customer>customers,String subString) throws Exception
    {
        //fill code here.
    	List<Customer> li=new ArrayList<Customer>();
    	for(Customer c:customers){
    		if(c.getName().contains(subString)){
    			li.add(c);
    		}
    	}
    	return li;
    }
    
    
}
