import java.util.*;
public class HashMapDemo1 {
    public static void main(String[] args)
    {
        HashMap<String, Double> h = new HashMap<String, Double>();
        h.put("name 1", 1200.3);
        h.put("name 2", 6200.3);
        h.put("name 3", 1300.3);
        h.put("name 4", 1400.3);
        h.put("name 5", 1400.3);
        Set<Map.Entry<String, Double>> set = h.entrySet(); //converting a hashmap into a set. entrySet() converts into a set.
        //Map is an interface. Entry is a generic function. 
        for(Map.Entry<String, Double> me : set)
        {
            System.out.print(me.getKey() + ": "); //printing is done randomly.
            System.out.println(me.getValue());
        }
        System.out.println();
        double balance = h.get("name 1");
        h.put("name 1", balance + 100);
        System.out.println("name 1 's new balance is " + h.get("name 1"));
    }
    
}
