import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    static Float discount = 20.2f;
    static Map<String, Float> onlineBanking;
    static
    {
        onlineBanking = new HashMap<>();
        onlineBanking.put("ICICI", 4.2f);
        onlineBanking.put("IBRD", 3f);
        onlineBanking.put("IFC", 4.9f);
        onlineBanking.put("HSBC", 3.9f);
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Double amount;
        
        Double totalPayment;
        PaymentUtil paymentUtil = new PaymentUtil();
        String userName,password;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("1. Online banking\n").append("2. Credit card\n").append("3. Wallet\n")
                .append("Enter the choice:");
        System.out.println(stringBuilder.toString());
        Integer choice = new Integer(br.readLine());
        switch(choice)
        {
            case 1:
                
                System.out.println("Enter the user name:");
                userName = br.readLine();
                System.out.println("Enter the password:");
                password = br.readLine();
                System.out.println("Enter the amount:");
                amount = new Double(br.readLine());
                System.out.println("Enter the bank name:");
                String bankName = br.readLine();
                //fill code here.
                System.out.printf("Total amount(Inclusive of Service Tax): %.2f",paymentUtil.makePayment(onlineBanking, bankName, amount));
                break;
            case 2:
                String accNo;
                Integer pin;
                System.out.println("Enter the account number:");
                accNo = (br.readLine());
                System.out.println("Enter the pin:");
                pin = new Integer(br.readLine());
                System.out.println("Enter the amount:");
                amount = new Double(br.readLine());
                //fill code here.
                System.out.printf("Total amount(Inclusive of Service Tax and VAT): %.2f",paymentUtil.makePayment(amount));
                break;
            case 3:
               System.out.println("Enter the user name:");
                userName = br.readLine();
                System.out.println("Enter the password:");
                password = br.readLine();
                System.out.println("Enter the amount:");
                amount = new Double(br.readLine());
                System.out.printf("Discounted amount: %.2f",paymentUtil.makePayment(amount, discount));
                //fill code here.
                break;
        }
    }
    
}
