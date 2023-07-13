import java.util.*;
public class Counting_freq{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,1,2,2,2,3};
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(h.containsKey(arr[i])){
                h.put(arr[i], h.get(arr[i])+1);  //increment count if element is found.
            }
            else{
                h.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> i : h.entrySet()) //converting h into a set.
        {
            System.out.println(i.getKey() + " " + i.getValue());
        }
    }
}