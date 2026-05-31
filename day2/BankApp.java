import java.util.*;
import java.util.regex.*;
public class BankApp {
    static HashMap<String,String> patterns= new HashMap<>();
    static{
        patterns.put("name","^[A-Za-z ]{3,}$");
        patterns.put("password","^(?=.*[@#%$!])[A-Za-z0-9?=.@#%$!*]{8,}$");
        patterns.put("aadhaar","^[0-9]{12}$");
        patterns.put("pan","^[A-Z]{5}[0-9]{4}[A-Z]{1}$");
        patterns.put("email","^[a-z0-9-_]{2,}@[a-z]{3,}\\.[a-z]{2,}$");
    }

    static String validate(HashMap<String, String> userData){
        boolean flag= true;
        for(HashMap.Entry<String, String> entry : userData.entrySet()){
            String field = entry.getKey();
            String value= entry.getValue();
            String regex=patterns.get(field);
            if(!Pattern.matches(regex, value)){
                System.out.println("Invalid "+ field);
                flag= false;
            }
        }
        return flag ? "Account created": "Invalid User Data" ;
    }

    public static void main(String[] args) {
        HashMap<String, String> user1= new HashMap<>();
        user1.put("name", "Deepthi Raikar");
        user1.put("password", "Deepthi@123");
        user1.put("aadhaar", "123456789012");
        user1.put("pan", "ABCDE0123Z");
        user1.put("email", "deepthi@gmail.com");

         HashMap<String, String> user2= new HashMap<>();
        user2.put("name", "De");
        user2.put("password", "@123");
        user2.put("aadhaar", "1234567");
        user2.put("pan", "ABCDE012");
        user2.put("email", "deepthi@gmail.n");

        System.out.println(validate(user1));
        System.out.println(validate(user2));
    }
    
}
