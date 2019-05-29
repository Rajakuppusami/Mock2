import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    
    public static void main(String[] args) throws IOException, ParseException {
        
        String id,name,email,contactNumber,createdOn,gender; 
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i;
        ArrayList<Customer> customerList = new ArrayList<>();
        for(i=0;i<2;i++) {
            System.out.println("Customer"+(i+1)+" :");
            System.out.println("id: ");
            id = br.readLine();
            System.out.println("name: ");
            name = br.readLine();
            System.out.println("Gender: ");
            gender = br.readLine();
            System.out.println("email: ");
            email = br.readLine();
            System.out.println("contact number: ");
            contactNumber = br.readLine();
            System.out.println("createdOn: ");            
            createdOn = br.readLine();
            Date date=sdf.parse(createdOn);
            //Customer customer = new Customer(Long.parseLong(id), name, gender.charAt(0), email, contactNumber, date);
            Customer customer=new Customer();
            customer.setId(Long.parseLong(id));
            customer.setName(name);
            customer.setGender(gender.charAt(0));
            customer.setEmail(email);
            customer.setContactNumber(contactNumber);
            customer.setCreatedOn(date);
            customerList.add(customer);
            //fill code here.
        }
        for(Customer value:customerList){
        	System.out.println("Customer id "+value.getId());
        	System.out.println(value.toString());
        }
        //fill code here.
        if(customerList.get(0).equals(customerList.get(1))) {
            System.out.println("Customer 1 is same as Customer 2");
        }
        else {
            System.out.println("Customer 1 and Customer 2 are different");
        }
        
    }
    
}
