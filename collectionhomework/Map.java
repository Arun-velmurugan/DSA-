
package collectionhomework;

import java.util.Iterator;
import java.util.Map;
import java.util.LinkedHashMap;

public class Map {
    public static void main(String[] args) {
        
        Map<Integer,String> student = new LinkedHashMap();
        student.put(101,"Arunraj");
        student.put(102,"Surya");
        student.put(103,"Aravinthan");
        
        System.out.println(student.get(101));
        
        student.replace(102,"Vishwa");
        
        student.remove(103);
        
       // Iterator<Map.Entry<Integer,String>> it = student.entrySet().iterator();
        
       for(Map.Entry<Integer,String> entry:student.entrySet()){
           
           System.out.println("ID: "+entry.getKey()+", Name: "+entry.getValue());
        }
    }
}
