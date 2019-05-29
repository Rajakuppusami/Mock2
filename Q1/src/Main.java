import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sb = "Menu\n1. Parse Name\n2. Valid Email\n3. Play Contact Number\n4. User Lifetime\n5. Exit";
        while(true)
        {
            System.out.println(sb);
            
            int inp = Integer.parseInt(br.readLine());
            switch(inp) {
                case 1: 
                	parseName(br);
                    break;
                
                case 2: 
                    //fill code here.
                	isValidEmail(br);
                    break;
                
                case 3: 
                    //fill code here.
                	playContactNumber(br);
                    break;
                
                case 4: 
                    //fill code here.
                	userLifeTime(br);
                    break;
                    
                case 5:
                    //fill code here.
                	System.exit(0);
                	break;
            }
        }
    }
    
    public static void parseName(BufferedReader br) throws Exception
    {
        System.out.println("Enter name:");
        String name = br.readLine();
        name=name.replaceAll("[^A-Za-z0-9 ]", " ");
        System.out.println(name);
	//fill code here.
    }
    public static void isValidEmail(BufferedReader br) throws Exception
    {
        System.out.println("Enter E-mail id:");
        String email = br.readLine();
        if(email.matches("[a-z]{1}[A-za-z0-9]*[@]{1}[a-z]+.org$")||email.matches("[a-z]{1}[A-za-z0-9]*[@]{1}[a-z]+.com$")||email.matches("[a-z]{1}[A-za-z0-9]*[@]{1}[a-z]+.net$"))
            System.out.println("Email id is valid");
        else
            System.out.println("Email is invalid");
    }
    public static void playContactNumber(BufferedReader br) throws Exception
    {
        int sum=0;
        System.out.println("Enter contact number:");
        String number = br.readLine();
        if(number.matches("[1-9]{1}[0-9]{2}-[0-9]{4}-[0-9]{10}")){
        	String nu[]=number.split("-");
        	long n=Long.parseLong(nu[2]);
        	int result=0;
        	while(true){
        		result+=(int) (n%10);
        		n=n/10;
        		if(n==0){
        			n=(long)result;
        			result=0;
        			if(n<9){
        				break;
        			}
        		}
        	}
        	System.out.println("Sum of contact number: "+n);
        }else{
        	System.out.println("Contact number invalid");
        }
	//fill code here.
        
    }
    public  static void userLifeTime(BufferedReader br) throws Exception
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        Date startDate = sdf.parse("28-07-2017 09:00");
        System.out.println("Enter Created on date(dd-MM-yyyy HH:mm):");
        //fill code here.
        String time = br.readLine();
        Date endDate = sdf.parse(time);
        long diff = startDate.getTime()-endDate.getTime();
        long difMin = diff / (60 * 1000);
        System.out.println("Life time is: "+difMin+" minutes");
        
    }
    
}
