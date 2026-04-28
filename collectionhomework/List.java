
package collectionhomework;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;


public class List {
    public static void main(String[] args) {
        
        List<Integer> num = new LinkedList<>(Arrays.asList(1,2,4,6,8));
        num.add(2,3);
        num.remove(4);
        num.set(3,5);
        
        Iterator<Integer> it = num.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
