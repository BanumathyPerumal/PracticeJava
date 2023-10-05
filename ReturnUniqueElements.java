package javaproject.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Iterator;
import java.util.Arrays;
import java.util.HashMap;


public class ReturnUniqueElements {
    //take the input from the user like this kind of elements[1,2,3,1,5,1,5,5,5]
    //and get the output by removing the duplicates (output like [2,3])
public static int[] array = new int[] {1,2,3,1,5,1,5,5,5};
public static void main(String[] args) {
    int[] output = uniqueElements(array);
    System.out.println(Arrays.toString(output));
}
public static int[] uniqueElements(int[] array){
    Map<Integer, Integer> map = new HashMap<>();
    for(int i: array){
        if(map.containsKey(i))  map.put(i, map.get(i)+1);
        else map.put(i,1);
    }
    Iterator iterator = map.entrySet().iterator();
    while(iterator.hasNext()){
        Entry<Integer,Integer> element = (Entry)iterator.next();
        Integer val = element.getValue();
        if(val > 1){
            System.out.println("removing "+element.getKey());
            iterator.remove();
        }
    }
    int[] output = new int[map.size()];
    int i=0;
    for(Integer keyNum: map.keySet()){
        output[i] = keyNum;
        i++;
    }
    return output;    
}  
}

