import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class _1207 {
    HashMap<Integer,Integer> occurrences = new HashMap<Integer,Integer>();
    Set<Integer> uniqueOccurrences = new HashSet<Integer>();
    

    public boolean uniqueOccurrences(int[] arr) {
        initializeOccurrences(arr);
        for (int v: occurrences.values()) {
            if(uniqueOccurrences.contains(v)) return false;
            uniqueOccurrences.add(v);
        }
        return true;
    }
    
    private void initializeOccurrences(int[] arr) {
        for(int i = 0; i<arr.length; i++) {
            if (!occurrences.containsKey(arr[i])) {
                occurrences.put(arr[i], 1);
            } else {
                occurrences.put(arr[i],occurrences.get(arr[i])+1);
            }
        }
    }
}
