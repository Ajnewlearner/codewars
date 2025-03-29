
import java.util.HashMap;

public class maps {
    public static void main(String[] args) {
        HashMap<String,Integer> Employeeid = new HashMap<>();
        // put can add values as well update them
        Employeeid.put("AJ",6475);
        Employeeid.put("KA",3468);
        Employeeid.put("RR",3456);
        Employeeid.put("DSG",3419);
        System.out.println(Employeeid);
        // get will only work on getting the value via key same goes for contains key
        System.out.println(Employeeid.get("AJ"));
        System.out.println(Employeeid.containsKey("AJ"));
        System.out.println(Employeeid.containsValue(6475));
    }
}
