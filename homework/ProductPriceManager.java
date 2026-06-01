
package homework;

import java.util.ArrayList;
import java.util.*;


public class ProductPriceManager {
    
    List<Integer> price = new ArrayList<>();
    
    void add(int[] arr,int size,Scanner sc){
       
        for(int i=0;i<size;i++){
            System.out.print("Enter "+i+": ");
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Prices Added to array Successfully!");
    }
    
    void copy(int[] arr){
        
        for(int prices:arr){
            price.add(prices);
        }
        
        System.out.println("Price Copied to ArrayList Successfully!");
    }
    
    void display(){
        
        if(price.isEmpty()){
            System.out.println("List is Empty!");
            return;
        }
        
        for(int prices:price){
            System.out.print("Prices: "+price);
            break;
        }
    }
    
    
    int maximumPrice(){
        int maxPrice = Integer.MIN_VALUE;
        
        if(price.isEmpty()){
            System.out.println("List is Empty!");
            return 0;
        }
        
        for(int prices:price){
            if(prices>maxPrice){
                maxPrice=prices;
            }
                
        }
        return maxPrice;
    }
    
    void removePrice(Scanner sc){
        if(price.isEmpty()){
            System.out.println("List is Empty!");
            return;
        }
        
        System.out.print("Enter remove price: ");
        int removePrice = sc.nextInt();
        
            boolean isFound = false;
            
            Iterator<Integer> it = price.iterator();
            
            while(it.hasNext()){
                
                if(it.next()==removePrice){
                    it.remove();
                    isFound = true;
                 }
            }
        
           if(isFound){
               System.out.println("Price "+removePrice+" removed");
           }
           else{
               System.out.println("Entered Price not found!");
           }
       
    }
}
