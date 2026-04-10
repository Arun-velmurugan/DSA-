
package product;


public class ShoppingCart {
    Product head;
    
    void addProduct(int productId,String productName,double price)
    {
        Product newProduct = new Product(productId,productName,price);
        if(head==null)
        {
            head = newProduct;
        }
        else
        {
            Product temp = head;
            while(temp.next!=null)
            {
               temp = temp.next;
            }
            temp.next = newProduct;
        }
    }
    
    void display()
    {
        Product temp = head;
        while(temp!=null)
        {
            System.out.println("Prouduct ID: "+temp.productId);
            System.out.println("Product Name: "+temp.productName);
            System.out.println("Price: "+temp.price);
            
            temp = temp.next;
        }
    }
}
