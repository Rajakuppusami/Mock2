import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of customer:");
        int n = new Integer(br.readLine());
        
        List<String> csvList = new ArrayList<>();
        
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the customer "+(i+1)+" details:");

            //fill code here.

        }

        //fill code here.

        System.out.println("State - No of customers");

        //fill code here.

        System.out.format("%-15s %-20s %-15s %-15s %s\n", "Id","Name","Email","State","Country");
        
	//fill code here.

    }
    
}
