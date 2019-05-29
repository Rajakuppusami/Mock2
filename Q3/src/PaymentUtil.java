import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
public class PaymentUtil {
 
Map<String,Float> bankTax;
String bankName;
Double amount;
Float discountPercent;
 public Map<String, Float> getBankTax() {
return bankTax;
}
public void setBankTax(Map<String, Float> bankTax) {
this.bankTax = bankTax;
}
public String getBankName() {
return bankName;
}
public void setBankName(String bankName) {
this.bankName = bankName;
}
public Double getAmount() {
return amount;
}
public void setAmount(Double amount) {
this.amount = amount;
}
public Float getDiscountPercent() {
return discountPercent;
}
public void setDiscountPercent(Float discountPercent) {
this.discountPercent = discountPercent;
}
public Double makePayment(Map<String,Float> bankTax,String bankName,Double amount)
 {
Set<Entry<String, Float>> entries= bankTax.entrySet();
String key;
Float value;
Float tax=(float) 0;
for(Entry<String,Float> e : entries)
{
key=e.getKey();
value=e.getValue();
if(key.equalsIgnoreCase(bankName))
{
tax=value;
break;
}
}
Double total=amount+(amount*tax/100);
return total;
 }
public Double makePayment(Double amount)
 {
 Float serviceTax = 5.2f;
 Float vat = 2.3f;
 Double total=(Double) (amount+(amount*serviceTax/100));
 total=total+(total*vat/100);
 return total;
 }
 
 public Double makePayment(Double amount, Float discountPercent)
 {
 Double total=amount-(amount*discountPercent/100);
 return total;
 }
 
}