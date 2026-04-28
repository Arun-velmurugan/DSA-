
package collectionhomework;

import java.util.Iterator;
import java.util.Set;
import java.util.LinkedHashSet;


public class Set {
    public static void main(String[] args) {
        
        Set<Integer> num = new LinkedHashSet<>();
        num.add(1);
        num.add(10);
        num.add(18);
        num.add(10);
        num.add(17);
        num.add(18);
        
        System.out.println(num);
        
        if(num.contains(18)){
            System.out.println("18 exists in the set");
        }
        else
        {
            System.out.println("18 not found");
        }
        
        num.remove(1);
        System.out.println(num);
        
        Iterator<Integer> it = num.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
